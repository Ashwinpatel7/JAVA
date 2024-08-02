import java.util.Scanner;
// Finding GCD using multiple methods
// Method1- Iteration
public class recursion4 {
static int GCD(int a,int b) {
    while (a % b != 0) {
        int rem = a % b;
        a = b;
        b = rem;


    }
    return b;
}
static int gcd(int a , int b){
    if(b==0) return a;
    return gcd(b,a%b);
}
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number");
            int a = sc.nextInt();
            System.out.println("Enter the second number");
            int b = sc.nextInt();
            System.out.println(gcd(a,b));
        }
    }
