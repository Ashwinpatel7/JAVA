////Use of continue keyword
//public class loops4 {
//    public static void main(String[] args) {
//        for(int num=1; num<=100; num++){
//            if (num%3==0){
//                continue;
//            }
//            System.out.println(num);
//        }
//    }
//}

//Use of continue keyword in while loop
public class loops4 {
    public static void main(String[] args) {
        int num = 1;
        while(num<=100){
            if (num%3==0){
                num++;
                continue;

            }

            System.out.println(num);
            num++;
        }
    }
}