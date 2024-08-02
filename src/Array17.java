import java.util.Scanner;
public class Array17 {
    static int[] prefixSumArray(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1] ;

        }
        return arr;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int a = sc.nextInt();
        int[] arr = new int[a + 1];

        System.out.println("Enter elements of the array");
        for (int i = 1; i <= a; i++) {
            arr[i] = sc.nextInt();
        }
        int[] prefSum = prefixSumArray(arr);
        System.out.println("Enter number of queries");
        int q = sc.nextInt();
        while (q-- >0) {
            System.out.println("Enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int sum =prefSum[r]-prefSum[l-1];
            System.out.println("Answer is"+sum);
        }

    }
}