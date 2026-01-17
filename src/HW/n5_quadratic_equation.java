package HW;

import java.util.Scanner;

public class n5_quadratic_equation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a, b, c:");
        double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
        double d = 4*a*c - Math.pow(b, 2);
        if (d < 0) {
            System.out.println("No roots");
        } else if (d == 0) {
            double root = Math.abs(b)/(-b)*Math.sqrt(c);
            System.out.println("x1 = " + root + ", x2 = " + root);
        } else {
            System.out.println("x1 = " + (-b - Math.sqrt(d))/(2*a) + ", x2 = " + (-b + Math.sqrt(d))/(2*a));
        }
    }
}
