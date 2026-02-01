package HW3;

import java.util.Scanner;

public class N5_max_min_index {
    static void main() {
        Scanner in = new Scanner(System.in);
        int range = in.nextInt();
        int[] arr = new int[range];
        arr[0] = in.nextInt();
        int[][] res = {{arr[0], 0}, {arr[0], 0}};
        for (int i = 1; i < range; i++) {
            arr[i] = in.nextInt();
            if (res[0][0] < arr[i]) {
                res[0][0] = arr[i];
                res[0][1] = i;
            }
            if (res[1][0] > arr[i]) {
                res[1][0] = arr[i];
                res[1][1] = i;
            }
        }
        System.out.println("Max: " + res[0][0] + ", Index: " + res[0][1]
                        + "\nMin: " + res[1][0] + ", Index: " + res[1][1]);
    }
}
