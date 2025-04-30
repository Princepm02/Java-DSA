public class StringDuplicateRemover {
    // Boolean map to track which lowercase letters have been included
    public static boolean[] map = new boolean[26];

    // Recursively builds a new string without duplicate characters
    public static void removeDuplicates(String str, int idx, String newString) {
        // Base case: if we've reached the end of the input string, print the result
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        // Current character to process
        char currChar = str.charAt(idx);

        // Check if this character has already been added
        if (map[currChar - 'a']) {
            // Already seen: skip it and move to the next index
            removeDuplicates(str, idx + 1, newString);
        } else {
            // First occurrence: append to result and mark as seen
            newString += currChar;
            map[currChar - 'a'] = true;
            // Continue recursion with updated newString
            removeDuplicates(str, idx + 1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "aabcbadbbeddf";  // Input string with duplicates
        // Start recursion from index 0 with an empty result string
        removeDuplicates(str, 0, "");
    }
}
