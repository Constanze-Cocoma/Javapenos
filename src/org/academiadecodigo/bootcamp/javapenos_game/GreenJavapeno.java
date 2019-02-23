package src.org.academiadecodigo.bootcamp.javapenos_game;


import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

public class GreenJavapeno extends Javapeno {


    //public GreenJavapeno() {setSpeed(50); // adapt definition of speed later on, after defining pixels and cellsize}

    private Picture picture;

    int num = Randomizer.chooseNumber(60, 560);


    public GreenJavapeno()  {
        this.picture = new Picture(num, 0, "resources/javapeños-green2_58x58.png");
        picture.draw();
        move();
    }

    @Override
    public void move() {
        while (true) {
            picture.translate(0, 20);

            //  colision detector
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


}
