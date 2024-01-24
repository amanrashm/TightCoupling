package org.example.looseCoupling;

public interface GameConsole {
    public static void main(String[] args) {
        GameRunner gameRunner = new GameRunner() {
            /**
             *
             */
            @Override
            public void up() {

            }

            /**
             *
             */
            @Override
            public void down() {

            }

            /**
             *
             */
            @Override
            public void left() {

            }

            /**
             *
             */
            @Override
            public void right() {

            }

            /**
             * @param marioGame
             */
            @Override
            public void run(MarioGame marioGame) {
                System.out.println("Starting the game..."+ marioGame);
                marioGame.up();
                marioGame.down();
                marioGame.left();
                marioGame.right();

            }

            /**
             * @param superContra
             */
            @Override
            public void run(SuperContra superContra) {
                System.out.println("Starting the game..."+ superContra);
                superContra.up();
                superContra.down();
                superContra.left();
                superContra.right();

            }

            /**
             * @param pacManGame
             */
            @Override
            public void run(PacManGame pacManGame) {
                System.out.println("Starting the game..."+ pacManGame);
                pacManGame.up();
                pacManGame.down();
                pacManGame.left();
                pacManGame.right();

            }

            @Override
            public void run() {

            }
        };
        gameRunner.run(new MarioGame());
        gameRunner.run(new SuperContra());
        gameRunner.run(new PacManGame());
    } 
}