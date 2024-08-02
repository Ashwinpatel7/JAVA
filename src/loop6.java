//Reversing a given number
//import java.util.Scanner;
//public class loop6 {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the Number  ");
////
//        int a = sc.nextInt();
//        int originalNumber = a;
//
//        int ReversedDigit = 0;
//        while (a>0){
//            ReversedDigit = ReversedDigit*10 + a%10;
//
//            a = a/10;
//
//        }
//        System.out.println("The reversed digit of given  " +originalNumber+"is " + ReversedDigit);
//    }
//}
//Calculating sum of given number in sequence of addition to odd and subtraction to even
import java.util.Scanner;
public class loop6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number  ");

        int a = sc.nextInt();


        int sum = 0;
        for (int i =1; i<=a; i++){
            if (i%2==0){
                sum-=i;

            }
            else{
                sum+=i;
            }



        }
        System.out.println("The reversed digit of given  is " + sum);
    }
}