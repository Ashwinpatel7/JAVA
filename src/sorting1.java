import java.util.Scanner;
//Bubble sorting
public class sorting1 {
    static void Bubble(int[] a) {
        int n = a.length;
        //For n-1 iterations
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {// As the ith no present in array is already sorted
                if (a[j] > a[j + 1]) {
                    //We will perform swapping
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }
           if (!flag) return;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {7,4,5,7,8,9};
        Bubble(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}