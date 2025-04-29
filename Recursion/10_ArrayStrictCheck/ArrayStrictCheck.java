public class ArrayStrictCheck {

    /*
    Recursively checks if the array is strictly increasing from the given index onwards.
    This implementation uses short-circuiting.

    Time Complexity: O(n), Space Complexity: O(n)
    
    arr - The input integer array.
    idx - The current index being checked (starts from 0).
    return -> true if the array is strictly increasing from idx to the end, false otherwise.
    */
    public static boolean checkIfIncreasing(int arr[], int idx) {
        // Base Case: If we reach the last element, it means all previous pairs were increasing.
        // An array with 1 or 0 elements is considered strictly increasing.
        if (idx == arr.length - 1) {
            return true;
        }

        // Check the current pair: Is arr[idx] strictly less than arr[idx + 1]?
        if (arr[idx] < arr[idx + 1]) {
            // If the current pair is increasing, recursively check the rest of the array
            // starting from the next index (idx + 1) AND return the result of that check.
            return checkIfIncreasing(arr, idx + 1);
        } else {
            // If the current pair is NOT strictly increasing, we found a violation.
            // The entire array is not strictly increasing.
            // Return false immediately - This is the **Short-Circuiting** part.
            // No further recursive calls are made for indices > idx + 1 in this path.
            return false;
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 }; // Strictly increasing
        int arr2[] = { 1, 6, 3, 4, 5 }; // Not strictly increasing (violation at index 1)

        // Test arr1
        System.out.print("Array 1 is ");
        if (checkIfIncreasing(arr1, 0)) {
            System.out.println("Strictly Increasing");
        } else {
            System.out.println("NOT Strictly Increasing");
        }

        // Test arr2
        System.out.print("Array 2 is ");
        if (checkIfIncreasing(arr2, 0)) {
            System.out.println("Strictly Increasing");
        } else {
            System.out.println("NOT Strictly Increasing");
        }
    }
}
/*
Output => Array 1 is Strictly Increasing
          Array 2 is NOT Strictly Increasing
*/
