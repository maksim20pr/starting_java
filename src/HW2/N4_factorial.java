package HW2;

import java.util.Scanner;

public class N4_factorial {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.println(f);
    }
}
