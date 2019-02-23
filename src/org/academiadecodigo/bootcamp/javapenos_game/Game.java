package src.org.academiadecodigo.bootcamp.javapenos_game;

public class Game {

    private Grid startGrid;
    private Grid playGrid;
    private Grid endGrid;
    private Counter counter;
    private Javapeno[] javapenos;
    private int delay;
    private int numberJavapenos;
    private int points; //check for collisions (red or green): green +1/ red -1;
    // counter: show counter in playGrid (real time) or show final points on endGrid
    // print result to screen with TEXT (simplegfx)
    // maybe create new class "counter"

    public Game(int numberJavapenos) {
        delay = 50; //whatever that means :)
        this.numberJavapenos = numberJavapenos; //choose no javapenos for each game(?)
        counter = new Counter(numberJavapenos);
        startGrid.init();
    }

    public void init() {
        playGrid.init();
        javapenos = new Javapeno[numberJavapenos];
        for (int i = 0; i < numberJavapenos ; i++) {
            javapenos[i] = JavapenoFactory.getNewJavapeno();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        moveJavapenos();
    }

    public void moveJavapenos() {
        for (Javapeno j: javapenos) {
            //j.move(); //missing method in abstract class javapeno
        }
    }

    public void start() throws InterruptedException {
        while (true) {
            Thread.sleep(delay);
            moveJavapenos();
        }
    }

    public void countPoints() {
        // if collisionDetector detects green collision)
        // points = points + 1;
        // if
        // (collisionDetector detects red collision)
        // points = points - 1;
    }

    public int getPoints() {
        return points;
    }

}


