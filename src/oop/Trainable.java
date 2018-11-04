package oop;

public interface Trainable {

    // static method
    // CANNOT be overrided, this is a class method
    public static void learnJava(int version) {

        System.out.println("Train Java SE version " + version);
    }
}
