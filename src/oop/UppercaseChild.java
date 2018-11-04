package oop;

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
}
