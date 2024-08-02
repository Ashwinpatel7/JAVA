import java.util.Scanner;
public class ifelse6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first  no  ");
        int a = sc.nextInt();
        System.out.println("Enter the second no  ");
        int b = sc.nextInt();
        System.out.println("Enter the third no  ");
        int c = sc.nextInt();
        if (a+b>c && a+c>b && b+c>a){
            System.out.println("This is the required triangle");
        }
        else {
            System.out.println("This is not a triangle");
        }





    }
}
