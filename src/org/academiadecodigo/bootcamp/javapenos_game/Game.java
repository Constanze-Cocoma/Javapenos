package src.org.academiadecodigo.bootcamp.javapenos_game;

public class Game {

    private StartGrid startGrid;
    private GameGrid gameGrid;
    private EndGrid endGrid;
    private Javapeno[] javapenos;
    private Counter counter;
    private int delay; // o game ainda precisa dume referência ao delay?
    private int totalJavapenos;
    private int totalPoints;

    public Game(int totalJavapenos) {
        startGrid = new StartGrid(10, 576, 768);
        delay = 50; //where is delay used???
        this.totalJavapenos = totalJavapenos;
        ((StartGrid) startGrid).startInit();
    }

    public void init() throws InterruptedException {
        gameGrid = new GameGrid(10, 576, 768);
        javapenos = new Javapeno[totalJavapenos];
        counter = new Counter(totalJavapenos);
        for (int i = 0; i < totalJavapenos; i++) {
            javapenos[i] = JavapenoFactory.getNewJavapeno();
            counter.subtractJavapenosLeft();
            try {
                Thread.sleep(500); //falta try catch
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        start();
    }

    private void start() throws InterruptedException {
        while (counter.getJavapenosLeft() > 0) {
            Thread.sleep(500);
            moveJavapenos();
            //call method to count javapenos caught (collision detector)
            //collisionDetector.
            //add if-statement to check for javapenos left and call end() if 0 javapenos left
        }
        //if (counter.getJavapenosLeft() == 0 && //) {
        end();
    }


    public void moveJavapenos() {
        for (Javapeno j : javapenos) {
            j.move();
        }
    }

    public void end() {
        // print total score to screen
        // go back to start grid
    }

    public void countScore() {
        //Collision Detector - check for collisions with player
        //if(collision with green javapeno) {
        // counter.addPoint();
        // if (collision with red javapeno) {
        // counter.subtractPoint();
    }


    public void countJavapenos() {
    //collision detector - check for collisions with player and floor
        //counter.subtractJavapenosLeft();
    }


}


