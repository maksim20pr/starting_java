package HW2;

public class N1_Simple_loops {
    static void main() {
        // 1. Таблица умножения
        System.out.println("1. Таблица умножения\n");
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + " * 5 = " + i*5);
        }
        // 2. Степени двойки
        System.out.println("\n2. Степени двойки\n");
        for (int i = 0; i <= 9; i++) {
            System.out.print((int)Math.pow(2, i) + " ");
        }
        // 3. Звездный прямоугольник
        System.out.println("\n3. Звездный прямоугольник\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // 4. Звездный треугольник
        System.out.println("\n4. Звездный треугольник\n");
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
