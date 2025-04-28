public class ReverseString {
    /*
    Recursively prints the reverse of a string.
    
    str The input string.
    idx The current index to process (starts from the last index).
    */
    public static void revString(String str, int idx) {
        // Base Case: When the index reaches 0 (the first character),
        // print the first character and stop the recursion for this path.
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }

        // Recursive Step:
        // 1. Print the character at the current index.
        // Since we start from the last index and go down,
        // printing *before* the recursive call means we print
        // the last char, then the second-to-last, and so on.
        System.out.print(str.charAt(idx));

        // 2. Make a recursive call for the previous index (idx - 1).
        // This moves towards the base case.
        revString(str, idx - 1);
    }

    public static void main(String[] args) {
        String str = "Hello Prince";
        // Start the recursion from the last character's index.
        revString(str, str.length() - 1);
    }
}
