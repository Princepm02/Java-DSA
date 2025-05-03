public class StringPermutation {
    /*
    Recursively generates and prints all permutations of a string

    Time Complexity: O(n × n!) (due to n! permutations × n work per permutation)
    Space Complexity: O(n²) (due to recursion stack and substring storage)

    str -         The string containing the characters that are yet to be included in the permutation
    permutation - The permutation of characters built so far in this specific recursive path
    */
    public static void printPermutation(String str, String permutation) {
        // BASE CASE: When no characters left to arrange
        if (str.length() == 0) {
            System.out.println("-> " + permutation); // Arrow symbol for clean output
            return;
        }

        // RECURSIVE CASE: Build permutations by fixing each character
        for (int i = 0; i < str.length(); i++) {
            /* 1. SELECT CHARACTER:
               Choose the current character to fix in this position */
            char currChar = str.charAt(i);
            
            /* 2. CREATE NEW STRING:
               Remove the fixed character from available options
               - str.substring(0, i) = characters before current
               - str.substring(i + 1) = characters after current */
            String remainingChars = str.substring(0, i) + str.substring(i + 1);
            
            /* 3. RECURSIVE CALL:
               Build permutations with:
               - remainingChars: The pool of available characters
               - permutation+currChar: Growing permutation string */
            printPermutation(remainingChars, permutation + currChar);
        }
    }

    public static void main(String[] args) {
        String inputString = "abc";
        System.out.println("============= INPUT =============");
        System.out.println("  Input String: \"" + inputString + "\"");
        System.out.println("=========== PERMUTATIONS ===========");
        printPermutation(inputString, "");
        System.out.println("===================================");
    }
}
/*
Output => 
============= INPUT =============
  Input String: "abc"
=========== PERMUTATIONS ===========
-> abc
-> acb
-> bac
-> bca
-> cab
-> cba
===================================
*/
