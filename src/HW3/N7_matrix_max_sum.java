package HW3;

public class N7_matrix_max_sum {
    static void main() {
        int[][] matrix = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}};
        int max_sum = 0;
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            max_sum = Math.max(max_sum, sum);
            sum = 0;
        }
        System.out.println(max_sum);
    }
}
