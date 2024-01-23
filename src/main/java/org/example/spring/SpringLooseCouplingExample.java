package org.example.spring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class SpringLooseCouplingExample {
    public static void main(String... args)throws Exception {
        System.out.println("Hello World Spring App!!!");
        // 1. Launch the Spring Application Context
        //    ApplicationContext context = SpringApplication.run(SpringLooseCouplingExample.class, args);

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        // 2. Configure Thnigs needed for the application to run
        // 3. Get the beans from the context and use them
        // 4. Retrieving a bean managed by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("address"));
        System.out.println(context.getBean("person"));
        // pass the method name as a parameter in getBean() method.
        // All the beans are managed by Spring. and are independent
        System.out.println(context.getBean("address1"));
    }
}