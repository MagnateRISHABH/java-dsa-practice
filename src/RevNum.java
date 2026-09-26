import java.util.Scanner;

public class RevNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to get reverse ");
        int num = s.nextInt();
//        int a = Math.abs(num);
//        int rev = 0;
//        while (a>0) {
//            rev = (10 * rev) + (a % 10);
//            a = a/10;
//        }
//        if (num < 0)
//            rev = -rev;
//        System.out.println("Reverse of " + num + " is : " + rev);
        int rev= 0;
        //int len = String.valueOf(num).length();
        for (int i = String.valueOf(num).length(); i>0; i--) {
            rev = (num%10) + (rev*10);
            num = num/10;
        }
        System.out.println("reverse of string is : "+ rev);
    }
}
