//Finding remainder of a number
import java.util.Scanner;
public class basics7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of physics ");
        double a = sc.nextDouble();
        System.out.println("Enter the marks of maths");
        double b = sc.nextDouble();
        System.out.println("Enter the marks of english");
        double c = sc.nextDouble();
        System.out.println("Enter the marks of chemistry");
        double d = sc.nextDouble();
        System.out.println("Enter the marks of computer");
        double e = sc.nextDouble();
        double f =((a+b+c+d+e)/500)*100;
        System.out.println("The percentage  will be "+ f + "%");

    }
}
