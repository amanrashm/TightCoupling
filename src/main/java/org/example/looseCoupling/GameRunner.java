package org.example.looseCoupling;

public interface GameRunner {
    public void up();

    public void down();

    public void left();
    
    public void right();

    default void run(MarioGame marioGame) {

    }
    default void run(SuperContra superContra) {

    }
    default void run(PacManGame pacManGame) {

    }

    void run();
}