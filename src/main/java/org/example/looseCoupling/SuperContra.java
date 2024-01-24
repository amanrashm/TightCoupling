package org.example.looseCoupling;

public class SuperContra implements GameRunner{
    @Override
    public void up() {
        System.out.println("up");
    }

    @Override
    public void down() {
        System.out.println("Sit down");
    }

    @Override
    public void left() {
        System.out.println("Go back");
    }

    @Override
    public void right() {
        System.out.println("Shoot a bullet");
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

    @Override
    public void run() {

    }
}