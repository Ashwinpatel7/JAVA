import java.util.*;
public class string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //initializing an string
//        String abc = "Ashwin Patel";
//        System.out.println(abc);
//        System.out.println("Enter your name: ");
//        String n = sc.next();
//        System.out.println("Your name is "+ n);
////        Some functions of string
//        String as = "Ashwin";
//        String pa = "Patel";
//        int a = as.length();
//        System.out.println(a);
//        System.out.println(as.charAt(3));
//        System.out.println(as.indexOf('i'));
//        System.out.println(as.compareTo(pa));//The comparsion is done lexographically as such the ascii vau is summed then compared with each other
        String  abc ="Ashwin Patel";
        String sa = " You know Who";
        System.out.println(abc.contains("As"));
        System.out.println(abc.endsWith("tel"));
        System.out.println(abc.startsWith("As"));
        System.out.println(abc.toLowerCase());
        System.out.println(abc.toUpperCase());
        System.out.println(abc.concat(sa));




    }
}