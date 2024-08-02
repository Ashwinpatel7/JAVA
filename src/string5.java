import java.util.*;
public class string5 {
    public static void main(String[] args) {
// questions in string Builder
//        Scanner sc = new Scanner(System.in);
//        StringBuilder str = new StringBuilder(sc.nextLine());
//        System.out.println(str);
//        //Toggle
//        for (int i=0;i<str.length();i++){
//            boolean flag = true;
//            char ch = str.charAt(i);
//            int asci = (int)ch;
//            if (asci>=97) flag= false;
//            if (flag==true){
//                asci+=32;
//                char dh = (char) asci;
//                str.setCharAt(i,dh);
//            }
//            else {
//                asci-=32;
//                char dh =(char) asci;
//                str.setCharAt(i,dh);
//
//            }
//
//        }
//        System.out.println(str);
//
//
//    }
//}
        String str = "ashwin";
        for (int i =0;i<str.length(); i++){
            boolean flag =true;
            char ch = str.charAt(i);
            int asci = (int) ch;
            if (asci>=97) flag= false;
            if (flag==true) {
                asci += 32;
                char dh = (char) asci;
                str = str.substring(0, i) + dh + str.substring(i + 1);
            }else {
                asci-= 32;
                char dh = (char) asci;
                str = str.substring(0, i) + dh + str.substring(i + 1);


            }
        }
        System.out.println(str);
    }
}