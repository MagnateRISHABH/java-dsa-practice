import java.util.Scanner;

public class TableN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number for table : ");
        int a = s.nextInt();
        for (int i =1; i<=10; i++) {
            int sum = a * i;
            System.out.println(a + " * " + i + " = " + sum);
        }
    }
}
