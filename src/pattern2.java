////Triangular pattern
//import java.util.Scanner;
//public class pattern2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of rows");
//        int a = sc.nextInt();
//        for (int i = 1; i <= a; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//Reverse Triangular pattern
import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <=(a+1-i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}