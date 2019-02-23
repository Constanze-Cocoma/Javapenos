package src.org.academiadecodigo.bootcamp.javapenos_game;

public class Counter {

    private int totalPoints;
    private int javapenosLeft;


    public Counter(int javapenosLeft) {
        totalPoints = 0;
        this.javapenosLeft = javapenosLeft;
    }




    public int getPoints() {
        return totalPoints;
    }

    public void setPoints(int points) {
        totalPoints = totalPoints + points;
    }

    public int getJavapenosLeft() {
        return javapenosLeft;
    }

    public void setJavapenosLeft(int javapenosGone) {
        javapenosLeft = javapenosLeft - javapenosGone;
    }



}
