public class insertionSort {
    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };

        // Insertion Sort: This algorithm builds the final sorted array one item at a time.
        // It iterates through the input elements and inserts each element into its correct position within the already sorted part of the array.
        // Time complexity = O(n^2)
        for (int i = 1; i < arr.length; i++) {
            // Outer loop iterates from the second element (index 1) to the end of the array.
            // 'current' holds the element that needs to be inserted into the sorted part.
            int current = arr[i];
            // 'j' points to the last element of the sorted part of the array.
            int j = i - 1;
            // This inner loop shifts elements in the sorted part that are greater than 'current' to the right,
            // to make space for 'current' to be inserted in its correct sorted position.
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j]; // Shift element to the right
                j--;
            }

            // Placement: After shifting the necessary elements, 'j' will be at the correct position (or -1 if 'current' is the smallest)
            // to insert 'current'.
            arr[j + 1] = current;
        }

        System.out.print("Sorted Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
// Output => Sorted Array : 1 2 3 7 8
