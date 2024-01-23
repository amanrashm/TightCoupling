package org.example.spring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class SpringLooseCouplingExample {
    public static void main(String... args) throws Exception {
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
        System.out.println(context.getBean("person1"));
        System.out.println(context.getBean("person2"));
        // pass the method name as a parameter in getBean() method.
        // All the beans are managed by Spring. and are independent
        // 5. Both "address1" and Address.class are same. don't get confused with the name of the bean.
        // No bean named 'address1' available
        // System.out.println(context.getBean("address1"));
        // 6. If we want to get the bean of Address class then we can use the following code.
        System.out.println(context.getBean("address2"));
        /*Hello World Spring App!!!
Aman Raj
25
Baker Street London
Person[name=Aman Raj, age=24, address=Bihar, address2=Address[city=Patna, state=Bihar, country=India]]
Person[name=Aman Raj, age=25, address=Baker Street London, address2=Address[city=Patna, state=Bihar, country=India]]
Person[name=Aman Raj, age=25, address=Baker Street London, address2=Address[city=Patna, state=Bihar, country=India]]
Address[city=Patna, state=Bihar, country=India]

Process finished with exit code 0*/
        // 7. if we don't comment this below we can't use address1 as a bean.
        System.out.println(context.getBean(Address.class));

        // Question 1: Spring Container VS Java Container VS IOC Container VS Application Context
        // Answer 1: Spring Container: Spring Container is responsible to instantiate, configure,
        // and assemble the objects (beans) that are defined in the configuration files.
        // The container gets its instructions on what objects to instantiate, configure,
        // and assemble by reading the configuration metadata provided.
        // The configuration metadata can be represented either by XML, Java annotations,
        // or Java code.
        // These are the different types of Spring Containers:
        // Spring BeanFactory Container
        // Spring ApplicationContext Container
        // Spring WebApplicationContext Container
        // Spring Container is the actual container which will create the objects, wire them together,
        // configure them, and manage their complete life cycle from creation till destruction.
        // Spring Container is also known as IOC Container.
        // Spring Container is responsible to instantiate, configure, and assemble the objects (beans)
        // that are defined in the configuration files.
        // The container gets its instructions on what objects to instantiate, configure, and assemble
        // by reading the configuration metadata provided.
        // The configuration metadata can be represented either by XML, Java annotations, or Java code.

        // Question 2: Java Bean VS Spring Bean
        // Answer 2: Java Bean: A Java Bean is a Java class that should follow the following conventions:
        // It should have a no-arg constructor.
        // It should be Serializable.
        // It should provide methods to set and get the values of the properties,
        // known as getter and setter methods.
        // Spring Bean: A Spring Bean is an object that is instantiated,
        // assembled, and managed by a Spring IoC container.
        // Otherwise, a Spring Bean is simply one of many objects in your application.
        // All the beans are managed by Spring. and are independent

        // Question 3: How can I list all beans managed by Spring?
        // Answer 3: We can use the following code to list all the beans managed by Spring.
        // String[] allBeanNames = context.getBeanDefinitionNames();
        // for(String beanName : allBeanNames) {
        //     System.out.println(beanName);
        // }

        // Question 4: What if multiple matching beans are available?
        // Answer 4: If multiple matching beans are available
        // then Spring will throw the following exception.
        // No qualifying bean of type 'org.example.spring.Address' available:
        // expected single matching bean but found 2: address1,address2
        // To resolve this issue we can use the following code.
        // Address address = context.getBean(Address.class);
        // System.out.println(address);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean("person3"));
    }
}