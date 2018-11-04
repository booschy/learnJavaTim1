package oop;

import static oop.Learnable.learnJava;

public class UppercaseChildTest {

    public static void main(String[] args) {

        Child uppercaseChild = new UppercaseChild(
                "Maria",
                8,
                "Colegiul Banatean");

        System.out.println("uppercaseChild is an instance of: "
                + uppercaseChild.getClass().getName());

        // Object <- Parent <- Child <- UpperCaseChild
        System.out.println(uppercaseChild instanceof UppercaseChild);
        System.out.println(uppercaseChild instanceof Child);
        System.out.println(uppercaseChild instanceof Parent);
        System.out.println(uppercaseChild instanceof Object);

        System.out.println(uppercaseChild);

        uppercaseChild.learn();

        // overrided Learnable default mothod "speak"
        System.out.println(
                uppercaseChild.speak(
                "this is my first school year"));

    }

}
