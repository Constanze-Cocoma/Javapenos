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

    public void addPoint() {
        totalPoints = totalPoints + 1;
    }

    public void subtractPoint() {
        totalPoints = totalPoints - 1;
    }

    public int getJavapenosLeft() {
        return javapenosLeft;
    }

    public void subtractJavapenosLeft() {
        javapenosLeft = javapenosLeft - 1;
    }



}



