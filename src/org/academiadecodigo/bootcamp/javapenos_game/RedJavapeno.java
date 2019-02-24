package src.org.academiadecodigo.bootcamp.javapenos_game;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class RedJavapeno extends Javapeno {

    private int speed; // quantos pixeis o javapeno "desce" em cada translate
    private Picture picture;
    private Position position;
    private int x; // posição do javapeno eixo x
    private int y; // posição do javapeno eixo y
    private int num = Randomizer.chooseNumber(60, 500);
    private GameGrid gameGrid;


    public RedJavapeno() {
        this.picture = new Picture(num,Grid.PADDING * 6,"resources/javapeños-red2_58x58.png");
        this.position = new Position(num, Grid.PADDING * 6);
        this.speed = 30;
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
