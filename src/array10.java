//public class array10 {
//
//    static  void swap(int a ,int b){
//        System.out.println("Original value before swap");
//        System.out.println("a" + a);
//        System.out.println("a" + b);
//        int temp=a;
//        /* What happens here is we lsot the original value of a so we will store the value of a in a third variable temp */
//        a=b;
//        b=temp;
//        System.out.println("Original value after swap");
//        System.out.println("a" + a);
//        System.out.println("b" + b);
//
//    }
//
//    public static void main(String[] args) {
//        int a=9;
//        int b = 5;
//        int[] arr1 = {5,6,7,8,9};
//        swap(a,b);
//
//
//    }
//Using maths or simply sum and difference
//    public class array10 {

//        static  void swap(int a ,int b){
//            System.out.println("Original value before swap");
//            System.out.println("a" + a);
//            System.out.println("a" + b);
//            a=a+b;//this result in 14
//            b=a-b;// This result in 14-5=9
//            a=a-b;//This result in 14-9=5
//
//            System.out.println("Original value after swap");
//            System.out.println("a" + a);
//            System.out.println("b" + b);

//public class array10{
//    static void printArray(int[] arr){
//        for(int i=0; i< arr.length; i++){
//            System.out.println(arr[i]);
//        }
//    }   // This mehod employees creation of a new array and further wise chsnges the array in a reversal manner using loops.
//static int[] reverseArray(int[] arr){
//            int n = arr.length;
//            int[] ans = new int[n];
//            int j =0;
//            // traversing an array in reverse direction
//    for(int i =n-1; i>=0; i--){
//        ans[j++] = arr[i];//The j++ is post increment operator so value of 0 index will be shifted to last position of next array.
//
//
//    }
//    return ans;
//}
//        public static void main(String[] args) {
//            int a=9;
//            int b = 5;
//            int[] arr1 = {5,6,7,8,9};
//            int[] ans = reverseArray(arr1);
//            printArray(ans
//            );
//
//
//
//
//        }
//    }

    //Without creating a new array We will employee swapping for this


public class array10{
    static void printArray(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }   // This mehod employees creation of a new array and further wise chsnges the array in a reversal manner using loops.
//    static int[] reverseArray(int[] arr){
//        int n = arr.length;
//        int[] ans = new int[n];
//        int j =0;
//        // traversing an array in reverse direction
//        for(int i =n-1; i>=0; i--){
//            ans[j++] = arr[i];//The j++ is post increment operator so value of 0 index will be shifted to last position of next array.
//
//
//        }
//        return ans;
//    }
    static void swapInarray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] = temp;

    }

    static void reverseArray(int[] arr){
        int i=0,j= arr.length-1;
        while (i<j){
            swapInarray(arr,i,j);
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        int a=9;
        int b = 5;
        int[] arr1 = {5,6,7,8,9,10};
        reverseArray(arr1);
        printArray(arr1
        );




    }
}



