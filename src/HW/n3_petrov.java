package HW;

import java.util.Scanner;

public class n3_petrov {
    public static String h_solv(int time) {
        if (time > 4 && time < 21 || time%10 == 0) {
            return " часов";
        } else if (time%10 == 1) {
            return " час";
        } else if (time%10 < 5) {
            return " часа";
        } else {
            return " часов";
        }
    }
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt()/3600;
        if (h == 0) {
            System.out.println("Осталось менее часа");
        } else if (h == 1) {
            System.out.println("Остался " + h + h_solv(h));
        } else {
            System.out.println("Осталось " + h + h_solv(h));
        }
    }
}
