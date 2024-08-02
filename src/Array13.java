// SOrting an array consisting of 0 and 1  but this method employees two traversal which have more time and space complexity
//import java.util.Scanner;
//public class Array13 {
//    static void printArray(int[] arr){
//        for(int i=0; i< arr.length; i++){
//            System.out.println(arr[i]);
//        }
//    }
//    static void swapInarray(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//    static void sortzeroesandone(int[] arr){
//        int n = arr.length;
//        int zeroes = 0;
////        for counting the number of zeroes
//        for (int i =0; i<n; i++){
//            if(arr[i]==0){
//                zeroes++;
//            }
//        }
//        //one more loop in which 0 to zeroes-1 the value will be zero and from zero to nvalue will be 1
//        for (int i=0; i<n; i++){
//            if(i<zeroes){
//                arr[i]=0;
//            }
//            else {
//                arr[i] =1;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array");
//        int a = sc.nextInt();
//        int[] arr = new int[a];
//
//        System.out.println("Enter elements of the array");
//        for (int i = 0; i< arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("The original array is");
//        printArray(arr);
//        sortzeroesandone(arr);
//        System.out.println("Sorted array is");
//        printArray(arr);
//
//
//    }
//}
// Using only one traversal
import java.util.Scanner;
public class Array13 {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void swapInarray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortzeroesandone(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swapInarray(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 0) {
                right--;
            }

        }
        printArray(arr);
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int a = sc.nextInt();
            int[] arr = new int[a];

            System.out.println("Enter elements of the array");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("The original array is");
            printArray(arr);
            sortzeroesandone(arr);
            System.out.println("Sorted array is");
            printArray(arr);


        }
    }

