package src.org.academiadecodigo.bootcamp.javapenos_game;


import org.academiadecodigo.simplegraphics.pictures.Picture;

public class JavapenoFactory {

    public static Javapeno getNewJavapeno() {

        int random = (int) Math.floor(Math.random() * (10));

        if(random < 3) {

            return new RedJavapeno();
        }
        if(random >= 3) {

            return new GreenJavapeno();
        }

        System.out.println("not a valid javapeno type");
        return null;

    }


}
