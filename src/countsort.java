public class countsort {

    // Function to find the maximum element in the array
    static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    // Counting Sort function (Stable version)
    static void Stablecountsort(int[] arr) {
        int n = arr.length;
        int[] output = new int[n];

        // Find the maximum element in the array
        int max = findMax(arr);

        // Create an array to store the count of each element
        int[] count = new int[max + 1];

        // Count the occurrences of each element in the input array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Update the count array to store cumulative count
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Reconstruct the sorted array based on the count array
        for (int i = n - 1; i >= 0; i--) {
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }

        // Copy the sorted elements back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // Counting Sort function (Basic version)
    static void countsort(int[] arr) {
        // Find the maximum element in the array
        int max = findMax(arr);

        // Create an array to store the count of each element
        int[] count = new int[max + 1];

        // Count the occurrences of each element in the input array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Reconstruct the sorted array based on the count array
        int k = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }
        }
    }

    // Display function to print the elements of an array
    static void display(int[] arr) {
        for (int j : arr) {
            System.out.println(j);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Sample array
        int[] arr = {4, 3, 1, 5, 3, 3, 5, 1};

        // Perform counting sort on the array (Stable version)
        Stablecountsort(arr);

        // Display the sorted array
        display(arr);
    }
}
