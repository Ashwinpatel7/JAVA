//Finding remainder of a number
import java.util.Scanner;
public class basics6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int a = sc.nextInt();
        System.out.println("Enter your second number");
        int b = sc.nextInt();
        int c = (a%b);
        System.out.println("The remainder will be "+ c);

    }
}