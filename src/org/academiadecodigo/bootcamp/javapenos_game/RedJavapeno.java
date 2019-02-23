package src.org.academiadecodigo.bootcamp.javapenos_game;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class RedJavapeno extends Javapeno {

    //public RedJavapeno() {setSpeed(80); // adapt definition of speed later on, after defining pixels and cellsize

    private Picture picture;


    int num = Randomizer.chooseNumber(60,560);


    public RedJavapeno() {
        this.picture = new Picture(num,0,"resources/javapeños-red2_58x58.png");
        picture.draw();
        move();
    }

    @Override
    public void move(){
        while (true) {
            picture.translate(0,20);

            //  colision detector
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
