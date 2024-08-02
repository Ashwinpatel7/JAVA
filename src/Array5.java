//Target sum problem using array
//The method to solve this problem is using nested loop
import java.util.Scanner;

public class Array5 {
    static int pairSum(int[] arr, int target) {

        int n = arr.length;
        int answ =0;
        //This is used to store the length of array to which the for loop will be traversed
        for (int i = 0; i < n; i++) {//This will take the first number
            for (int j = i + 1; j < n; j++)//The j is initialized as the next number is checked not the previous one
            {
                if (arr[i] + arr[j] == target) {
                    answ++;

                }
            }
        }
        return answ;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter the " + a + "Elements");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target sum");
        int target = sc.nextInt();
        System.out.println(pairSum(arr, target));
    }
}
