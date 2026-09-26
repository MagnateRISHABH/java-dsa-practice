import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the 2 strings : ");
        String a = s.nextLine();
        String b = s.nextLine();
        a = a.trim().toLowerCase().replaceAll("\\s+", "");
        b = b.trim().toLowerCase().replaceAll("\\s+", "");
//        FREQUENCY ARRAY METHOD ::
//        int[] freq = new int[26];
//        if (a.length() == b.length()) {
//            for (int i=0; i<a.length(); i++) {
//                 freq[a.charAt(i) - 'a']++;
//                 freq[b.charAt(i) - 'a']--;
//            }
//            boolean flag = true;
//            for (int i=0; i<freq.length; i++) {
//                if (freq[i] != 0) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag)
//                System.out.println("Entered strings are Anagram");
//            else System.out.println("Not Anagram");
//        } else System.out.println("Not Anagram");

//        /* SORTING METHOD */
//        if (a.length() == b.length()) {
//            char[] arr1 = a.toCharArray();
//            char[] arr2 = b.toCharArray();
//            Arrays.sort(arr1);
//            Arrays.sort(arr2);
//            if (Arrays.equals(arr1, arr2))
//                System.out.println("Anagram");
//            else System.out.println("Not Anagram");
//        } else System.out.println("Not Anagram");

        /* By using HASHMAP METHOD ::*/
        if (a.length() == b.length()) {
            HashMap<Character, Integer> freq = new HashMap<>();
            for (int i = 0; i < a.length(); i++) {
                char ch = a.charAt(i);
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
                char ch1 = b.charAt(i);
                freq.put(ch1, freq.getOrDefault(ch1,0) - 1);
            }
            boolean flag = true;
            for (int val : freq.values()) {
                if (val != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println("Anagram");
            else System.out.println("Not Anagram");
        } else System.out.println("Not Anagram");
    }
}
