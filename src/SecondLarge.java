import java.util.Scanner;

public class SecondLarge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = s.nextInt();
        System.out.print("Enter " + n + " numbers : ");
        int[] a = new int[n];
        for (int i=0; i<a.length; i++) {
            a[i] = s.nextInt();
        }
        int max = a[0];
        int current = Integer.MIN_VALUE;
        for (int i=0; i<a.length; i++) {
            if (a[i] > max) {
                current = max;
                max = a[i];
            } else {
                if (a[i] > current && a[i] != max) current = a[i];
            }
        }
        System.out.println("Largest no. is : " + max + "\n");
        if (current == Integer.MIN_VALUE)
                System.out.println("No Second largest no.");
        else System.out.println("Second largest no. is : " + current);
    }
}
