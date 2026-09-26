import java.util.Scanner;

public class RevString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String inp = s.nextLine().trim();
//        String nam = inp.trim().toUpperCase().replace(" ", "");
//        int len = nam.length();
        String rev = new StringBuilder(inp).reverse().toString();
//        for (int i=len-1; i>=0; i--) {
//            rev = rev + nam.charAt(i) ;
//        }

        System.out.println("reverse of given string is : " + rev);
        if (rev.equalsIgnoreCase(inp))
            System.out.println("String is Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
