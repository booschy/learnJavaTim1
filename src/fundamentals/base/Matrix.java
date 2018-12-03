package fundamentals.base;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class Matrix {

    public static void main(String[] args) {

        int LINES_NR = 5;
        int COLUMNS_NR = 5;

        String[][] a = new String[LINES_NR][COLUMNS_NR];

        // initialize elements
        for (int i = 0; i < LINES_NR; i++) {
            for (int j = 0; j < COLUMNS_NR; j++) {

                a[i][j] = "" + i + j;
            }
        }

        // print elements
        for (int i = 0; i < LINES_NR; i++) {
            for (int j = 0; j < COLUMNS_NR; j++) {

                System.out.printf("%s ", a[i][j]);
            }
            System.out.println();
        }
    }

}
