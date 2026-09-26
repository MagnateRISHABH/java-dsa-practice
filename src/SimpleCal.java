import java.util.ArrayList;
import java.util.Scanner;

public class SimpleCal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double result = 0;
        ArrayList<Double> history = new ArrayList<>();
        while (true) {
            System.out.print("Enter the operator among * / - + % √ ");  // SquareRoot symbol √ - hold 'Alt' and type '251'
            char c = s.next().charAt(0);
            if (c == '√') {
                System.out.println("Enter a number");
                double a = s.nextInt();
                result = Math.sqrt(a);
                System.out.println("Square root is : " + result);
            } else {
                System.out.print("Enter the 2 numbers ");
                int a = s.nextInt();
                int b = s.nextInt();
                switch (c) {
                case '*':
                    result = a*b;
                    System.out.println("Result is : " + result);
                    break;
                case '/':
                    if (b == 0)
                        System.out.println("invalid input value");
                    else
                        result = a/b;
                    System.out.println("Result is : " + result);
                    break;
                case '-':
                    result = a-b;
                    System.out.println("Result is : " + result);
                    break;
                case '+':
                    result = a+b;
                    System.out.println("Result is : " + result);
                    break;
                default:
                    System.out.println("invalid operator");
                }
            }
            history.add(result);
            System.out.println("Do u want to \n 1.continue \n 2.History \n 3.Exit");
            int x = s.nextInt();
            if (x == 3) {
                System.out.println("Calculator Closed.");
                break;
            }
            if (x == 2) {
                for (int i=0; i<history.size(); i++) {
                    System.out.println(i+1 +" : " + history.get(i));
                }
            }
        }
    }
}
