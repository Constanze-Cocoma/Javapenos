package org.academiadecodigo.bootcamp;

public class CollisionDetector {

    private Javapeno[] javapenos;
    private Player player;
    private boolean collision;

    public CollisionDetector(Javapeno[] javapenos, Player player) {
        this.javapenos = javapenos;
        this.player = player;
    }


    public void checkCollision(Javapeno javapeno, Player player) {

        if (javapeno.getPosition().equals(player.getPosition())) {
            collision = true;
        }
    }

    public boolean getCollision( ){
        return collision;
    }

    public void setCollision() {
        collision = false;
    }

}
