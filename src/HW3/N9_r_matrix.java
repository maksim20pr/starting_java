package HW3;

import java.util.Random;

public class N9_r_matrix {
    static void main() {
        char[][] matrix = new char[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (char) ('a' + Math.random() * 26);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        char temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length / 2; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[3 - i][3 - j];
                matrix[3 - i][3 - j] = temp;
            }
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
