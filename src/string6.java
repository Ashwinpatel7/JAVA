import java.util.*;
public class string6 {
    public static void main(String[] args) {
//        Calculating no of total substrings in a string
//        String str = "abccba";
//        StringBuilder gtr = new StringBuilder(str);
//        gtr.reverse();
//        String s = gtr+"";//What happened here is that as we cannot convert a string builder into string directly we used a empty string
//        if (str.equals(gtr)) {
//            System.out.println("Palindrome")
//        }else System.out.println("Not a palindrome");;
//        }
        //Two pointer approach
        String str = "abccba";
        int i =0;
        int j = str.length()-1;
        boolean flag = true;
        while (i<j) {
            if (str.charAt(i) !=str.charAt(j))
            {
                flag = false;
                break;
            }
                i++;
                j--;


        }
        if (flag==true) System.out.println("This is a palindrome");
        else System.out.println("not a palindrome");

    }
}