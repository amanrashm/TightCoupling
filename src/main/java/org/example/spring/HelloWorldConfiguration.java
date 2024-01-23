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


    // What is there is relationship between 2 beans?
    @Bean
    public Person person () {
        var person = new Person("Aman Raj", 24, "Bihar");
        return person;
    }
    @Bean
    public Person person1 () {
        var person = new Person(name(), age(), address());// as we already have beans for name, age and address
        // I want to create a new bean relation with existing Spring beans how can I do this ? 1. call the method name() and age() and address()
        // and pass the return value to the constructor of Person class. 2.
        return person;
    }

    @Bean
    public Address address1 () {
        var address = new Address("Patna", "Bihar", "India");
        return address;
    }
}