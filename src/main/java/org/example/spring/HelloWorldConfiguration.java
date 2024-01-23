package org.example.spring;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
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

record Person(String name, int age, String address, Address address2) {}

record Address(String city, String state, String country) {}
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name () {
        return "Aman Raj";
    }

    @Bean
    public int age () {
        return 25;
    }

    @Bean
    public String address () {
        return "Baker Street London";
    }


    // What is there is relationship between 2 beans?
    @Bean
    public Person person () {
        var person = new Person("Aman Raj", 24, "Bihar", new Address("Patna", "Bihar", "India"));
        return person;
    }
    @Bean
    public Person person1 () {
        // Approach 1: we can create a bean with the help of existing beans.
        var person = new Person(name(), age(), address(), address1());// as we already have beans for name, age and address
        // I want to create a new bean relation with existing Spring beans how can I do this ? 1. call the method name() and age() and address()
        // and pass the return value to the constructor of Person class.
        // what we got to know with this ? 1. we can create a bean with the help of existing beans.
        return person;
    }
    @Bean
    public Person person2(String name, int age, String address, Address address2){
        // Instead of calling the method name() and age() and address() we can pass the parameter to the method person2() and Spring will automatically
        // Approach 2: we can create a bean with the help of existing beans.
        // We are auto-wiring the beans here.
        return new Person(name, age, address, address2);
    }

    @Bean
    @Qualifier("person3")
    public Person person3(String name, int age, String address, Address address2){
        // name age address address2 are the beans here.
        return new Person(name, age, address, address2);
    }

    @Bean(name = "address2")
    @Primary
    public Address address1 () {
        var address = new Address("Patna", "Bihar", "India");
        return address;
    }
}