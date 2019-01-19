/*
DON'T DO THIS !!!!!!!!!!!!!!!!!!!!!!!!!!!!
*/

package main.advancedCoding.oca;

// cannot be accesses directly from outside
class OtherMultipleTypes {
}

// cannot be accesses directly from outside
interface Executable {
    void execute();
}



public class MultipleTypes {

    public static Executable getExecutable(){

            //return () -> System.out.println("executed");

            return new Executable() {
                @Override
                public void execute() {
                    System.out.println("executed");
                }
            };
    }

    public static class Nested {

        public static void main(String[] args) {

            OtherMultipleTypes object1 = new OtherMultipleTypes();

            Executable ex = new Executable() {
                @Override
                public void execute() {
                }
            };
        }
    }
}

