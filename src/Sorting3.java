import java.util.Scanner;

public class Sorting3 {
    static void Insertion(int[] arr){
        int n = arr.length;
        for (int i = 0; i<n; i++){
            int j =i;
            while (j>0 && arr[j]<arr[j-1]){//This is corrxct order as and operator operates from left to right
                //Swap the values
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = arr[j];
                j--;

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr ={5,3,45,76,13,98,12,32};
        Insertion(arr);
        for (int j : arr) {
            System.out.println(j);
        }

    }
}