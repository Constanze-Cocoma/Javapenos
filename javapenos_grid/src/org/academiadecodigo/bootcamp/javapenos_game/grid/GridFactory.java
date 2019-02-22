package org.academiadecodigo.bootcamp.javapenos_game.grid;

public class GridFactory {

    /**
     * Creates a new grid
     *
     * @param gridType   the type of grid to create
     * @param width      the width in pixels
     * @param height     the height in pixels
     * @return the new grid
     */
    public static StartGrid makeGrid(GridType gridType, int width, int height) {

        switch (gridType) {
            case START:
                return new StartGrid(width,height);
                break;
            case PLAY:
                return new PlayGrid(width, height);
                break;
            case END:
                return new EndGrid(width, height);
        }

    }

}
