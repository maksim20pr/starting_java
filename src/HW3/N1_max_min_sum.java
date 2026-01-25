package HW3;

import java.util.Scanner;

public class N1_max_min_sum {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input method:\n0) Size + elements in loop\n1) Line with spaces");
        int s = in.nextInt();
        if (s == 0) {
            System.out.println("Array size: ");
            s = in.nextInt();
            System.out.println("Input elements: ");
            int[] arr = new int[s];

            arr[0] = in.nextInt();
            int a_max = arr[0];
            int a_min = arr[0];
            int a_sum = arr[0];

            for (int i = 1; i < s; i++) {
                arr[i] = in.nextInt();
                a_max = Math.max(a_max, arr[i]);
                a_min = Math.min(a_min, arr[i]);
                a_sum += arr[i];
            }
            System.out.println("Max: " + a_max + "\nMin: " + a_min + "\nSum: " + a_sum);
        } else if (s == 1) {
            System.out.println("Input line: ");
            in.nextLine();
            String str = in.nextLine();
            System.out.println("Input line: " + str);
            String[] str_arr = str.split(" ");
            int[] arr = new int[str_arr.length];

            arr[0] = Integer.parseInt(str_arr[0]);
            int a_max = arr[0];
            int a_min = arr[0];
            int a_sum = arr[0];

            for (int i = 1; i < str_arr.length; i++) {
                arr[i] = Integer.parseInt(str_arr[i]);
                a_max = Math.max(a_max, arr[i]);
                a_min = Math.min(a_min, arr[i]);
                a_sum += arr[i];
            }
            System.out.println("Max: " + a_max + "\nMin: " + a_min + "\nSum: " + a_sum);
        }

    }
}
