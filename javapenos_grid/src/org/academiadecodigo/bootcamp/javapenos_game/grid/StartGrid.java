package org.academiadecodigo.bootcamp.javapenos_game.grid;

import org.academiadecodigo.bootcamp.javapenos_game.Position;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class StartGrid implements Grid {

     private int width;
     private int height;
     public static final int PADDING = 10;

     private Rectangle canva;
     private Picture backImage;
     private Picture middleImage;
     private Picture frontImage;

     /**
     * Simple graphics grid constructor with a certain number of pixel width and height
     *
     * @param width  width in pixels
     * @param height height in pixels
     */
     public StartGrid(int width, int height) {
          this.width = width;
          this.height = height;
     }

    /**
     * Initializes the grid
     */
    @Override
     public void init() {
          this.canva = new Rectangle (PADDING, PADDING, getWidth(), getHeight());
          this.canva.draw();
     }


    /**
     * Create a random grid position
     *
     * @return the new grid position
     */
    //public GridPosition makeGridPosition();


        /**
     * Creates a a grid position in a specific column and row
     *
     * @param col   the position column
     * @param row   the position row
     * @return the new grid position
     */
     //public GridPosition makeGridPosition(int col, int row);

    public Position makeGridPosition(int x, int y) {
        return //retornar uma grip position com (x, y, this grid)
    }


     public int getWidth() {
          return width;
     }

     public int getHeight() {
          return height;
     }

}
