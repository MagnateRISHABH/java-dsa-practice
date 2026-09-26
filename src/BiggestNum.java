import java.util.Scanner;

public class BiggestNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 3 numbers : ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
//        if (a>b) {
//            if (a>c){
//                System.out.println("Biggest number is : " + a);
//            }
//            else
//                System.out.println("Biggest number is : " + c);
//        }
//        else {
//            if (b>c) {
//                System.out.println("Biggest number is : " + b);
//            }
//            else
//                System.out.println("Biggest number is : " + c);
//        }
        int max = Math.max(a, Math.max(b,c));
        System.out.println("Biggest number is : " + max);
    }
}

