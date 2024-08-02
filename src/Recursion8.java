import java.util.Scanner;

public class Recursion8{
    static String remove1(String s) {
        if (s.length() == 0) {
            return "";  // Corrected the base case
        }
        String smallAns = remove1(s.substring(1));
        char currChar = s.charAt(0);
        if (currChar != 'a') {
            return currChar + smallAns;
        } else {
            return smallAns;
        }
    }
static String reverse(String s,int index){
        if(index==s.length()) return "";//BAse case
    String smallwork = reverse(s,index+1);//Recursion
    return smallwork+s.charAt(index);


}

static String reverse1(String s){
        if(s.length()==0) return"";
        String smallans = reverse1(s.substring(1));
        return smallans+s.charAt(0);
}



//    static String remove(String s ,int index){
//        //Base case
//        if (index==s.length()) return "";
//        //Recursive work
//        String smallAns = remove(s,index+1);
//        //Self work
//        char currChar = s.charAt(index);
//        if (currChar!='a') return currChar+smallAns;
//        else {
//            return smallAns;
//        }

//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();

//        System.out.println(remove1(s));
     String rev= reverse1(s);
        if(s.equals(rev)) {
            System.out.println("palindrome");
        }else {
            System.out.println("Not a palindrome");
        }

    }
}