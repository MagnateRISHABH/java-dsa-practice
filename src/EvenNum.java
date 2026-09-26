import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number for getting all the even number from 2");
        int a = s.nextInt();
        if (a<2)
            System.out.println("no even number found");
        else {
            System.out.println("Even no. are as follows");
            for (int i=2; i<=a; i+=2){
                System.out.print(i +"\t");
            }
        }
    }
}
