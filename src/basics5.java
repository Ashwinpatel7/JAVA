// Calculating area of circle and simple Interest by taking inputs
//import java.util.Scanner;
//public class basics5{
//
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter radius :-");
//    int radius;
//    radius = sc.nextInt();
//    double pi = 3.1416;
//    double area = radius*radius*pi;
//    System.out.println("The area is " + area);
//}
//        }

import java.util.Scanner;
public class basics5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle amount");
        int pi =sc.nextInt();
        System.out.println("Enter Interest Rate");
        int Interest = sc.nextInt();
        System.out.println("Enter no of years ");
        int year = sc.nextInt();
        double simpleInterest = ((pi*Interest*year)/100);
        System.out.println("the resultant simple interest is" + simpleInterest);
    }
}
