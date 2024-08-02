//Adding a stream of numbers
import java.util.Scanner;
public class loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        int sum =0;


        while ( a!=-1 ){

            sum=sum+a;
            a= sc.nextInt();




        }
        System.out.println(sum);
    }
}