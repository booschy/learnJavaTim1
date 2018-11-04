package oop;

import static oop.Learnable.learnJava;

public class ChildTest {

    public static void main(String[] args) {

        /*Parent parent = new Parent("Mihai", 20);
        System.out.println(parent);*/

        Child child = new Child(
                "Adela",
                5,
                "Colegiul Banatean");

        System.out.println(child); // calls child.toString()

        System.out.println("\nMethods from Learnable");
        // overrided in Child
        child.learn();
        // static
        learnJava(8);
        // default (not overrided)
        System.out.println(
                "Child speaks: "
                 + child.speak("mama"));


    }

}
