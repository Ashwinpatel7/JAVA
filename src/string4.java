import java.util.*;
public class string4 {
    public static void main(String[] args) {
//     String s1 = "ashwin";
//     String s2 = "ashwin";
//     String s3 = new String("ashwin");
//        System.out.println(s1==s3);
////        This operator checks the address of both string
//        System.out.println(s1.equals(s3));
        //Learning String Builders
        StringBuilder str = new StringBuilder("hello");
        str.append("world");
        System.out.println(str);
        //To set char at a given position
        str.setCharAt(3,'d');
        System.out.println(str);
        str.insert(3,'d');//Inserting at a given position
        System.out.println(str);
        str.deleteCharAt(0);//Delete character at given index
        System.out.println(str);
//        To reverse an string bilder we can approach the array way or can use
        str.reverse();
        System.out.println(str);
        str.reverse();
        str.delete(0,5);//To delete the second one is exclusive
        System.out.println(str);











































































































































    }
}





































