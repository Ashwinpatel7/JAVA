//Rectangular number  pattern
import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int a = sc.nextInt();
        System.out.println("Enter number of columns");
        int b = sc.nextInt();
        for (int i = 1; i <= a; i++) {// to traverse over row
            for (int j = 1; j <=b; j++) {
                System.out.print(j);//To print out spaces
            }
            System.out.println();
            }

        }
    }
