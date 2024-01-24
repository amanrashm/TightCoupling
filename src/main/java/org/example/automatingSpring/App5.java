package org.example.automatingSpring;

import org.example.applyingSpringToGame.GameConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App5 {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GameConfiguration.class)) {

        }
    }
}
