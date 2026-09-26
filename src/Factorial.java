import java.util.Scanner;

public class Factorial {
    //    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.print("finding the factorial of : ");
//        int a = s.nextInt();
//        if (a < 0)
//            System.out.println("Factorial not defined for negative numbers");
//        else if (a == 0)
//            System.out.println("Factorial is 1");
//        else {
//            long fact = 1;
//            for (int i = 1; i <= a; i++) {
//                fact *= i;
//            }
//            System.out.println("Factorial of " + a + " is : " + fact);
//        }
//    }
    public static long factorial(int a) {
        if (a == 0 || a == 1) {
            return 1;
        }
        return a * factorial(a-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("finding the factorial of : ");
        int a = s.nextInt();
        if (a < 0)
            System.out.println("Factorial not defined for negative numbers");
        else
            System.out.println("Factorial of " + a + " is : " + factorial(a));
    }
}
