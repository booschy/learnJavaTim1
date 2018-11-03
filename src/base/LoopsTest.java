package base;

public class LoopsTest {

    public static void main(String... args) {
        String name = "SDA";

        // instance (object) method
        Loops loop = new Loops();
        loop.printSimpleArray();

        // statis method
        String message = Loops.message();
        System.out.println(message);
    }
}
