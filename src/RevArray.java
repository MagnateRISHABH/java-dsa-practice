import java.util.Scanner;

public class RevArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = s.nextInt();
        System.out.print("Enter " + n + " numbers : ");
        int[] a = new int[n];
        for (int i=0; i<a.length; i++) {
            a[i] = s.nextInt();
        }
//        for (int i=0; i<a.length/2; i++ ) {
//      //Method 1 : The arithmetic version works for integers,
//            // but it can overflow for large values and isn't applicable to arbitrary data types.
//                a[i] = a[i] + a[n-1-i];
//                a[n-1-i] = a[i] - a[n-1-i];
//                a[i] = a[i] - a[n-1-i];
//      //Method 2 :  the third-variable swap is the preferred/general approach.
//            int temp = a[i];
//            a[i] = a[n-1-i];
//            a[n-1-i] = temp;
//        }
        //Method 3 : Two-Pointers
        int l = 0;
        int r = a.length - 1;
        while (l<r){
            int temp = a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;
        }
        System.out.print("Reverse of array is : ");
        for (int j : a) {
            System.out.print(" " + j);
        }
    }
}
