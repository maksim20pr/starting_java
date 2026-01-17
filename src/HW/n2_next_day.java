package HW;

import java.util.Scanner;

public class n2_next_day {
    public static boolean isLeap(int year) {
        return !(year%400 == 0 || year%4 != 0);
    }
    public static boolean isContains(int[] arr, int target) {
        for (int el: arr) {
            if (el == target) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt(), month = in.nextInt(), year = in.nextInt();
        int[] month_30 = {4, 6, 9, 11};
        if (day > 31 || day <= 0 || month > 12 || month <= 0 || year <= 0) {
            System.out.println("Error: Wrong date");
        } else if (day < 28) {
            System.out.println((day + 1) + " " + month + " " + year);
        } else if (month == 2) {
            if (day == 28 && isLeap(year)) {
                System.out.println(29 + " " + month + " " + year);
            } else if (day == 28) {
                System.out.println(1 + " " + (month + 1) + " " + year);
            } else if (day < 28) {
                System.out.println((day+1) + " " + month + " " + year);
            } else {
                System.out.println("Error: Wrong date");
            }
        } else if (isContains(month_30, month)) {
            if (day == 30) {
                System.out.println(1 + " " + (month + 1) + " " + year);
            } else if (day < 30) {
                System.out.println((day+1) + " " + month + " " + year);
            } else {
                System.out.println("Error: Wrong date");
            }
        } else if (day == 31 && month == 12) {
            System.out.println(1 + " " + 1 + " " + (year+1));
        } else if (day == 31) {
            System.out.println(1 + " " + (month+1) + " " + year);
        } else {
            System.out.println((day+1) + " " + month + " " + year);
        }
    }
}
