package org.example.applyingSpringToGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.example.looseCoupling.GameRunner;
import org.example.looseCoupling.PacManGame;
import org.example.looseCoupling.GameConsole;
@Configuration
public class GameConfiguration {
    @Bean
    public PacManGame gamingConsole() {
        var packMan = new PacManGame();
        return packMan;
    }

    @Bean
    public GameRunner gameRunner(GameConsole gameConsole) {
        var gameRunner = new GameRunner() {


            @Override
            public void up() {
                System.out.println("Up");
            }

            @Override
            public void down() {
                System.out.println("Down");
            }

            @Override
            public void left() {
                System.out.println("Left");
            }

            @Override
            public void right() {
                System.out.println("Right");
            }

            @Override
            public void run() {

            }
        };
        return gameRunner;
    }
}