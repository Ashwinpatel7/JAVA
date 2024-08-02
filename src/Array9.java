//This question  involves finding the same number which is repeating if not give the answer as -1
//To find maximum and second maximum of the given array.
import java.util.Scanner;

public class Array9 {
    static int firstRepeatingNumber(int[] arr) {

        int n = arr.length;
        for (int i = 0; i <n; i++) {//A for loop is used to traverse whole array and to compare it with n which is minimum possible value of a integer
         for(int j =i+1; j<n; j++)  {
             if(arr[i]==arr[j]){
                 return arr[i];
             }
            }

        }
        return -1;



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

        System.out.println("The first repeating number is  "+ firstRepeatingNumber(arr));
    }
}
