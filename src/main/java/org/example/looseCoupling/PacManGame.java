package org.example.looseCoupling;

public class PacManGame implements GameRunner{
    /**
     *
     */
    @Override
    public void up() {
        System.out.println("up");
    }

    /**
     *
     */
    @Override
    public void down() {
        System.out.println("down");
    }

    /**
     *
     */
    @Override
    public void left() {
        System.out.println("left");
    }

    /**
     *
     */
    @Override
    public void right() {
        System.out.println("right");
    }

    @Override
    public void run() {

    }
}