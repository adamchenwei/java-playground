package com.component;

// import Man class
import com.component.Human.Man;
import com.component.Language.Chinese;

public class Playground {
    public String theGreetingWords;
    public static void main(String[] args) {
        System.out.println("!!!Lets go to playground!");
        System.out.println("it's me, Wombat!");

        //instance with Man class and pass value
        Man asian = new Man("Adam");


        //call function from the Man class's instance
        asian.speak("ni hao");

        asian.sayMyAge();

        //Call function implemented by interface
        asian.greet("Mr. Chen");

        //Cal function implement by multiple interface
        asian.smile("real");
    }
}
