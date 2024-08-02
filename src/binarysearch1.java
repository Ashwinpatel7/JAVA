public class binarysearch1 {
    // Function to perform binary search on a sorted array
    static boolean Binarysearch(int[] a, int target) {
        int n = a.length;  // Get the length of the array
        int st = 0;  // Initialize start index
        int end = n - 1;  // Initialize end index

        // Loop until the start index is less than or equal to the end index
        while (st <= end) {
            int mid = (st + end) / 2;  // Calculate the middle index

            // Check if the target is equal to the value at the middle index
            if (target == a[mid]) {
                return true;  // Target found, return true
            } else if (target < a[mid]) {
                // If target is less than the middle element, adjust the end index
                end = mid - 1;
            } else {
                // If target is greater than the middle element, adjust the start index
                st = mid + 1;
            }
        }


        // If the loop completes and the target is not found, return false
        return false;
    }

    static boolean recursivebinarysearch(int[] a, int st, int end, int target) {
        int n = a.length;
        int mid = (st + end) / 2;
        if (st > end) {
            return false;
        }
        if (target == a[mid]) {
            return true;

        } else if (target < a[mid]) {
           return recursivebinarysearch(a, st, mid - 1, target);
        } else {
            return recursivebinarysearch(a, mid + 1, end, target);

        }

    }


    // Main method to test the binary search function
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};  // Sorted array
        int target = 4;  // Target element to search for
        int st = 0;
        int end = a.length-1;
        System.out.println(Binarysearch(a, target));  // Print the result of the binary search
        System.out.println(recursivebinarysearch(a,st,end,target));
    }
    }


