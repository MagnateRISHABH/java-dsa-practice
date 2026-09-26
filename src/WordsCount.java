import java.util.Scanner;

public class WordsCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the line to get its word count : ");
        String a = s.nextLine();
        a = a.trim();
        if (a.isBlank() ) {
            System.out.println("Blank statement!");
        } else {
            String[] words = a.split("\\s+");
            int alpha = 0;
            int vowel = 0;
            for (int i=0; i<a.length(); i++) {
                char ch = a.charAt(i);
                if (Character.isLetter(ch)) {
                    alpha++;
                    if ("aeiou".indexOf(Character.toLowerCase(ch))!= -1)
                        vowel++;
                }
            }
            a = a.replaceAll("\\s+","");
            System.out.println("Word Count is : " + words.length);
            System.out.println("Total alphabets are : " + alpha);
            System.out.println("Total no. of Vowels are : " + vowel);
            System.out.println("Total constants are : " + (alpha-vowel));
            System.out.println("After removing spaces : " + a);
            System.out.println("Convert in lowercase : " + a.toLowerCase());
        }
    }
}
