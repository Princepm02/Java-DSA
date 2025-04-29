// Q. Find the occurrence of the first and last occurrence of an element using recursion.

public class OccurrenceFinder {
    // Static variables to store the indices of the first and last occurrences found so far.
    // Initialized to -1 to indicate the character hasn't been found yet.

    public static int first = -1;
    public static int last = -1;

    /*
    Recursively finds the first and last occurrence of a character in a string.
    It scans the string from left to right using the index.
    
    Time Complexity: O(n), Space Complexity: O(n)

    str - The input string.
    ele - The character to find.
    idx - The current index being checked (starts from 0).
    */
    public static void getIndices(String str, char ele, int idx) {
        // Base Case: If the current index reaches the end of the string, stop recursion.
        if (idx == str.length()) {
            return;
        }

        // Check if the character at the current index matches the target character.
        if (str.charAt(idx) == ele) {
            // If this is the very first time finding the character (first is -1),
            // set both first and last occurrence indices to the current index.
            if (first == -1) {
                first = idx;
                last = idx; // Set last initially here to handle single occurrences correctly
            } else {
                // If the character has been found before (first is not -1),
                // update the last occurrence index to the current index.
                last = idx;
            }
        }

        // Recursive Step: Call the function again to check the next character in the string.
        getIndices(str, ele, idx + 1);
    }

    public static void main(String[] args) {
        String str = "tabcdfghijakkk";
        char el = 'a';
        // Start the recursive search from the beginning of the string (index 0).
        getIndices(str, el, 0);
        // After the recursion completes, first and last hold the found indices (or -1 if not found).
        System.out.println("First occurence : " + first);
        System.out.println("Last occurence : " + last);
    }
}
/*
Output => First occurence : 1
          Last occurence : 10
*/
