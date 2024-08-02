import java.util.Scanner;
public class Array3{
    static void printArray(int[] arr){
        for(int i=0;i< arr.length; i++){
            System.out.println(arr[i] +"");
        }
        System.out.println();
    }


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the array");
    int n = sc.nextInt();
    int [] arr1 = new int[n];
    System.out.println("Enter the" + n+  "value");
    for(int i =0; i< arr1.length; i++){

        arr1[i] = sc.nextInt();

    }
    printArray(arr1);

    int[] arr2 = arr1;//This is a shallow copy the reference is being copied not new memory is being given
    printArray(arr2);


}

}
//We will use method of arr.clone to deep copy the array so that original array does not get affected due to any change in copied array.
//We can also use copy of method for it
