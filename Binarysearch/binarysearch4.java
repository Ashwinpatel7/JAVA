public class BinarySearch4 {

    // Function to find the peak element in an uphill mountain array
    static int peakMountain(int[] a) {
        int st = 0, end = a.length - 1;
        int ans = -1; // Initialize ans to -1, as it will hold the peak element index

        while (st <= end) {
            int mid = (st + end) / 2;

            if (a[mid] < a[mid + 1]) {
                // If the current element is less than the next one, move right
                ans = mid + 1; // Update ans to the potential peak index
                st = mid + 1;
            } else {
                // If the current element is greater than or equal to the next one, move left
                end = mid - 1;
            }
        }
        return ans;
    }
    //Peak is basically a number after and before which numbers are smaller

    static int findingPeak(int[] arr){
        int n =arr.length;
        int st =0,end = n-1;
        while (st<=end){
            int mid = (st+end)/2;
            if(mid==0||arr[mid]>arr[mid-1])&&(mid==n-1||arr[mid]>arr[mid+1]){
                return mid;
            }
            if (arr[mid] < arr[mid+1]){//Uphill ascending
               st =mid+1;
        }
            else {
                end = mid-1;
            }


    }

    public static void main(String[] args) {
        // Main method, you can add test cases or call the peakMountain function here
    }
}
