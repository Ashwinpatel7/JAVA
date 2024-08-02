//Using break keyword printing the first multiple of 5 and 7 both
import java.util.Scanner;
public class loops3 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int a = sc.nextInt();
        int num =1;
        while (true){
            if (num%5==0 && num%7==0){
                System.out.println("Required number found " + num);
                break;
            }
            num++;
        }



    }
}