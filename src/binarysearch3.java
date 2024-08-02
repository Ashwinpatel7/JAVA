public class binarysearch3 {

    // Function to find the index of a target number in a rotated sorted array
    static int targetIndex(int[] a, int target) {
        int n = a.length;
        int st = 0, end = n - 1;

        while (st <= end) {
            int mid = (st + end) / 2;

            // If the middle element is equal to the target, return its index
            if (a[mid] == target)
                return mid;

            // Check if the right half of the array is sorted
            if (a[mid] < a[end]) {
                // If the target lies in the right half, update the start index
                if (target > a[mid] && target <= a[end]) {
                    st = mid + 1;
                } else {
                    // Otherwise, update the end index
                    end = mid - 1;
                }
            } else {
                // If the right half is not sorted, check the left half
                // Update start or end index accordingly
                if (target >= a[st] && target < a[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        }

        // If the target is not found, return -1
        return -1;
    }

    // Function to find the index of the minimum element in a rotated sorted array
    static int findMinimumIndex(int[] a) {
        int n = a.length;
        int st = 0, end = n - 1;
        int ans = -1;

        while (end >= st) {
            int mid = (end + st) / 2;

            // Check if the middle element is less than or equal to the last element
            if (a[mid] <= a[n - 1]) {
                // Update the answer and search in the left half
                ans = mid;
                end = mid - 1;
            } else {
                // If the middle element is greater than the last element, search in the right half
                st = mid + 1;
            }
        }

        // Return the index of the minimum element
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2, 3};
        int target = 7;

        // Print the index of the minimum element
        System.out.println("Index of minimum element: " + findMinimumIndex(arr));

        // Print the index of the target element using the rotated array
        System.out.println("Index of target element: " + targetIndex(arr, target));
    }
}
