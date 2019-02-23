package src.org.academiadecodigo.bootcamp.javapenos_game;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class StartGrid extends Grid {

    public StartGrid(int PADDING, int width, int height) {
        super(PADDING, width, height);
        //Rectangle canvas = new Rectangle(PADDING, PADDING, width, height);
        //canvas.draw();
    }

    public void startInit() {
        Picture backImage = new Picture(FX_PADDING, FX_PADDING, "pedra-deslizante_576x768.png");
        Picture middleImage = new Picture(FX_PADDING, FX_PADDING, "muro_576x768.png");
        Picture frontImage = new Picture(PADDING, PADDING, "enfeites.png");
        backImage.draw();
        middleImage.draw();
        frontImage.draw();
    }


}

