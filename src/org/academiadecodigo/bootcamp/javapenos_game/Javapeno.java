package src.org.academiadecodigo.bootcamp.javapenos_game;


import org.academiadecodigo.simplegraphics.pictures.Picture;

abstract public class Javapeno {

    //private FieldPosition pos;
    //private Field field;
    
    //acrescentar método move 
    private int speed;
    private Picture picture;


    public void setSpeed(int speed) {
        this.speed = speed;
    }

   public abstract void move();

}
