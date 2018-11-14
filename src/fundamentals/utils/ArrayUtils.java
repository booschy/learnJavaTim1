package fundamentals.utils;


public interface ArrayUtils {


    public static <T>  void printArray(T[] array){

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
