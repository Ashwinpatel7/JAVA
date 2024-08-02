//import java.util.Scanner;
//
//// printing value from 1 to n using recursion
//public class recursion1 {
//    static void printIncreasing(int n){
//        if(n==1){
//            System.out.println(n);
//            return;
//        }
//        printIncreasing(n-1);
//        System.out.println(n);
//
//
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number ");
//        int a = sc.nextInt();
//        printIncreasing(a);
//
//    }
//}

 // Printing from n to 1 using recursion

import java.sql.SQLOutput;
//import java.util.Scanner;
//
//public class recursion1 {
//
//   static void printDecreasing(int a){
//       //Base case(halting condition)
//       if(a==1){
//           System.out.println(1);
//           return;
//
//       }
//       // self work
//       System.out.println(a);
//       //Smaller problem
//       printDecreasing(a-1);
//   }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of n");
//        int n = sc.nextInt();
//        printDecreasing(n);
//    }
//}

import java.util.Scanner;

public class recursion1 {

//    static int printFactorial(int a){
//        //Base case(halting condition)
//        if(a==1)  return 1;
//        // smaller problem
//        int n = printFactorial(a-1);
//        // self work
//        int ans = a*n;
//
//
//        return ans;
//
//
//
//    }
    static int fib(int a){
        //base case
        if(a==0||a==1) return a;
        //smaller problem
//        int prev = fib(a-1);
//        int prevprev = fib(a-2);
        // self work

        return  fib(a-1)+fib(a-2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}