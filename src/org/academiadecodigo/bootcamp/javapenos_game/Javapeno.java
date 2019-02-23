package src.org.academiadecodigo.bootcamp.javapenos_game;


import org.academiadecodigo.simplegraphics.pictures.Picture;

abstract public class Javapeno {

    //private FieldPosition pos;
    //private Field field;

    //acrescentar método move 
    private int speed;
    private Picture picture;
    private Position position;
    private double x; // posição do javapeno eixo x
    private double y; // posição do javapeno eixo y
    private int num = Randomizer.chooseNumber(60, 560);


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public abstract void move();

}
