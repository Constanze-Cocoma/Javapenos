package src.org.academiadecodigo.bootcamp.javapenos_game;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Position {

    // tirei a grid porque achei que nao fazia falta
    private double x; // pixel
    private double y; // pixel


    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
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
