//Sum of n Numbers
//import java.util.Scanner;
//public class loop1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number ");
//        int a = sc.nextInt();
//        int sum =0;
//        int num =1;
//
//        while (num<=a ){
//
//            sum=sum+num;
//
//          num++;//We can use post increment operator
//
//        }
//        System.out.println(sum);
//    }
//}
//Using for loop

//Sum of n Numbers
import java.util.Scanner;
public class loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        int sum =0;


        for (int num =1; num<=a; num++ ){

            sum=sum+num;



        }
        System.out.println(sum);
    }
}
//Using for loop