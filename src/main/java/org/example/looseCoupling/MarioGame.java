package org.example.looseCoupling;

public class MarioGame implements GameRunner {
    @Override
    public void up() {
        System.out.println("Jumping up");
    }

    @Override
    public void down() {
        System.out.println("Go to the hole");
    }

    @Override
    public void left() {
        System.out.println("Go back");
    }

    @Override
    public void right() {
        System.out.println("Accelerate");
    }

    /**
     * @param marioGame
     */
    @Override
    public void run(MarioGame marioGame) {

    }

    /**
     * @param superContra
     */
    @Override
    public void run(SuperContra superContra) {

    }
}
