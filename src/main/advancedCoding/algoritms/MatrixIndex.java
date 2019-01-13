package main.advancedCoding.algoritms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MatrixIndex {

    public static void main(String[] args) {

/*      1 2 4
        4 5 7
        7 3 8

        00 01 02
        10 11 12
        20 21 22

        first index = row index
        column index = column index*/

        String[] row0 = {"00", "01", "02"};
        String row1[] = new String[]{"10", "11", "12"};
        String[] row2 = new String[]{"20", "21", "22"};  //best

        /*System.out.println("Rows: " + String.join("\n",
                Arrays.toString(row0),
                Arrays.toString(row1),
                Arrays.toString(row2)));*/

        String[] [] rowsArray = new String[][]{
                row0,
                row1,
                row2
        };

        /*System.out.println(Arrays.toString(rowsArray));
        Arrays.stream(rowsArray).forEach(
                row -> System.out.println(Arrays.toString(row))
        );*/

        // classic matrix iteration
        for (int i = 0; i < rowsArray.length; i++) {
            //System.out.println(Arrays.toString(rowsArray[i]));
            String[] currentRow = rowsArray[i];

            for (int j = 0; j < currentRow.length; j++) {
                System.out.print(currentRow[j] + " ");
            }
            System.out.println("\n");
        }
    }
}
