package HW2;

public class N8_storage {
    static void main() {
        int cnt = 0;
        for (int i = 1; i < 50000; i++) {
            if (String.valueOf(i).contains("2")) cnt++;
        }
        System.out.println(cnt); // 23756
    }
}
