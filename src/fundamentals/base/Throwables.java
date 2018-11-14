package fundamentals.base;

import org.junit.jupiter.api.Test;

public class Throwables {


    @Test
    public void test_checked_exceptions() {

        // Throwable <- Exception <- ...
        System.out.println("BEGIN test_checked_exceptions");

        try {
            // 2 WAYS OF HANDLING
            // a) add exception to method signature
            // b) surround with try and catch
            throw new Exception("Test exception!");

            // unchecked eception
            // DOES NOT NEED HANDLING IN CODE FOR COMPILATION
            // throw new Error("Test exception!");

        }
        catch(Exception e) {
            System.out.println("Caught: " + e.getClass().getSimpleName()
                    + " : " + e.getMessage());
        }

        // not reachable without try/catch
        System.out.println("END test_checked_exceptions\n");
    }


    @Test
    public void test_unchecked_exceptions() {

        // Throwable <- Error <- ...
        System.out.println("BEGIN test_unchecked_exceptions");

        try {
            throw new Error("Test error!");
        }
        // unchecked eception
        // DOES NOT NEED HANDLING IN CODE FOR COMPILATION
        catch(Throwable e) {
            System.out.println("Caught " + e.getClass().getSimpleName()
                    + " : " + e.getMessage());
        }

        // not reachable without try/catch
        System.out.println("END test_unchecked_exceptions");

        //throw new AssertionError("wanted error");
    }

}

