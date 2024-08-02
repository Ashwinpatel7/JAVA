public class quicksort {

    // Method to swap elements at indices x and y in the array arr.
    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    // Method to partition the array and return the index of the pivot element.
    static int partition(int[] arr, int st, int end) {
        int pivot = arr[st];  // Choose the first element as the pivot.
        int count = 0;

        // Count elements smaller than the pivot in the range [st+1, end].
        for (int i = st + 1; i <= end; i++) {
            if (arr[i] < pivot) {
                count++;
            }
        }

        int pivotIdx = st + count;  // Index where the pivot should be placed after partitioning.
        swap(arr, st, pivotIdx);    // Swap the pivot with its correct position.

        int i = st;
        int j = end;

        // Partition the remaining elements based on the pivot.
        while (i < pivotIdx && j > pivotIdx) {
            while (arr[i] <= pivot) i++;
            while (arr[j] >= pivot) j--;

            // Swap elements on the left and right of the pivot.
            if (i < pivotIdx && j > pivotIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return pivotIdx;  // Return the index of the pivot after partitioning.
    }

    // Recursive method to perform QuickSort on the given array.
    static void quicksort(int[] arr, int st, int end) {
        if (st >= end) return;  // Base case: return if the subarray has 0 or 1 elements.

        int pi = partition(arr, st, end);  // Get the pivot index after partitioning.

        // Recursive calls on the two halves of the array.
        quicksort(arr, st, pi - 1);
        quicksort(arr, pi + 1, end);
    }

    // Main method to test the QuickSort implementation.
    public static void main(String[] args) {
        int[] arr = {5, 4, 9, 8, 1, 5, 0, 2};  // Input array with unsorted elements.
        int n = arr.length;  // Length of the array.

        // Call the quicksort method to sort the array.
        quicksort(arr, 0, n - 1);

        // Print the sorted array.
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
