package org.example.spring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// @Configuration annotation is used to mark a class as a source of bean definitions for the application context.
// @Bean annotation is used to mark a method as a bean definition method.
// @Bean annotation works with @Configuration annotation.
// @Bean annotation tells Spring that a method annotated with @Bean will return an object that should be registered as a bean in the Spring application context.
// @Bean annotation is a method-level annotation and it works with @Configuration annotation.
// @Bean annotation supports both Java-based and XML configuration.

// record class consists of getter-setter methods or you can say it is a class consists of private methods and All required constructor.
// record class is immutable.
// record class is final by default.
// record class is a final class.
// record class is a final class and it can not be extended.

record Person(String name, int age, String address) {}

record Address(String city, String state, String country) {}
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name () {
        return "Aman Raj";
    }

    @Bean
    public int age () {
        return 24;
    }

    @Bean
    public String address () {
        return "Bihar";
    }

    @Bean
    public Person person () {
        var person = new Person("Aman Raj", 24, "Bihar");
        var person1 = new Person("Aman Raj", 25, "Bihar");
        var person2 = new Person("Aman Raj", 26, "Bihar");
        return person;
    }

    @Bean
    public Address address1 () {
        var address = new Address("Patna", "Bihar", "India");
        return address;
    }
}