package main.fundamentalsCoding.oop;

public interface Trainable {

    // static method
    // CANNOT be overdided, this is a class method
    static void learnJava(int version) {

        System.out.println("Train Java SE version " + version);
    }
}
