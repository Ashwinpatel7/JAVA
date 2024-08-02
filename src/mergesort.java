public class mergesort {
    // Method to merge two sorted subarrays.
    static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;          // Size of the left subarrays
        int n2 = r - mid;              // Size of the right subarrays

        // Create temporary arrays to store the elements of the two subarrays.
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data to temporary arrays left[] and right[].
        for (int i = 0; i < n1; i++)
            left[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            right[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = l;        // Indices for left, right, and merged array

        // Merge the two subarrays back into the original array 'arr'.
        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy any remaining elements of the left and right subarrays, if any.
        while (i < n1)
            arr[k++] = left[i++];
        while (j < n2)
            arr[k++] = right[j++];
    }

    // Recursive method to perform Merge Sort on the given array.
    static void mergesort(int[] arr, int l, int r) {
        // Base case: if the subarray has 0 or 1 elements, it is already sorted.
        if (l >= r)
            return;

        int mid = (l + r) / 2;          // Calculate the middle index

        // Recursively sort the first and second halves of the subarray.
        mergesort(arr, l, mid);
        mergesort(arr, mid + 1, r);

        // Merge the sorted halves.
        merge(arr, l, mid, r);
    }

    // Main method to test the Merge Sort implementation.
    public static void main(String[] args) {
        int[] arr = {5, 4, 9, 8, 1, 5, 0, 2};  // Input array with unsorted elements
        int n = arr.length;                      // Length of the array

        // Call the mergesort method to sort the array.
        mergesort(arr, 0, n - 1);

        // Print the sorted array.
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
