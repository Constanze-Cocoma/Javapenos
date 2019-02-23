package src.org.academiadecodigo.bootcamp.javapenos_game;


import org.academiadecodigo.simplegraphics.pictures.Picture;

abstract public class Javapeno {

    private double speed;
    private Picture picture;
    private Position position;
    private GameGrid gameGrid;
    private double x; // posição do javapeno eixo x
    private double y; // posição do javapeno eixo y
    private double num = Randomizer.chooseNumber(60, 560);


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public abstract void move();

}
