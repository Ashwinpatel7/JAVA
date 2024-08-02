//Finding remainder of a number
import java.sql.SQLOutput;
import java.util.Scanner;
public class ifelse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        if (a%2==0){
            System.out.println("The given no is even ");
        }
        else {
            System.out.println("The given no is odd");
        }


    }
}
