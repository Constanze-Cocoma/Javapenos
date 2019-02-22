package src.org.academiadecodigo.bootcamp.javapenos_game;

public interface Grid {

    /**
     * Initializes the grid
     */
    public void init();

    /**
     * Gets the width in pixels of the grid
     *
     * @return width in pixels
     */
    public int getWidth();

    /**
     * Gets the height in pixels of the grid
     *
     * @return height in pixels
     */
    public int getHeight();

    /**
     * Create a random grid position
     *
     * @return the new grid position
     */
    //public GridPosition makeGridPosition();

    /**
     * Creates a a grid position in a specific x and y
     *
     * @param x   the position in x axis
     * @param y   the position in y axis
     * @return the new grid position
     */
    //public GridPosition makeGridPosition(int x, int y);

}
