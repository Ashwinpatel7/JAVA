import java.util.Scanner;

public class recursion7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.nextLine();
        System.out.println("The given string is " +s);
//        To print all the characters present in a string
        for(int i =0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }
        System.out.println(s.substring(2,3));// This will print if the input is anshu so s will be printed.
    }
}