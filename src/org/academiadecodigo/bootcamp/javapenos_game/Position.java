package src.org.academiadecodigo.bootcamp.javapenos_game;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Position {

    private Rectangle rectangle;
    private StartGrid startGrid;
    private static final double JAVASIZE = 10;
    private double x;
    private double y;


    public Position(double x, double y, StartGrid startGrid) {
        this.startGrid = startGrid;
        this.x = x;
        this.y = y;
        this.rectangle = new Rectangle(x, y, 60, 80);
        show();
    }


    public void show() {
        rectangle.fill();
    }


    public void hide() {

        rectangle.delete();
    }


    public void moveDown(double goY) {
        double moveY = Math.abs(goY - y);

        while (y < startGrid.getHeight()) {

            rectangle.translate(0, 10);
        }


    }

}
