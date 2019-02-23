package src.org.academiadecodigo.bootcamp.javapenos_game;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public abstract class Grid {

    public static final int PADDING = 10;
    public static final int FX_PADDING = 100;

    private int width; // mudar para static final quando soubermos as medidas
    private int height;



    public Grid(int PADDING, int width, int height) {
        this.width = width;
        this.height = height;
        Rectangle canvas = new Rectangle(PADDING, PADDING, width, height);
        canvas.draw();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}