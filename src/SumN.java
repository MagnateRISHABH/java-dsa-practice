import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to get the sum from 1 : ");
        int a = s.nextInt();
        int sum = a*(a+1)/2;
//        for (int i=1; i<=a; i++) {
//            sum = sum+i;
//        }
        System.out.println("Sum of " + a + " numbers are " + sum);
    }
}
