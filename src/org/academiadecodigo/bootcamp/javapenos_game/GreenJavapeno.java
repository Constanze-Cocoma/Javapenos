package src.org.academiadecodigo.bootcamp.javapenos_game;


import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

public class GreenJavapeno extends Javapeno {

    private double speed; // quantos pixeis o javapeno "desce" em cada translate
    private Picture picture;
    private Position position;
    private double x; // posição do javapeno eixo x
    private double y; // posição do javapeno eixo y
    private double num = Randomizer.chooseNumber(60, 500);
    private GameGrid gameGrid;




    public GreenJavapeno()  {
        this.picture = new Picture(num, Grid.PADDING * 6, "resources/javapeños-green2_58x58.png");
        this.position = new Position(num, Grid.PADDING * 6);
        this.speed = 20;
        picture.draw();
    }



    @Override
    public void move() {
        while (position.getY() != gameGrid.getHeight() /* acrescentar condição quando o colision detector deteta uma colisão */) {
            picture.translate(0, speed);
            position.setY(position.getY() + speed); // atualiza a posição do javapeno

            //  colision detector
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        picture.delete(); // apaga o javapeno quando bate no chao
    }


}
