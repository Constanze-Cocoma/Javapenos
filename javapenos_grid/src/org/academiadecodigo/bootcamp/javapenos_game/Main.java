package org.academiadecodigo.bootcamp.javapenos_game;

import org.academiadecodigo.bootcamp.javapenos_game.grid.StartGrid;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Main {
  public static void main(String[] args) {




    StartGrid startGrid = new StartGrid(576, 768);

    startGrid.init();


    Picture fundo = new Picture(10, 10,"fundo_576x768.png");

    fundo.draw();

    Picture muro = new Picture(10,10,"muro_576x768.png");

    muro.draw();


    
  }
}
