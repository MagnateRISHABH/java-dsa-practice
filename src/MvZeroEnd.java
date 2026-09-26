import java.util.Scanner;

public class MvZeroEnd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any 5 numbers");
        int[] a = new int[5];
        for (int i=0; i<5; i++) {
            a[i] = s.nextInt();
        }
//        /* Long Method */
//        int[] b = new int[5];
//        int front = 0;
//        int rear = 0;
//        for (int i=0; i<5; i++) {
//            if (a[i] != 0) {
//                b[0+front] = a[i];
//                front++;
//            } else {
//                b[4-rear] = 0;
//                rear++;
//            }
//        }
//        for (int val : b) {
//            System.out.println(val);
//        }
        /* Best Method */
        int index = 0;
        for (int i=0; i<5; i++) {
            if (a[i] != 0) {
                a[index] = a[i];
                index++;
            }
        }
        while (index < 5) {
            a[index] = 0;
            index++;
        }
        for (int val : a) {
            System.out.print(" " + val);
        }
    }
}
