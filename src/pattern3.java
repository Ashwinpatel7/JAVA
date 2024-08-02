//Triangular pattern
import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {// to traverse over row
            for (int j = 1; j <= a-i; j++) {
                System.out.print(" ");//To print out spaces
            }
            for (int k = 1; k <=(2*i-1);k++){
                System.out.print("*");//To print out stars
            }
            System.out.println();
        }
    }
}