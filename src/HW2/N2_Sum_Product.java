package HW2;

import java.util.Scanner;

public class N2_Sum_Product {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sum = 0;
        int prod = 1;
       while (n > 0) {
            sum += n % 10;
            prod *= n % 10;
            n /= 10;
        }
        System.out.println("Sum: " + sum + "\n" + "Prod: " + prod);
    }
}
