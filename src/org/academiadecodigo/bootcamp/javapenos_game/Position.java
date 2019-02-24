package src.org.academiadecodigo.bootcamp.javapenos_game;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Position {

    private GameGrid gameGrid;
    private int x; // pixel
    private int y; // pixel


    public Position(int x, int y, GameGrid gameGrid) {
        this.x = x;
        this.y = y;
        this.gameGrid = gameGrid;
    }

    public  Position (int x, int y) {
        this.x= x;
        this.y= y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

/*
    public void moveDown(double goY) {
        double moveY = Math.abs(goY - y);

        while (y < gameGrid.getHeight()) {

            rectangle.translate(0, 10);
        }

    }
    */

}
