//import java.util.Scanner;
//public class ifelse3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the cost price ");
//        int a = sc.nextInt();
//        System.out.println("Enter the selling price");
//        int b = sc.nextInt();
//        if (a<b){
//            int c = b-a;
//            System.out.println("The profit is "+c );
//        }
//        else {
//            int d = a-b;
//            System.out.println("The loss is  " + d);
//        }
//
//
//    }
//}

import java.util.Scanner;
public class ifelse3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle  ");
        int a = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle");
        int b = sc.nextInt();
        int area = (a*b);
        int perimeter = a+b+a+b;
        if (area<perimeter){

            System.out.println("The perimeter of rectangle is greater than its area" );
        }
        else {

            System.out.println("The area of rectangle is greater than its perimeter");
        }


    }
}
