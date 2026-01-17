package HW;

import java.util.Scanner;

public class n7_even_or_odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Is " + ((in.nextInt()%2==1)?"Odd":"Even") + " number");
    }
}
