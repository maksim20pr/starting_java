package HW3;

import java.util.Scanner;
import java.util.ArrayList;

public class N3_positive_negative {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Size:");
        int temp;
        int range = in.nextInt();
        ArrayList<Integer> list_negative = new ArrayList<Integer>();
        ArrayList<Integer> list_positive = new ArrayList<Integer>();
        for (int i = 0; i < range; i++) {
            temp = in.nextInt();
            if (temp >= 0) {
                list_positive.add(temp);
            } else {
                list_negative.add(temp);
            }
        }
        int[] arr_positive = new int[list_positive.size()];
        int[] arr_negative = new int[list_positive.size()];

        System.out.println("Positive:");
        for (int i = 0; i < list_positive.size(); i++) {
            arr_positive[i] = list_positive.get(i);
            System.out.println((i + 1) + ". " + arr_positive[i]);
        }
        System.out.println("Negative:");
        for (int i = 0; i < list_negative.size(); i++) {
            arr_negative[i] = list_negative.get(i);
            System.out.println((i + 1) + ". " + arr_negative[i]);
        }
    }
}
