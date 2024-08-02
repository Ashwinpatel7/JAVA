//To find maximum and second maximum of the given array.
import java.util.Scanner;

public class Array8 {
    static int findMax(int[] arr) {

        int n = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {//A for loop is used to traverse whole array and to compare it with n which is minimum possible value of a integer
            if (arr[i] > n) {
                n = arr[i];
            }
        }


        return (n);
    }
static int findSecondMax(int[] arr){
        int mx = findMax(arr);
        for(int i = 0; i< arr.length; i++){
            if (arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);//We are calling findmax function here and passing a parameter through this.
        return secondMax;
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

        System.out.println("The second max number in the array is "+ findSecondMax(arr));
    }
}
