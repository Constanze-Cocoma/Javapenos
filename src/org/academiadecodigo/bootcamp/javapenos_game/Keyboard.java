package org.academiadecodigo.bootcamp.javapenos_game;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;


// temos ainda que corrigir o facto de a imagem ultrapassar os limites do grid


public class Keyboard implements KeyboardHandler {

    Picture pic = new Picture(194, 188, "boneco_194x188.png");

    org.academiadecodigo.simplegraphics.keyboard.Keyboard kb = new org.academiadecodigo.simplegraphics.keyboard.Keyboard(this);


    public void draw() {

        pic.draw();

    }

    public void test()  {


        addEventToKeyboard(KeyboardEvent.KEY_SPACE, KeyboardEventType.KEY_PRESSED);
        addEventToKeyboard(KeyboardEvent.KEY_UP, KeyboardEventType.KEY_PRESSED);
        addEventToKeyboard(KeyboardEvent.KEY_DOWN, KeyboardEventType.KEY_PRESSED);
        addEventToKeyboard(KeyboardEvent.KEY_RIGHT, KeyboardEventType.KEY_PRESSED);
        addEventToKeyboard(KeyboardEvent.KEY_LEFT, KeyboardEventType.KEY_PRESSED);

    }


    private void addEventToKeyboard(int keySpace, KeyboardEventType keyPressed) {
        KeyboardEvent event = new KeyboardEvent();
        event.setKey(keySpace);
        event.setKeyboardEventType(keyPressed);
        kb.addEventListener(event);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_SPACE:
                // add behaviour for space key later on (start game for example)
                break;
            case KeyboardEvent.KEY_DOWN:
                pic.translate(0,30);
                break;
            case KeyboardEvent.KEY_UP:
                pic.translate(0, -30);
                break;
            case KeyboardEvent.KEY_RIGHT:
                pic.translate(30, 0);
                break;
            case KeyboardEvent.KEY_LEFT:
                pic.translate(-30, 0);
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }



}
