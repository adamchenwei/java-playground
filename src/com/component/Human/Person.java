package com.component.Human;
import com.component.Action.Speak;
import com.component.Action.FacialExpression;
import com.component.Language.Chinese;

public class Person implements Speak {
    public int age;
    public String hello;

    public Person(int myAge) {
        this.age = myAge;
    }

    public void setName(int newAge) {
        this.age = newAge;
    }

    public void move(String movementName) {
        System.out.println(movementName);
    }

    //Annotation
    @Chinese( hello = "NI HAO MA!!!?" )
    public void greet(String name) {
        System.out.printf(hello + " and My " + name + "!!!!");
    }

    public void shakeHand(String name) {
        System.out.printf("(Shaking hands with " + name + ')');
    }

    public void smile(String type) {
        switch (type) {
            case "real":
                System.out.println(": D");
                break;
            case "bitter":
                System.out.println(": s");
                break;
            default:
                System.out.println(": )");
        }
    }

}