import java.util.Scanner;

public class recursion2 {
    static int addSum(int a){
        if (a>=0 && a<=10) return a;//Base case
//         int prev =addSum(a/10);// Recurrence relation
//       int ans= prev+(a%10);// Small work
       return addSum(a/10) + a%10;

    }
//    static int poweroftwonumbers(int a,int b){
//        if (b==0) return 1;// Base case
////        int prev = poweroftwonumbers(a,b-1);// REcuurence relation
//        return poweroftwonumbers(a,b-1)*a;// self work
//    }
    //A more better approach than this one
//    static  int power(int a,int b){
//        if(b==0) return 1;
//        if(b%2==0) return power(a,b/2)*power(a,b/2);
//        else return power(a,b/2)*power(a,b/2)*a;
//    }
//    k multiples of a number a
    static void multiples(int a,int b){
        if(b==0) return;//Base case
         multiples(a,b-1);// Recursive work
        System.out.println(a*b);// Self work

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first digit");
        int a = sc.nextInt();
        System.out.println("Enter the second digit");
        int b =sc.nextInt();
//        System.out.println(addSum(a));
        multiples(a,b);


    }
}