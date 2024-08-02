import java.util.Scanner;

public class Array18 {
    static int findArraySum(int[] arr){
        int totalsum=0;
        for(int i=0; i< arr.length; i++){
            totalsum+= arr[i];
        }
        return totalsum;
    }
    static  boolean prefixSum(int[] arr){
        int totalsum = findArraySum(arr);
        int prefixsum =0;
        for(int i =0; i<arr.length; i++){
            prefixsum+=arr[i];
            int suffixsum = totalsum-prefixsum;
            if(suffixsum==prefixsum){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter the elements of the array");
        for(int i =0; i<a; i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("Equal partition possible" + prefixSum(arr));
    }
}