package HW;

import java.util.Scanner;

public class n8_n9_arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Fingers (0) or Days of the week (1)?");
        int option = in.nextInt();
        while (true) {
            if (option != 0 && option != 1) {
                System.out.println("You need to choose");
                option = in.nextInt();
            } else {
                break;
            }
        }
        if (option == 0) {
            String[] fingers = {"Большой", "Указательный", "Средний", "Безымянный", "Мизинец"};
            System.out.println("Enter your finger number:");
            System.out.println(fingers[in.nextInt()-1]);
        } else {
            String[] fingers = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
            System.out.println("Enter your day number:");
            System.out.println(fingers[in.nextInt()-1]);
        }
    }
}
