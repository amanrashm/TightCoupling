package org.example.applyingSpringToGame;
import org.example.looseCoupling.GameConsole;
import org.example.looseCoupling.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class SpringGame3 {
    public static void main(String... args) {
        // This is called try with Resources and it will automatically close the context
        try (var context = new AnnotationConfigApplicationContext(GameConfiguration.class)) {
            context.getBean(GameConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}