//import java.util.Scanner;
//
//public class Array16 {
//    static int[] prefixSumArray(int[] arr) {
//        int n = arr.length;
//        int[] pref = new int[n];
//        pref[0] = arr[0];
//        for (int i = 1; i < n; i++) {
//            pref[i] = pref[i - 1] + arr[i];
//
//        }
//        return pref;
//
//    }
//
//
//    static void printArray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array");
//        int a = sc.nextInt();
//        int[] arr = new int[a];
//
//        System.out.println("Enter elements of the array");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("The original array is");
//        printArray(arr);
//        int[] pref = prefixSumArray(arr);
//        printArray(pref);
//
//    }
//}
//Different approach without making a new array

import java.util.Scanner;

public class Array16 {
    static int[] prefixSumArray(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];

        }
        return arr;

    }


    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int a = sc.nextInt();
        int[] arr = new int[a];

        System.out.println("Enter elements of the array");
        for (int i = 1; i <= arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The original array is");
        printArray(arr);
        int[] pref = prefixSumArray(arr);
        printArray(pref);

    }
}
