package HW3;

import java.util.ArrayList;
import java.util.Scanner;

public class N4_unique {
    public static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Size:");
        int temp;
        int range = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(in.nextInt());
        for (int i = 1; i < range; i++) {
            temp = in.nextInt();
            if (!list.contains(temp)) {
                list.add(temp);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }
}
