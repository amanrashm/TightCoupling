package org.example;

import org.example.game.GameRunner;
import org.example.game.MarioGame;
import org.example.game.SuperContra;

public class Main {
    public static void main(String[] args) {
        /*var marioGame = new MarioGame();*/
        var superContra = new SuperContra();
        /*var gameRunner = new GameRunner(marioGame);*/
        var gameRunner = new GameRunner(superContra);
        gameRunner.run();
    }
}