import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = s.nextInt();
        System.out.print("Enter "+ n +" numbers : ");
        int[] a = new int[n];
        for (int i=0 ; i<a.length; i++) {
            a[i] = s.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for (int j : a) {
            if (j > max)
                max = j;
            if (j < min)
                min = j;
        }
        System.out.println("Max no. is : " + max);
        System.out.println("Min no. is : " + min);
    }
}
