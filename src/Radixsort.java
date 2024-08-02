public class Radixsort {

    // Display function to print the elements of an array
    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // Radix Sort function
    static void radixsort(int[] arr) {
        // Find the maximum element in the array to determine the number of digits
        int max = findmax(arr);

        // Iterate through each digit place (ones, tens, hundreds, etc.)
        for (int place = 1; max / place > 0; place *= 10) {
            // Call countsort to sort the array based on the current digit place
            countsort(arr, place);
        }
    }

    // Function to find the maximum element in the array
    static int findmax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx)
                mx = arr[i];
        }
        return mx;
    }

    // Counting Sort function for Radix Sort
    static void countsort(int[] arr, int place) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];  // Count array for digits 0 to 9

        // Count the occurrences of each digit at the specified place
        for (int i = 0; i < arr.length; i++) {
            count[(arr[i] / place) % 10]++;
        }

        // Update the count array to store cumulative count
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Reconstruct the sorted array based on the count array
        for (int i = n - 1; i >= 0; i--) {
            int idx = count[(arr[i] / place) % 10] - 1;
            output[idx] = arr[i];
            count[(arr[i] / place) % 10]--;
        }

        // Copy the sorted elements back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // Main method
    public static void main(String[] args) {
        // Sample array
        int[] arr = {4, 5, 8, 1, 2, 3, 0, 5, 3};

        // Perform Radix Sort on the array
        radixsort(arr);

        // Display the sorted array
        display(arr);
    }
}
