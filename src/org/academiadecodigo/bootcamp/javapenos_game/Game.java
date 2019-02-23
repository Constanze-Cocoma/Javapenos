package src.org.academiadecodigo.bootcamp.javapenos_game;

public class Game {

    private Grid startGrid;
    private Grid gameGrid;
    private Javapeno[] javapenos;
    private int delay;
    private int totalJavapenos;
    private int totalPoints;

    public Game(int totalJavapenos) {
        startGrid = new StartGrid(10, 576, 768);
        delay = 50;
        ((StartGrid) startGrid).startInit();
    }

    public void init() throws InterruptedException {
        gameGrid = new GameGrid(10, 576, 768);
        javapenos = new Javapeno[totalJavapenos];
        for (int i = 0; i < totalJavapenos; i++) {
            javapenos[i] = JavapenoFactory.getNewJavapeno();
            //Thread.sleep(500); //falta try catch
            start();

        }
    }

    public void start() throws InterruptedException {
        while (true) {
            Thread.sleep(500);
            moveJavapenos();
        }
    }

    public void moveJavapenos() {
        for (Javapeno j: javapenos) {
            j.move();
        }
    }


}
