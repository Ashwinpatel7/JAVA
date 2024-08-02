//Pattern of a rectangle
import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows:  ");
        int a = sc.nextInt();
        System.out.println("Enter the no of columns:");
        int b = sc.nextInt();


        for(int i =1; i<=a; i++){
            for(int j=1; j<=b; j++){
                if (i==1 || i==a || j==1 || j==b)
                    System.out.print("*");
            else
                    System.out.print(" ");

                }
//                System.out.print("*");//Here ln is not used as there was no need of change of lines.
            System.out.println();
            }

        }


    }
