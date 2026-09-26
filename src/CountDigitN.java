import java.util.Scanner;

public class CountDigitN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number to count its digit : ");
        int a = s.nextInt();
        int count = String.valueOf(Math.abs(a)).length();
//        while (a>0) {
//            a = a / 10;
//            count = count + 1;
//        }
        System.out.println("Digit are in " + a + " : " + count);
    }
}
