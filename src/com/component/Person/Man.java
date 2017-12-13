package com.component.Person;

public class Man {
    public String name;

    public Man(String myName) {
      this.name = myName;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void speak(String words) {
        System.out.println(words);
    }
}