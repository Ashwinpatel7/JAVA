public class string7 {
    public static boolean isPalindrome(String str){
        int i =0;
        int j =str.length()-1;
        while (i<j){
            if (str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;


        }
        return true;
    }
    public static void main(String[] args) {
//        String str = "ab";
//        int count =0;
//        for (int i =0; i<str.length();i++){
//            for (int j =i+1; j<=str.length(); j++){
//                if (isPalindrome(str.substring(i,j))==true);
//                count++;
//                System.out.print(str.substring(i,j)+ " ");
//            }
//        }
//        System.out.println(count);
        String str = " Hi I am Ashwin Patel";
        String sb = "";
        StringBuilder ab = new StringBuilder();
        for (int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch!= ' '){
                ab.append(ch);

            } else {
                ab.reverse();
                sb+=ab;
                sb+=" ";
                ab = new StringBuilder("");

            }
        }
        ab.reverse();
        sb+=ab;

        System.out.println(sb);




    }
}
//Study it again