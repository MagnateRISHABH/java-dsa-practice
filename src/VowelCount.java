import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a String(type 'stop' to finish : ");
        String a = "";
        while(true) {
            String line = s.nextLine();
            if (line.equalsIgnoreCase("stop")) {
                break;
            }
            a += line; // here we are making our input in single line
        }
//        a = a.toLowerCase().replaceAll(" ","");
        String vowels = "aeiouAEIOU";
        int count = 0;
        int alpha = 0;
        int digit = 0;
        int special = 0;

        int len = a.length();
        for (int i=0; i<len; i++) {
           char ch = a.charAt(i);
//            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            if (Character.isLetter(ch)) {
                alpha++;
                if (vowels.indexOf(ch) != -1) {
                    count++; }
            } else if (Character.isDigit(ch)) {
                digit++;
            } else {
                special++;
            }
        }
        System.out.println("Total vowels are : " + count);
        System.out.println("Consonants are : "+ (alpha-count));
        System.out.println("Digits are : " + digit);
        System.out.println("Special characters are : "+ special);
    }
}
