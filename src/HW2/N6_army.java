package HW2;

public class N6_army {
    static void main() {
        int cnt = 0;
        for (int i = 1; i < 100000; i++) {
            if (String.valueOf(i).contains("4") || String.valueOf(i).contains("13")) cnt++;
        }
        System.out.println(cnt); // 43830
    }
}
