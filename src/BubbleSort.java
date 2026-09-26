import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of String of numbers : ");
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = s.nextInt();
        }
        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-1-i; j++) {
             if (a[j]>a[j+1]) {
                 int temp = a[j+1];
                 a[j+1] = a[j];
                 a[j] = temp;
             }
            }
        }
        System.out.println("After Bubble sort: ");
        for (int j : a) {
            System.out.println(j);
        }
    }
}
