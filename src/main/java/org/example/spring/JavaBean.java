package org.example.spring;
import java.io.Serializable;
// java bean is a class that should follow the following conventions:
// 1. It should have a public no-arg constructor.
// 2. It should be Serializable.
// 3. It should provide methods to set and get the values of the properties,
public class JavaBean implements Serializable { // EJB 3.0 specification Enterprise Java Beans
    private String text;

    private int number;

    public JavaBean(String text, int number) {
        this.text = text;
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}