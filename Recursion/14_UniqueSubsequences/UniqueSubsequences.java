import java.util.HashSet;

public class UniqueSubsequences {

    /*
    Finds and prints all unique subsequences of a string using recursion.
    It explores including/excluding each character and uses a HashSet for uniqueness.

    Time Complexity: O(n * 2^n) — there are 2^n recursive calls (each char included/excluded) and each call does O(n) work for string operations
    Space Complexity: O(n * 2^n)
    */
    public static void uniqueSeq(String str, int idx, String newString, HashSet<String> uniSubseq) {
        // Base Case: When we have looked at every character in the original string.
        // 'newString' is a complete subsequence we've built along this path.
        if (idx == str.length()) {
            // Check if this subsequence is already in our set of unique ones.
            if (uniSubseq.contains(newString)) {
                // If it's a duplicate we've seen before, just stop this path.
                return;
            }
            // If it's a new, unique subsequence:
            uniSubseq.add(newString); // Add it to our set so we don't print it again.
            System.out.println(newString); // Print this unique subsequence.
            return; // Stop this path.
        }

        // Recursive Step: Consider the character at the current index 'idx'.

        // Choice 1: Include the current character in the subsequence.
        uniqueSeq(str, idx + 1, newString + str.charAt(idx), uniSubseq);

        // Choice 2: Exclude the current character.
        uniqueSeq(str, idx + 1, newString, uniSubseq);

        // These two recursive calls, for each character, explore all possible ways
        // to form subsequences by either including or excluding the character.
    }

    public static void main(String[] args) {
        String inputString = "aaa";
        // Use a HashSet to keep track of and filter out duplicate subsequences.
        HashSet<String> uniqueSubsequencesSet = new HashSet<>();

        System.out.println("Original String: " + inputString);
        System.out.println("Unique Subsequences:");

        // Start the recursive process:
        // - Process the string from the first character (index 0).
        // - Begin building subsequences with an empty string "".
        // - Use the HashSet to ensure uniqueness.
        uniqueSeq(inputString, 0, "", uniqueSubsequencesSet);
    }
}
/*
Output => Original String: aaa
          Unique Subsequences:
          aaa
          aa
          a
          (empty line for the empty subsequence)
          
          Note: The order of output depends on the order of the recursive calls.
*/
