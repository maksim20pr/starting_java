package HW;

import java.util.Scanner;

public class n6_circle  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a, b and R for circle:");
        double a = in.nextDouble(), b = in.nextDouble(), r = in.nextDouble();
        System.out.println("Enter x and y for point:");
        double x = in.nextDouble(), y = in.nextDouble();
        System.out.println(Math.pow((x-a), 2)+Math.pow((y-b), 2) == Math.pow(r, 2));
    }
}
