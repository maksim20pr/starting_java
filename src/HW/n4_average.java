package HW;

import java.util.Scanner;

public class n4_average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        if (a > b == b > c) {
            System.out.println(b);
        } else if (b > c == c > a) {
            System.out.println(c);
        } else {
            System.out.println(a);
        }
    }
}
