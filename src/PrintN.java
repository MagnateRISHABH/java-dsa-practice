import java.sql.SQLOutput;
import java.util.Scanner;

public class PrintN {
    public static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = s.nextInt();
        System.out.println("the series of number from 1 to " + a);
        for (int i=1; i<=a; i++) {
            System.out.print(i + "\t");
        }
    }
}
