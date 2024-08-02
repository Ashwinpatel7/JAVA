//bubble sort problem
public class Bubblesortques {
     static void  zerosort(int[] arr){
         int n = arr.length;
         for(int i=0; i<n-1; i++){
             for(int j=0; j<n-i-1; j++){
                 if(arr[j]==0 && arr[j + 1]!=0){
                     int temp =arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;

                 }
             }
         }
     }
     static void lexography(String[] arr){
         int n =arr.length;
         for(int i =0; i<n-1; i++){
             int minIndex =i;
             for(int j =i+1; j<n; j++){
                 if (arr[j].compareTo(arr[minIndex])<0){
                     minIndex=j;
                 }
             }
             String temp = arr[i];
             arr[i] = arr[minIndex];
             arr[minIndex] = temp;
         }
     }
    public static void main(String[] args) {
        String[] arr = {"kiwi","orange","banana","apple","papaya"};
        lexography(arr);
        for (String j : arr) {
            System.out.println(j);
        }
    }
}