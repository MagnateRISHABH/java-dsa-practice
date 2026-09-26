import java.util.*;

import static java.util.Collections.reverse;

public class RotateArray {
    static void reverse(int[] a, int l, int r) {
        while (l < r) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }

    static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the length of array");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.print("Enter  all the " + n + " elements : ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        s.nextLine();
        String rotate = "";
        while (true) {
            System.out.println("Enter direction of rotation (left or right) : ");
            rotate = s.nextLine();
            if (rotate.equalsIgnoreCase("left") || rotate.equalsIgnoreCase("right")) {
                break;
            }
            System.out.println("Invalid rotate");
        }
        System.out.print("Enter the Rotate by no. of positions ");
        int pos = s.nextInt();
//Array rotation using Reverse Algorithm
        if (rotate.equalsIgnoreCase("left")) {
            reverse(a, 0, pos - 1);
            reverse(a, pos, n - 1);
            reverse(a, 0, n - 1);
        }
        if (rotate.equalsIgnoreCase("right")) {
            reverse(a, 0, n - 1);
            reverse(a, 0, pos - 1);
            reverse(a, pos, n - 1);
        }
        System.out.print("Reverse of array is : ");
        for (int j : a) {
            System.out.print(" " + j);
        }
// Array indexing method
        /*
        int[] rot = new int[n];
            if(rotate.equalsIgnoreCase("left")){
                // left rotation
                for (int i=0; i<n-pos; i++) {
                    rot[i] = a[pos+i];
                }
                for (int i=0; i<pos; i++){
                    rot[n-pos+i] = a[i];
                }
            } else {
                // right rotation
                for (int i=0; i<pos; i++){
                    rot[i] = a[n-pos+i];
                }
                for (int i=0; i<n-pos; i++){
                    rot[pos+i] = a[i];
                }
            }
        System.out.print("After rotation : ");
            for (int i=0; i<n; i++) {
                System.out.print(rot[i] + " ");
            } */
// Collection Method
        /*
        List<Integer> arrList = new ArrayList<>();
        System.out.print("Enter all the elements and type 'exit' or 'end' as u completed ");
        while(true) {
            String inp = s.nextLine();
            if (inp.equalsIgnoreCase("Exit") || inp.equalsIgnoreCase("end")){
                break;
            }
            arrList.addLast(Integer.parseInt(inp));
        }
        String rotate = "";
        while(true) {
            System.out.println("Enter direction of rotation (left or right) : ");
            rotate = s.nextLine();
            if (rotate.equalsIgnoreCase("left") || rotate.equalsIgnoreCase("right")) {
                break;
            }
            System.out.println("Invalid rotate");
        }
        System.out.print("By how many positions : ");
        int pos = s.nextInt();
        if(rotate.equalsIgnoreCase("left")){
            Collections.rotate(arrList, -pos);
        }
        if(rotate.equalsIgnoreCase("right")){
            Collections.rotate(arrList, pos);
        }
        System.out.println("After rotation array becomes : "+arrList);
        */
    }
}
