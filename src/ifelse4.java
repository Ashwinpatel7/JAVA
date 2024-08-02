import java.util.Scanner;
public class ifelse4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the percentage  ");
        int a = sc.nextInt();
        if (a==100){
            System.out.println("There is nothing left to achieve for you" );
        }
        else if (a>80){
            System.out.println("You are on path of excelling");
        }
        else if (a>70){
            System.out.println("You are doing just good");
        }
        else if (a>60){
            System.out.println("Fine");
        }
        else {
            System.out.println("Fail");
        }


    }
}