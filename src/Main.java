//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner in = new Scanner(System.in);
        System.out.println("Hello world!");
        while (true) {
            System.out.println("""
                    What kind of staff you need today?
                    0) See "Hello world!" and calculate area of a rectangle;
                    1) Option in development;
                    9) Exit;
                    Enter the option:""");
            int option = in.nextInt();
            if (option == 0) {
                System.out.println("Hello world!");
                System.out.println("Enter length:");
                int a = in.nextInt();
                System.out.println("Enter width:");
                int b = in.nextInt();
                System.out.println("Area of a rectangle: " + a * b);
            } else if (option == 1) {
                System.out.println("Not yet");
            } else if (option == 9){
                System.out.println("Bye!");
                break;
            } else {
                System.out.println("Wrong option!");
            }
        }
    }
}
