public class binarysearch2 {
    // Function to find the first occurrence of a target element in a sorted array

    static int sqrt(int x ){
        int st =0,end =x;
        int ans =-1;
        while(st<=end){
            int mid =(st+end)/2;
            int val = mid*mid;
            if(val==x) {
                return mid;
            } else if (val<=x) {
                ans = mid;
                st =mid+1;

            }
            else {
                end = mid-1;
            }
        }
        return ans;
    }
    static int firstOccurrence(int[] a, int target) {
        int n = a.length; // Get the length of the array
        int st = 0, end = n - 1; // Initialize start and end indices
        int fo = -1; // Initialize the first occurrence variable to -1

        // Loop until the start index is less than the end index
        while (st < end) {
            int mid = (st + end) / 2; // Calculate the middle index

            // Check if the target is equal to the value at the middle index
            if (a[mid] == target) {
                fo = mid; // Update the first occurrence variable
                end = mid - 1; // Search in the left half for more occurrences
            } else if (target < a[mid]) {
                end = mid - 1; // If target is less than the middle element, adjust the end index
            } else {
                st = mid + 1; // If target is greater than the middle element, adjust the start index
            }
        }

        return fo; // Return the index of the first occurrence (or -1 if not found)
    }
     static int LastOccurence(int[] a,int target){
        int n =a.length;
        int st =0,end =n-1;
        int lo =-1;
        while(st<end){
            int mid =(st+end)/2;
            if (a[mid]==target) {
                lo = mid;
                st = mid + 1;
            } else if (target<a[mid]) {
                end = mid - 1;
            } else
            {
                st = mid+1;
            }

                
            }
                return lo;
     }

    // Main method to test the firstOccurrence function
    public static void main(String[] args) {
        int[] a = {5, 6, 7, 8, 8, 8, 9}; // Sorted array
        int target = 8; // Target element to search for
        System.out.println(firstOccurrence(a, target)); // Print the result of the firstOccurrence function
        System.out.println(LastOccurence(a,target));
        System.out.println(sqrt(target));
    }
}
