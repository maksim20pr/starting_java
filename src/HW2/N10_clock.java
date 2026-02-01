package HW2;

public class N10_clock {
    static void main() {
        int cnt = 0;
        for (int i = 0; i < 24; i++)  {
            for (int j = 0; j < 52; j ++) {
                if (i == j % 10 * 10 + j / 10) cnt++;
            }
        }
        System.out.println(cnt); // 16
    }
}
