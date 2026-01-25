package HW3;

import java.util.Scanner;

public class N2_max_even_min_odd {
    static void main() {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[in.nextInt()];
        arr[0] = in.nextInt();
        arr[1] = in.nextInt();
        int a_max_even = arr[0];
        int a_min_odd = arr[1];
        for (int i = 2; i < arr.length; i++) {
            arr[i] = in.nextInt();
            a_max_even = i % 2 == 1? a_max_even : Math.max(a_max_even, arr[i]);
            a_min_odd = i % 2 == 0? a_min_odd : Math.min(a_min_odd, arr[i]);
        }
        System.out.println("Max even: " + a_max_even + "\nMin odd: " + a_min_odd);
    }
}
