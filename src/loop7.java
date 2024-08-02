//Factorial of all the number till that number
import java.sql.SQLOutput;
//import java.util.Scanner;
//public class loop7 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Number  ");
//
//        int a = sc.nextInt();
//
//        int factorial = 1;
//        for(int i =1; i<=a; i++){
//            factorial = factorial*i;
//            System.out.println("The resultant factorial will be :" + factorial);
//        }
//
//        }
//    }

//Factorial of all the number till that number
import java.sql.SQLOutput;
import java.util.Scanner;
public class loop7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number  ");

        int a = sc.nextInt();
        System.out.println("Enter the second Number");
        int b = sc.nextInt();

        int number = 1;
        for(int i =1; i<=b; i++){
            number *= a;

        }
        System.out.println("The resultant answer will be :" + number);

    }
}