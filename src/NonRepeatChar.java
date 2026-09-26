import java.util.HashMap;
import java.util.Scanner;

public class NonRepeatChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        String a = s.nextLine();
        a = a.trim().toLowerCase();
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i=0; i<a.length(); i++) {
            char ch = a.charAt(i);
            if (freq.containsKey(ch)) {
                    int current = freq.get(ch);
                    freq.put(ch, current+1);
            } else {
                freq.put(ch, 1);
            }
        }
//        for (Character key : freq.keySet()) {
//            if (freq.get(key) == 1)
//                System.out.print(key + " ");
//        }
        boolean flag = false;
        for (int i=0; i<a.length(); i++) {
            char ch = a.charAt(i);
            if (freq.get(ch) == 1) {
                flag = true;
                System.out.print("First Non-Repeating character is : " + ch);
                break;
            }
        }
            if (!flag)
                System.out.print("No Unique character found");
    }
}
