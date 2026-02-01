package HW3;

public class N8_Tmatrix {
    static void main() {
        int[][] matrix = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}};
        int[][] t_matrix = new int[4][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                t_matrix[j][i] = matrix[i][j];
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < t_matrix.length; i++) {
            for (int j = 0; j < t_matrix[i].length; j++) {
                System.out.print(t_matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
