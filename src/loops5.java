////no of digits in a number
//import java.util.Scanner;
//public class loops5 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Number  ");
//        int a = sc.nextInt();
//        int originalNumber = a;
//        int numofDigits = 0;
//        while (a>0){
//            a = a/10;
//            numofDigits++;
//        }
//        System.out.println("The no of digit in given  " +originalNumber+"is " + numofDigits);
//    }
//}

//sum  of digits in a number
import java.util.Scanner;
public class loops5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number  ");
        int a = sc.nextInt();
        int originalNumber = a;
        int SumofDigits = 0;
        while (a>0){
            SumofDigits +=a%10;
            a = a/10;

        }
        System.out.println("The no of digit in given  " +originalNumber+"is " + SumofDigits);
    }
}