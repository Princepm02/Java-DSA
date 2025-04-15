public class selectionSort {
    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };

        // Selection Sort: This algorithm sorts an array by repeatedly finding the minimum element from the unsorted part and putting it at the beginning.
        for (int i = 0; i < arr.length - 1; i++) {
            // Outer loop iterates through the array, marking the beginning of the unsorted part. It goes up to the second last element.
            int smallest = i; // Assume the current element is the smallest in the unsorted part.
            for (int j = i + 1; j < arr.length; j++) {
                // Inner loop iterates through the remaining unsorted part to find the actual smallest element. It goes up to the last element.
                if (arr[smallest] > arr[j]) {
                    // If a smaller element is found, update the index of the smallest element.
                    smallest = j;
                }
            }
            // After the inner loop, 'smallest' holds the index of the minimum element in the unsorted part.
            // Swap the found smallest element with the element at the current index 'i'.
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }

        System.out.print("Sorted Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
// Output => Sorted Array : 1 2 3 7 8 
