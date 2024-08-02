public class binarysearch6 {

    // Method to check if it's possible to place 'k' kids with minimum distance 'dist'
    static boolean isPossible(int[] a, int k, int dist) {
        int kidsPlaced = 1;  // At least one kid can always be placed
        int lastKid = a[0];  // Position of the first kid

        // Iterate through the positions of the remaining kids
        for (int i = 1; i < a.length; i++) {
            // If the distance between the current kid and the last kid placed is at least 'dist'
            if (a[i] - lastKid >= dist) {
                kidsPlaced++;
                lastKid = a[i];  // Update the position of the last kid placed
            }
        }

        // Check if it's possible to place 'k' kids with the given minimum distance 'dist'
        return kidsPlaced >= k;
    }

    // Binary search to find the maximum minimum distance to place 'k' kids
    static int racetrack(int[] a, int k) {
        if (k > a.length) {
            // If the number of kids to be placed is greater than the available positions, return -1
            return -1;
        }

        int start = 0;                 // Minimum possible distance
        int end = (int) 1e9;           // Maximum possible distance
        int ans = -1;                  // The result to be returned

        // Binary search loop
        while (start <= end) {
            int mid = (start + end) / 2;

            // If it's possible to place 'k' kids with minimum distance 'mid',
            // update 'ans' and search in the right half
            if (isPossible(a, k, mid)) {
                ans = mid;
                start = mid + 1;
            } else {
                // If it's not possible, search in the left half
                end = mid - 1;
            }
        }

        // Return the maximum minimum distance to place 'k' kids
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 9};  // Positions of the race track
        int k = 3;                    // Number of kids to be placed
        System.out.println(racetrack(arr, k));
    }
}
