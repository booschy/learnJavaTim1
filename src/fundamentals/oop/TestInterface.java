package fundamentals.oop;

// naming collision
//import static oop.Learnable.learnJava;
//import static oop.Trainable.learnJava;

public class TestInterface {

    public static void main(String[] args) {

        Learnable.learnJava(8);

        Trainable.learnJava(8);
    }

}
