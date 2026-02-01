package HW2;

public class N7_lucky_ticket {
    public static int sumOfNum (int n) {
        int n_use = n;
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += n_use % 10;
            n_use /= 10;
        }
        return sum;
    }

    static void main() {
        int cnt = 0;
        for (int i = 1001; i < 1000000; i++) {
            if (sumOfNum(i / 1000) == sumOfNum(i % 1000)) cnt++;
        }
        System.out.println(cnt); // 55251
    }
}
