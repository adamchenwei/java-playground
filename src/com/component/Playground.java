package com.component;

// import Man class
import com.component.Human.Man;

public class Playground {
    public static void main(String[] args) {
        System.out.println("!!!Lets go to playground!");
        System.out.println("it's me, Wombat!");

        //instance with Man class and pass value
        Man asian = new Man("Adam");

        //call function from the Man class's instance
        asian.speak("ni hao");
        asian.sayMyAge();
    }
}
