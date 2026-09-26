import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the word or line : ");
        String a = s.nextLine();
        a = a.toLowerCase().replaceAll("\\s+","");
        /* >> Using HashMap << */
        HashMap<Character, Integer> alpha = new HashMap<>();
        for (int i=0; i<a.length(); i++) {
            char ch = a.charAt(i);
            if (alpha.containsKey(ch)) {
                int current = alpha.get(ch);
                alpha.put(ch, current+1);
            } else {
                alpha.put(ch,1);
            }
        }
        for (Character k : alpha.keySet()){
            System.out.println(k + " -> " + alpha.get(k));
        }
//        /* >> Using Array << */
//        int len=a.length();
//        int[] count = new int[26];
//        int digit = 0;
//        int special = 0;
//        for (int i=0; i<a.length(); i++) {
//            char ch = a.charAt(i);
//            if(ch >= '0' && ch <= '9'){
//                digit++;
//            }
//            else if (!Character.isLetterOrDigit(ch)){
//                special++;
//            } else count[ch-'a']++;
//        }
//        for (int i=0; i<26; i++) {
//            if (count[i]>0) {
//                System.out.println((char)('a'+i)+" = "+ count[i]);
//            }
//        }
//        System.out.println("Digit counts are : " + digit);
//        System.out.println("Special characters are : " + special);
    }
}