public class MoveXToEnd {

    // Recursively moves all 'x' characters to the end of the string
    // Note: This implementation uses String concatenation for simplicity.
    //       For better performance in real-world code, consider using StringBuilder.
    public static String moveX(String str, int idx, int count, String newStr) {
        // Base Case: If we have processed every character in the original string (reached the end).
        if (idx == str.length()) {
            // All non-'x' characters are already in 'newStr'.
            // Now, append the total number of 'x' characters we counted during the traversal.
            for (int i = 0; i < count; i++) {
                newStr += "x";  // This repeated concatenation is inefficient for Strings.
            }
            return newStr;  // Return the complete resulting string.
        }

        // If the current character is 'x', just count it and do not add to newStr yet
        if (str.charAt(idx) == 'x') {
            count++;  // increment count of 'x' characters
        } else {
            // Otherwise, append the non-'x' character to the result string
            newStr += str.charAt(idx);  // Appending to a String creates a new String - inefficient.
        }

        // Recursive call: move to the next index with updated count and result
        return moveX(str, idx + 1, count, newStr);
    }

    public static void main(String[] args) {
        String str = "axbcxdxxex";
        int count = 0;         // tracks number of 'x' characters found
        String newStr = "";  // builds the new string without 'x'

        // Start recursion from index 0
        newStr = moveX(str, 0, count, newStr);
        System.out.println("New String : " + newStr);

        // We can optimize this approach by using StringBuilder instead of String concatenation,
        // but this code illustrates how recursion processes each character step by step.
    }
}
