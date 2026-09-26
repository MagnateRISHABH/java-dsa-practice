import java.util.Scanner;
public class FizzBuzz {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the two Divisor : ");
        int d1 = s.nextInt();
        int d2 = s.nextInt();
        System.out.print("Enter the word for divisor "+d1+" : ");
        String s1 = s.next();
        System.out.print("Enter the word for divisor "+d2+" : ");
        String s2 = s.next();
        System.out.print("Enter a no. : ");
        int a = s.nextInt();
        if (a%d1 == 0){
            System.out.print(s1);
        }
        if (a%d2 == 0){
            System.out.print(s2);
        }
    }
}
