package HW2;

import java.util.Scanner;

public class N9_prime_number {
    public static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n_sqrt = (int)Math.sqrt(n);
        boolean flag = true;
        for (int i = 2; i <= n_sqrt; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        System.out.println("Is prime: " + flag);
    }
}
