package main.fundamentalsCoding.oop;

import org.junit.jupiter.api.Test;

public class UppercaseChild extends Child{


    public UppercaseChild(
            String name,
            int age,
            String schoolName) {

        super(name, age, schoolName);
    }


    @Override
    // override Learnable default method
    public String speak(String text){

        return text.toUpperCase();
    }


    @Test
    public void uppercaseChild_test(){
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

        // overrided Learnable default method "speak"
        System.out.println(
                uppercaseChild.speak(
                        "this is my first school year"));
    }

}
