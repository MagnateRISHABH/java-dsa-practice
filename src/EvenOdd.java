import java.util.Scanner;

public class EvenOdd {
        public static Boolean isEven( int num) {
//            return num % 2 == 0;
            return (num & 1) == 0;
        }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number to check Even or Odd ");
        int num = s.nextInt();
        if (isEven(num))
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");
    }
}
