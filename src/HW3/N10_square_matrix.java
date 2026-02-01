package HW3;

import java.util.Scanner;
import java.util.Random;

public class N10_square_matrix {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        int sum = 0;
        double av;
        int sum_av = 0;
        int am_av = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matrix[i][j] = 0;
                    System.out.print(" ");
                } else if (i + j + 1 == n) {
                    matrix[i][j] = 0;
                    System.out.print(" ");
                } else if (i < j && i + j + 1 < n) {
                    matrix[i][j] = (int) ((Math.random() + 0.1) * 10);
                    System.out.print(" ");
                } else if (i < j) {
                    matrix[i][j] = -(int) ((Math.random() + 0.1) * 10);
                } else if (i + j + 1 > n) {
                    matrix[i][j] = (int) ((Math.random() + 0.1) * 10);
                    System.out.print(" ");
                } else {
                    matrix[i][j] = -(int) ((Math.random() + 0.1) * 10);
                }
                System.out.print(matrix[i][j] + " ");
                sum += matrix[i][j];
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > sum) {
                    sum_av += matrix[i][j];
                    am_av++;
                }
            }
        }
        av = sum_av / (1.0 * am_av);
        System.out.println("Sum: " + sum + "\nAverage of higher than " + sum + ": " + av);
    }
}
