package main.advancedCoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

public class MatrixLoop {

    private static class MatrixSum{
        private int value = 0;

        public int getValue() {
            return value;
        }

        public void incrementValue(int value) {
            this.value += value;
        }
    }

    public static void main(String[] args) {

        int[][] intMatrix = new int[][]{
                //int intMatrix[][] = new int[][]{
                new int[]{1, 1},//row 0
                new int[]{2, 2, 2},//row 1
                new int[]{5}//row 2
        };

        for (int i = 0; i < intMatrix.length; i++) {
            for (int j = 0; j < intMatrix[i].length; j++) {
                System.out.print("\"" + intMatrix[i][j] + "\" ");
            }
            System.out.println();
        }

        /*int[][] intMatrix1 = {
                {1, 1, 1},
                {2, 2, 2},
                {5, 5, 5}
        };*/


        //printMatrix(intMatrix, integer -> System.out.print(integer + " "));
        matrixOperation(
                intMatrix,
                integer -> System.out.print(integer*2 + " "));

        MatrixSum intMatrixSum = new MatrixSum();
        matrixOperation(
                intMatrix,
                integer -> intMatrixSum.incrementValue(integer)
        );

        System.out.println("Matrix sum: " + intMatrixSum.getValue());

        Set<Integer> distinctFromMatrix = new TreeSet<>();
        matrixOperation(
                intMatrix,
                integer -> distinctFromMatrix.add(integer)
        );
        System.out.println("Distinct from matrix: " + distinctFromMatrix);


        List<Integer> listFromMatrix = new ArrayList<>();
        matrixOperation(
                intMatrix,
                integer -> listFromMatrix.add(integer)
        );
        System.out.println("List from matrix: " + listFromMatrix);

        /*for (int i = 0; i < intMatrix.length; i++) {
            for (int j = 0; j < intMatrix[i].length; j++) {
                System.out.print(intMatrix[i][j] + " ");
            }
            System.out.println();
            }
        }*/
    }


    public static void matrixOperation(
            int[][] intMatrix,
            Consumer<Integer> elementConsumer) {

        final int totalRowCount = intMatrix.length;
        for (int i = 0; i < totalRowCount; i++) {

            int[] currentRow = intMatrix[i];

            final int totalColumnCount = currentRow.length;

            for (int j = 0; j < totalColumnCount; j++) {
                // operation 1
                elementConsumer.accept(intMatrix[i][j]);
            }
        }
    }


}