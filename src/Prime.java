import java.util.Scanner;

public class Prime {
    public static void main() {
        System.out.print("Enter a no. : ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int rem = 0;
        if (a<2){
            System.out.println("no prime numbers");
        } else {
            System.out.print(2+" ");
            for (int i = 3; i<=a; i++) {
                boolean flag = true;
                int j=2;
                while (j < i) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                    j++;
                }
                if (flag)
                    System.out.print(i+" ");
            }
        }

//        for (int i=2; i<a; i++){
//            rem = a%i;
//            if (rem == 0){
//                flag = true;
//                break;
//            }
//        }
//        if (!flag)
//            System.out.println("Prime no.");
//        else System.out.println("Not a Prime no.");
    }
}
