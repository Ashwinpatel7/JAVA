public  class binarysearch4 {

    static boolean duplicatesearch(int[] a, int target) {
        int n = a.length;
        int st = 0, end = n - 1;

        while (st <= end) {
            int mid = (st + end) / 2;

            // If the middle element is equal to the target, return its index
            if (a[mid] == target)
                return true;
            else if (a[st]==a[mid]&& a[mid]==a[end]) {
                st++;
                end--;
                
            }


            // Check if the right half of the array is sorted
            if (a[mid] <=a[end]) {
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
        return false;
    }
   // Searching in a 2d matrix
    static boolean searchMatrix(int[][] a,int target){
        int n =a.length; int m = a[0].length;
        int st=0,end =n*m-1;
        while (st<=end){
            int mid = (st+end)/2;
            int midElt =a[mid/m][mid%m];
            if (midElt==target) return true;
            if (target<midElt){
                end= mid-1;
            } else {
                st = mid+1;
            }
        }
        return false;

    }
    static boolean searchMatrix1(int[][] a,int target){
        int n =a.length; int m = a[0].length;
        int i =0 , j =m-1;
        while (i<n && j>=0){
            if (a[i][j] == target) return true;
            if (target<a[i][j]){
                j--;//Move left

            }
            else {
                i++;// Move down
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,2,3,1,1};
        int target = 3;
        System.out.println(duplicatesearch(arr,target));

    }
}
