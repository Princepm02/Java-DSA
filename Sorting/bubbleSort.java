public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };

        // Bubble Sort: This algorithm repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order.
        // The pass through the list is repeated until the list is sorted. Larger elements "bubble" to the end of the list.
        // Time complexity = O(n^2)
        for (int i = 0; i < arr.length - 1; i++) {
            // Outer loop controls the number of passes. After each pass, the largest unsorted element moves to its correct position at the end.
            for (int j = 0; j < arr.length - i - 1; j++) {
                /* Inner loop compares adjacent elements up to the unsorted part of the array.
                    Explanation for 'arr.length - i - 1':
                    - 'arr.length' is the total number of elements.
                    - After the 'i'-th pass of the outer loop, the last 'i' elements are already in their correct sorted positions.
                    - Therefore, we don't need to compare these already sorted elements again.
                    - The '- 1' is because we are comparing arr[j] with arr[j+1], so the inner loop index 'j' should go up to one 
                        position before the effective end of the unsorted part. */
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1] if they are in the wrong order (arr[j] is greater than arr[j+1]).
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("Sorted Array : ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
// Output => Sorted Array : 1 2 3 7 8 
