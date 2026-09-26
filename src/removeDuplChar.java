import java.util.HashMap;
import java.util.Scanner;

public class removeDuplChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String a = s.nextLine();
        a = a.trim().toLowerCase().replaceAll("\\s+", "");
//        /*Lengthy Method */
//        HashMap<Character,Integer> freq = new HashMap<>();
//        for (int i=0; i<a.length(); i++) {
//            char ch = a.charAt(i);
//                freq.put(ch, freq.getOrDefault(ch, 0) +1);
//        }
//        System.out.print("String after removing duplicate characters is : ");
//        for(int i=0; i<a.length(); i++) {
//            char ch = a.charAt(i);
//            if (freq.get(ch) != 0) {
//                System.out.print(ch);
//                freq.put(ch, 0);
//            }
//        }
        /*Best Method */
//        HashMap<Character,Boolean> seen = new HashMap<>();
//        System.out.print("String after removing duplicate characters is : ");
//        for (char ch : a.toCharArray()) {
//            if (!seen.containsKey(ch)) {
//                System.out.print(ch);
//                seen.put(ch, true);
//            }
//        }
        /* Use NESTED LOOP Method if collections not used */
//        for (int i=0; i<a.length(); i++) {
//            char ch = a.charAt(i);
//            boolean found = true;
//            for (int j=0; j<i; j++) {
//                if (a.charAt(j) == ch) {
//                    found = false;
//                break;
//                }
//            }
//            if (found) {
//                System.out.print(ch);
//            }
//        }
        /* for last occurrence */
        for (int i=0; i<a.length(); i++) {
            char ch = a.charAt(i);
            boolean found = true;
            for (int j=i+1; j<a.length(); j++) {
                if(a.charAt(j) == ch) {
                    found = false;
                }
            }
            if (found) {
                System.out.print(ch);
            }
        }
    }
}
