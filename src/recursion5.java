public class recursion5 {
    static void printArray(int[] arr, int index){
        if(index==arr.length) return;//BAse case

        System.out.print(arr[index]+" ");// Self work
        printArray(arr,index+1);//Small problem by recursion
    }
    static int maxArray(int[] arr, int index){
        if (index==arr.length-1) return arr[index];// Base case
        int smallwork = maxArray(arr,index+1);//Small problem
        return Math.max(smallwork,arr[index]);



    }
    static int sumOfArray(int[] arr, int index){
        if (index==arr.length-1) return arr[index];//Base case
        int smallwork = sumOfArray(arr,index+1);//Recursive part
                return (smallwork+arr[index]);// Self-Work
    }
    static  void Indexpair(int[] arr,int n, int index, int target){
        if(index>=arr.length) return;// Base case
        if(arr[index]==target) {
            System.out.println(index);//We will not return here as question has asked us to give all the index values

        }
        Indexpair(arr,n,index+1,target);


    }

    static boolean targetValue(int[] arr,int n, int index, int target){
        if(index>=arr.length) return false;//Base case
        if (arr[index]==target) return true;//Self work
//        if(targetValue(arr,n,index+1,target)){//Recursive work
//            return true;
//        }else {
//            return false;
//        }
return (targetValue(arr,n,index+1,target));



    }
//Return index of target if target is present otherwise -1
    static int Indexvalue(int[] arr,int n, int index, int target){
        if(index>=arr.length) return -1;//Base case
        if (arr[index]==target) return index;//Self work
//        if(targetValue(arr,n,index+1,target)){//Recursive work
//            return in;
//        }else {
//            return false;
//        }
        return (Indexvalue(arr,n,index+1,target));



    }
    public static void main(String[] args) {

        int[] arr = {2,3,4,8,6,8,7,6,8};
        int target = 8;
        printArray(arr,0);
        System.out.println(maxArray(arr,0));
        System.out.println(sumOfArray(arr,0));
//        if(targetValue(arr, arr.length,0,target)) {
//            System.out.println("Yes");}
//        else{
//            System.out.println("No");
//
//        }
//        System.out.println(Indexvalue(arr,arr.length,0,target));
        Indexpair(arr,arr.length,0,target);
    }
}