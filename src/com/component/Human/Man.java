package com.component.Human;

//how to extend a class, which available in the same package, no need other imports!!!
public class Man extends Person{
    public String name;

    public Man(String myName) {
        //when extend from anther class, one must declare super and define the param of the depend upon constructor value
        super(22);
        this.name = myName;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void speak(String words) {
        System.out.println(words);
    }

    public void sayMyAge() {
        //here we output the actual value of the parent class value inherited
        System.out.println(this.age);
    }
}