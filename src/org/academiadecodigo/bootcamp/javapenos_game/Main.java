package src.org.academiadecodigo.bootcamp.javapenos_game;


import org.academiadecodigo.simplegraphics.pictures.Picture;

import javax.swing.plaf.TableHeaderUI;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

    Picture picture = new Picture(10, 10 , "resources/fundo com muro_576x768.png");
    picture.draw();

    //GameGrid gameGrid = new GameGrid(10,600, 600);

    GreenJavapeno greenJavapeno = new GreenJavapeno();
    greenJavapeno.move();

    }
}
