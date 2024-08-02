import java.util.ArrayList;
import java.util.Scanner;

public class recursion6 {
//    1,3,4,3-
//    target= 3
//    ans(arraylist) ={1,3}
    static ArrayList<Integer> findIndices(int[] arr, int n, int index,int target){
//        Base case
        if (index>=n){
            return new ArrayList<Integer>();//Return empty arraylist
        }
        ArrayList<Integer> ans = new ArrayList<>();
//        Self work
        if (arr[index]==target){
            ans.add(index);
        }
ArrayList<Integer> smallans =findIndices(arr,n,index+1,target);//Recursive work
ans.addAll(smallans);
return ans;
    }
    public static void main(String[] args) {
        int[] a ={5,8,10,8,7};
        int target = 8;
        int n =a.length;
         ArrayList<Integer> ans = findIndices(a,n,0,target);
         for (Integer i:ans) {
             System.out.println(i);
         }
    }
}