package src.org.academiadecodigo.bootcamp.javapenos_game;


import org.academiadecodigo.simplegraphics.pictures.Picture;

abstract public class Javapeno {

    private int speed;
    private Picture picture;
    private Position position;
    private GameGrid gameGrid;
    public static final int CELL_SIZE = 58;
    private int x; // posição do javapeno eixo x
    private int y; // posição do javapeno eixo y
    private int num = Randomizer.chooseNumber(60, 560);


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract void move();

}
