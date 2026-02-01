package HW2;

import java.util.Scanner;

public class N5_fibonacci {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t;
        int a1 = 0;
        int a2 = 1;
        System.out.print(a1 + " " + a2 + " ");
        for (int i = 0; i < n - 2; i++) {
            t = a2;
            a2 += a1;
            a1 = t;
            System.out.print(a2 + " ");
        }
    }
}
