package oop;

public interface Learnable {


    // method signature, no body
    // MUST be implemented in classes that IMPLEMENT Learnable
    public void learn();


    // static method
    // CANNOT be overrided, this is a class method
    public static void learnJava(int version) {

        System.out.println("Learn Java SE version " + version);
    }


    // default method
    // CAN be overrided
    public default String speak(String text) {
        helper(); // private method example
        return text;
    }


    // visible only internal
    private String helper() {

        return "help!";
    }

}