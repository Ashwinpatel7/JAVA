import java.util.*;
public class string3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String abc = "Ashwin";
//        System.out.println(abc.substring(0,3));//So what happens here is the end index is exclusive here so it is not printed
        //Printing all substrings of a string
//        for (int i =0; i<=5; i++) {
//            for (int j = i + 1; j <= 6; j++) {
//                System.out.print(abc.substring(i,j)+" ");
//
//
        //To convert  a particular letter in a string we can use the property of substring for eg
        String as = "Ashwin";//Replacing w with d
        as = as.substring(0,3)+"d"+as.substring(4,6);//This is also a not very good method as a no of extra strings are created in this process
        System.out.println(as);
        String sr = "";
        for (int i =1; i<=10; i++){
            sr = sr+i;

        }
        System.out.print(sr +" ");

//        A new string can be made on a new memory using new keyword
        String s = new String("HEllo");


}
}
