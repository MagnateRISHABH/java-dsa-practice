import java.util.HashMap;
import java.util.Scanner;

public class NonRepeatChar2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String a = s.nextLine();
        a = a.trim().toLowerCase().replaceAll("\\s+", "");
        HashMap<Character,Integer> freq = new HashMap<>();
        for (int i=0; i<a.length(); i++) {
            char ch = a.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) +1);
        }
        for (int i=0; i<a.length(); i++) {
            char c = a.charAt(i);
            if (freq.get(c) == 1) {
                System.out.println("First non-repeating character is : " + c);
                break;
            }
        }
    }
}
