import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of pyramid : ");
        int a = s.nextInt();
        System.out.print("Choose Pyramid direction Upside/downside? U/D : ");
        String ch = s.next();
        if(ch.charAt(0) == 'U' || ch.charAt(0) == 'u') {
            for (int i=0; i<a; i++){
                for (int j=0; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else if (ch.charAt(0) == 'D' || ch.charAt(0) == 'd'){
            for (int i=a; i>0; i--){
                for (int j=0; j<i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {System.out.println("Enter Valid given input of Pyramid direction"); }
    }
}
