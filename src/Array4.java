//////import java.util.Scanner;
//////public class Array4 {
//////    static int countNumbers(int[] arr, int x) {
//////        int count = 0;
//////        for (int i = 0; i < arr.length; i++) {
//////            if (arr[i] == x) {
//////                count++;
//////            }
//////        }
//////        return count;
//////    }
//////
//////
//////    public static void main(String[] args) {
//////        Scanner sc = new Scanner(System.in);
//////        System.out.println("Enter the size of array");
//////        int a = sc.nextInt();
//////        int[] arr = new int[a];
//////        System.out.println("Enter elements");
//////        for (int i = 0; i < arr.length; i++) {
//////            arr[i] = sc.nextInt();
//////        }
//////        System.out.println("Enter no");
//////        int x = sc.nextInt();
//////
//////        System.out.println("Count of x" + countNumbers(arr,x));
//////
//////    }
//////}
////
////import java.util.Scanner;
////public class Array4 {
////    static int lastNumber(int[] arr, int x) {
////        int lastIndex=-1 ;
////        for (int i = 0; i < arr.length; i++) {
////            if (arr[i] == x) {
////                lastIndex=i;
////            }
////        }
////        return lastIndex;
////    }
////
////
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the size of array");
////        int a = sc.nextInt();
////        int[] arr = new int[a];
////        System.out.println("Enter elements");
////        for (int i = 0; i < arr.length; i++) {
////            arr[i] = sc.nextInt();
////        }
////        System.out.println("Enter no");
////        int x = sc.nextInt();
////
////        System.out.println("Last occurence  of x" + lastNumber(arr,x));
////
////    }
////}
////
//import java.util.Scanner;
//public class Array4 {
//    static int BiggerNumber(int[] arr, int x) {
//        int bignumber=0 ;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] >x) {
//                bignumber++;
//            }
//        }
//        return bignumber;
//    }
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of array");
//        int a = sc.nextInt();
//        int[] arr = new int[a];
//        System.out.println("Enter elements");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Enter no");
//        int x = sc.nextInt();
//
//        System.out.println("Total number of integer greater than x" + BiggerNumber(arr,x));
//
//    }
//}
//
//
//
import java.util.Scanner;
public class Array4 {
    static boolean sort(int[] arr) {
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                check=false;
                break;
            }
        }
        return check;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println("Enter no");
//        int x = sc.nextInt();

        System.out.println("Is sorted " + sort(arr));

    }
}


