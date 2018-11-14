package fundamentals.base;

import java.util.Arrays;

public class ArrayPracticeTask {

    
    
    public static boolean isEven(int number) {
        
        return number % 2 == 0;  
    }
    
    
    public static boolean isOdd(int number) {
        
        return number % 2 != 0;
        // return ( ! isEven(number))
    }

        
    public static void printEvenNumbers(int[] intArray) {
        
    
        for (int i=0; i < intArray.length; i++) {            
            
            if (isEven(intArray[i])) {
                
                System.out.println(intArray[i]);
            } 
        }
    }
    

    public static void printOddNumbers(int[] intArray) {
        
        
        for (int i=0; i < intArray.length; i++) {            
            
            if (isOdd(intArray[i])) {
                
                System.out.println(intArray[i]);
            } 
        }
    }

    
    private static int sum(int[] intArray) {
        
        int sum = 0;
        
        for (int i=0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        
        return sum;
    }

    
    public static void main(String[] args) {
        
        int[] intArray = {2, 3, 4, 7, 99, 4, 120, 111, -5, -99, 55, 13, 29, 1, 0};        
        
        // The size of an array can't be modified.
        // This will not work because the intArray has a fixed length of 15.
        // Uncomment to test it.
        // intArray[15] = 9; 
        
        System.out.println("Array: " + Arrays.toString(intArray));

        System.out.println("\nEven numbers:");
        printEvenNumbers(intArray);
        
        System.out.println("\nOdd numbers:");
        printOddNumbers(intArray);
        
        System.out.println("\nArray elements sum: " + sum(intArray));
        

        // 1
        System.out.println("\nNumbers at odd indexes:");
        printNumbersAtOddIndexes(intArray); 
        
        // 2
        System.out.println("\nNegative numbers:");
        printNegativeNumbers(intArray); 
        
        // 3
        System.out.println("\nNumbers bigger than 10:");
        printNumbersBiggerThan10(intArray);
        
        // 4
        System.out.println(String.format(
                "\nArray positive elements average: %.2f", 
                average(intArray)));        
        
        // 5
        System.out.println(String.format(
                "\nArray positive elements average: %.2f", 
                positiveElementsAverage(intArray)));
    }


    // Homework: implement following methods
    
    public static void printNumbersAtOddIndexes(int[] intArray) {
        // 1 Homework implementation        
    }
    
    
    public static void printNegativeNumbers(int[] intArray) {
        // 2 Homework implementation        
    }

    
    public static void printNumbersBiggerThan10(int[] intArray) {
        // 3 Homework implementation
    }
    
    
    public static float average(int[] intArray) {
        // 4 Homework implementation
        // TIP: the average must be a float; you will need a cast
        return 0; 
    }

    
    public static float positiveElementsAverage(int[] intArray) {
        // 5 Homework implementation
        return 0;
    }   
    
}
