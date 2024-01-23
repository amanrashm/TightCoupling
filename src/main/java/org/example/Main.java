package org.example;

import org.example.tightCoupling.GameRunner;
import org.example.tightCoupling.SuperContra;

public class Main {
    public static void main(String[] args) {
        /*var marioGame = new MarioGame();*/
        var superContra = new SuperContra();
        /*var gameRunner = new GameRunner(marioGame);*/
        var gameRunner = new GameRunner(superContra);
        gameRunner.run();
    }
}