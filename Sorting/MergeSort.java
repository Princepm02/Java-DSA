public class MergeSort {
    /**
     * Merge Sort Algorithm
     * Time Complexity: O(n log n) in all cases
     * Space Complexity: O(n) for temporary array
     * 
     * Recursively divides the array into halves until each subarray has one element.
     * @param arr the array to sort
     * @param si  starting index
     * @param ei  ending index
     */
    public static void divide(int[] arr, int si, int ei) {
        // Base case: if the subarray has one or zero elements, it's already sorted
        if (si >= ei) {
            return;
        }
        // Find midpoint to split the array
        // Use this formula to avoid overflow:
        // (si + ei) might exceed Integer.MAX_VALUE for large indices
        int mid = si + (ei - si) / 2;

        // Recursively divide left half
        divide(arr, si, mid);
        // Recursively divide right half
        divide(arr, mid + 1, ei);
        // Merge the sorted halves
        conquer(arr, si, mid, ei);
    }

    /**
     * Merges two sorted subarrays into one sorted array.
     * @param arr the original array containing both subarrays
     * @param si  starting index of the first subarray
     * @param mid ending index of the first subarray
     * @param ei  ending index of the second subarray
     */
    public static void conquer(int[] arr, int si, int mid, int ei) {
        // Temporary array to hold merged result
        int[] merged = new int[ei - si + 1];
        int idx1 = si;      // Pointer for left subarray
        int idx2 = mid + 1; // Pointer for right subarray
        int x = 0;          // Pointer for merged array

        // Compare elements from both subarrays and copy the smaller one
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        // Copy any remaining elements from left subarray
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        // Copy any remaining elements from right subarray
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }
        // Copy merged elements back into original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array:");
        printArray(arr);

        // Call divide to start merge sort
        divide(arr, 0, arr.length - 1);

        System.out.println("\nSorted array:");
        printArray(arr);
    }

    // Helper method to print array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

/*
Output =>
Original array:
38 27 43 3 9 82 10 

Sorted array:
3 9 10 27 38 43 82
*/


/*
Where and why to use Merge Sort instead of Quick Sort:
- Use Merge Sort when:
  1. Stability is required: Merge Sort preserves the relative order of equal elements.
  2. Linked lists: Merge Sort performs well on linked lists without the need for extra space.
  3. Worst-case performance guarantees: Merge Sort has O(n log n) time complexity in all cases,
     whereas Quick Sort can degrade to O(n^2) on already sorted or specially crafted inputs.
- Quick Sort is often faster on average and uses less auxiliary space (in-place),
  but Merge Sort is preferred when consistent performance and stability are more important.
*/
