package HW2;

import java.util.Scanner;

public class N3_max_number {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = String.valueOf(n).length();
        int n_max = 0;
        int n_index = 0;
        for (int i = 1; i <= l; i++) {
            if (n_max < n % 10) {
                n_max = n % 10;
                n_index = l - i;
            }
            n /= 10;
        }
        System.out.println("Max: " + n_max + "\n" + "Index: " + n_index);
    }
}
