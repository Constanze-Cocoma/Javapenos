package org.academiadecodigo.bootcamp.javapenos_game;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Main {
  public static void main(String[] args) {

    Grid grid = new Grid(576, 768);

    //Position pos = new Position(10, 10, grid);

    Picture background = new Picture(10, 10, "fundo_576x768.png");

    background.draw();

    grid.init();

    //pos.moveDown(50);

    //pos.moveDown(50);



    //Position pos2 = new Position(100, 10, grid);

    //pos2.moveDown(30);
    //pos2.moveDown(30);


    Keyboard keyboard = new Keyboard();

    keyboard.draw();

    keyboard.test();



    
  }
}
