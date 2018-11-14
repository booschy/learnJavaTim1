package fundamentals.base;

public class Loops {


    // constructor
    public Loops(){

        System.out.println("Loops constructor");
    }


    // Instance method
    public void printSimpleArray(){

        int[] integersArray = new int[4];

        integersArray[0] = 0;
        integersArray[1] = 1;
        integersArray[2] = 2;
        integersArray[3] = 3;

        for(int i=0; i < integersArray.length; i++){
            System.out.println(integersArray[i]);
        }
    }


    // Class method
    public static String message(){

        return "Loops message";
    }
}

