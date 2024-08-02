import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class Algebra{
     int sum(int a, int b){
         int ans = a+b;
         return ans;

     }//We are not declearing access modifier so it will be default
}

public class oops2 {
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int x= sc.nextInt();
        System.out.println("Enter your second number:");
        int y = sc.nextInt();
        System.out.println("The resultant sum will be");
        int ans =obj.sum(x,y);
        System.out.println(ans);


    }
}
//Using standard libraries of java
