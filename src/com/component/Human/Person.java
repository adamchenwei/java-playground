package com.component.Human;

public class Person {
    public int age;

    public Person(int myAge) {
        this.age = myAge;
    }

    public void setName(int newAge) {
        this.age = newAge;
    }

    public void move(String movementName) {
        System.out.println(movementName);
    }
}