//Manipulating arrays using loops in this question we have to find the only no which is not being repeated in the array
import java.util.Scanner;

public class Array7 {
    static int findUniqueNo(int[] arr) {

        int n = arr.length;
        //This is used to store the length of array to which the for loop will be traversed
        for (int i = 0; i < n; i++) {//This will traverse the array for the first time
            for (int j = i + 1; j < n; j++)//This will traverse the array for the second time
            {
                    if (arr[i]== arr[j] ) {
                        arr[i]=-1;
                        arr[j]=-1;


                    }
                }
            }
        int ans =-1;
        for (int i=0; i<n; i++){// This loop is used to assign the unique value to answer variable
            if(arr[i]>0){
                ans=arr[i];

            }
        }
        return ans;


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

        System.out.println("The unique number in the array is"+ findUniqueNo(arr));
    }
}
