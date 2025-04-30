public class PrintSubsequences {
    /*
    Time Complexity: O(2^n) — each character can be included or excluded, leading to 2^n subsequences
    Auxiliary Space Complexity: O(n) — recursion depth proportional to string length
    Note: Total output space (all printed subsequences) requires O(n · 2^n) characters.

    Recursively generates and prints all subsequences of the given string.

    str       The original input string
    idx       The current index being considered in the recursion
    newString The subsequence built so far
    */
    public static void printSeq(String str, int idx, String newString) {
        // Base case: all characters have been considered
        if (idx == str.length()) {
            // Print the current subsequence (could be empty)
            System.out.println(newString);
            return;
        }

        // It explores all possibilities by deciding whether to include or exclude each character from the original string.

        char currChar = str.charAt(idx);
        // 1) Include the current character in the subsequence and recurse
        printSeq(str, idx + 1, newString + currChar);

        // 2) Exclude the current character and recurse to explore other combinations
        printSeq(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Original String: " + str);
        System.out.println("Subsequences:");
        // Start recursion with an empty subsequence at index 0
        printSeq(str, 0, "");
    }
}

/*
Output => Original String: abc
          Subsequences:
          abc
          ab
          ac
          a
          bc
          b
          c
          (empty line for the empty subsequence)

          Note: The order of output depends on the order of the recursive calls.
*/
