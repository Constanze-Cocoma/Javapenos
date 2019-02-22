package org.academiadecodigo.bootcamp.javapenos_game;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Main {
  public static void main(String[] args) {

    Grid grid = new Grid(576, 768);

    //Position pos = new Position(10, 10, grid);

    Picture background = new Picture(10, 10, "fundo com muro_576x768.png");
    Picture javapenoRed = new Picture(60, 60, "javapeños-red2_58x58.png");
    Picture javapenoGreen = new Picture(120, 60, "javapeños-green2_58x58.png");

    background.draw();

    Keyboard keyboard = new Keyboard();

    keyboard.draw();

    keyboard.test();

    javapenoRed.draw();


    try {

      while(true) {
        javapenoRed.translate(0, 40);
        Thread.sleep(100);
        javapenoGreen.draw();

        javapenoGreen.translate(0, 40);
        Thread.sleep(100);
      }





    } catch (InterruptedException ex) {
      System.err.println(ex.getMessage());
    }




    grid.init();

    //pos.moveDown(50);

    //pos.moveDown(50);



    //Position pos2 = new Position(100, 10, grid);

    //pos2.moveDown(30);
    //pos2.moveDown(30);




    
  }
}
