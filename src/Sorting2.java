import java.util.Scanner;

public class Sorting2 {
    static void selection(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {//To pass and traverse the whole array and represent the current index.
            int minIndex = i;//This line assign a min index value
            for (int j =i+1; j<n; j++){
                if (arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            //We will swap the current index value wiuth minimum index value so that the array will be sorted
            int temp = arr[i];
            arr[i]= arr[minIndex];
            arr[minIndex]= temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,3,5,7,3,5,2,4,0,3,21,3};
        selection(arr);
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}