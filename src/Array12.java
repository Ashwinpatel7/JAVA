//The concept of frequency arrays
import java.sql.SQLOutput;
import java.util.Scanner;
public class Array12 {
    static int[] makeFrequencytArray(int[] arr) {
        int[] freq = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;

        }
        return freq;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int a = sc.nextInt();
        int[] arr = new int[a];

        System.out.println("Enter number of elements");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        int[] freq = makeFrequencytArray(arr);
        System.out.println("Enter no of queries");
        int q = sc.nextInt();
        while(q>0){
            System.out.println("Enter the value of q");
            int c =sc.nextInt();
            if (freq[c]>0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

            q--;
        }
    }


}
