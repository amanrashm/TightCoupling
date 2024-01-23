package org.example.game;

public class GameRunner {
    MarioGame marioGame;
    SuperContra superContra;

    /*public GameRunner(MarioGame marioGame) {
        this.marioGame = marioGame;
    }*/

    public GameRunner(SuperContra superContra) {
        this.superContra = superContra;
    }

    public void run() {
        /*System.out.println("Starting the game..."+ marioGame);
        marioGame.up();
        marioGame.down();
        marioGame.left();
        marioGame.right();*/

        System.out.println("Starting the game..."+ superContra);
        superContra.up();
        superContra.down();
        superContra.left();
        superContra.right();
    }
}
