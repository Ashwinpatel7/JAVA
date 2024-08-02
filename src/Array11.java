//Rotating an array by k where k is a user input
import java.util.Scanner;


public class Array11{
    static void swapInarray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] = temp;
}
    static void reverseArray(int[] arr,int i,int j) {
        while (i < j) {
            swapInarray(arr, i, j);
            i++;
            j--;
        }
    }
    static void rotateinplace(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        reverseArray(arr,0,n-k-1);
        reverseArray(arr, n-k,n-1);
        reverseArray(arr,0,n-1);

    }

    static void printArray(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    static int[] rotate(int[] arr, int k){
        int n =arr.length;
        k=k%n;
        int[] ans = new int[n];
        int j =0;
        for(int i =n-k; i<n; i++){
            ans[j++] = arr[i];
        }
        for(int i = 0; i<n-k; i++){
            ans[j++] = arr[i];
        }
return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        System.out.println("original array");{
            printArray(arr);
            rotateinplace(arr,k);
            System.out.println("Reversed array");
            printArray(arr);
        }



    }
}
