public class binarysearch5 {

    // Method to check if it's possible to distribute chocolates
    static boolean isDistributionPossible(int[] a, int m, int maxChocolatesAllowed) {
        int numOfStudents = 1;
        int chocolates = 0;

        // Iterate through the array to distribute chocolates
        for (int i = 0; i < a.length; i++) {
            // If a student is assigned more chocolates than allowed, return false
            if (a[i] > maxChocolatesAllowed) {
                return false;
            }

            // If adding the current chocolates doesn't exceed the limit, add them
            if (chocolates + a[i] <= maxChocolatesAllowed) {
                chocolates += a[i];
            } else {
                // If adding the current chocolates exceeds the limit, assign them to a new student
                numOfStudents++;
                chocolates = a[i];
            }
        }

        // Check if the total number of students is less than or equal to the allowed maximum
        return numOfStudents <= m;
    }

    // Binary search to find the minimum value of maxChocolatesAllowed
    static int distributeChocolates(int[] a, int m) {
        if (a.length < m) {
            // If there are fewer chocolates than students, return -1
            return -1;
        }

        int ans = 0, start = 1, end = (int) 1e9;

        // Binary search loop
        while (start <= end) {
            int mid = (start + end) / 2;

            // If distribution is possible with the current maxChocolatesAllowed, update ans and search in the left half
            if (isDistributionPossible(a, m, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                // If distribution is not possible, search in the right half
                start = mid + 1;
            }
        }

        // Return the minimum value of maxChocolatesAllowed satisfying the conditions
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2};
        int m = 3;

        // Call the distributeChocolates method and print the result
        System.out.println(distributeChocolates(arr, m));
    }
}
