package src.org.academiadecodigo.bootcamp.javapenos_game;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class EndGrid extends Grid {

    private Text score;
    //private Counter counter;

    public EndGrid(int PADDING, int width, int height) {
        super(PADDING, width, height);
        //Rectangle canvas = new Rectangle(PADDING, PADDING, width, height);
        //canvas.draw();
    }

    public void endInit() {
        Picture backImage = new Picture(FX_PADDING, FX_PADDING, "fundo_576x768.png");
        Picture middleImage = new Picture(FX_PADDING, FX_PADDING, "muro_576x768.png");
        Picture frontImage = new Picture(PADDING, PADDING, "enfeites.png");
        backImage.draw();
        middleImage.draw();
        frontImage.draw();


        //counter.getTotalPoints();

        Text score = new Text(350, 200, "Final score: " + 100);
        score.grow(50, 50);

        Text message = new Text(380, 300, "Muy caliente!!");
        message.grow(100, 50);


        score.draw();
        message.draw();
    }
}
