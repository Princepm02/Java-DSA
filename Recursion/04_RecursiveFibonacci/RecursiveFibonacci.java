public class RecursiveFibonacci {
    /*
    Recursively prints the Fibonacci sequence.
    This method uses a tail-recursive approach by passing the current terms
    and the remaining count in the parameters.

    a - The first of the two preceding terms (the current term to print).
    b - The second of the two preceding terms (the next term in sequence).
    n - The number of remaining terms to print.
    */
    public static void printFibo(int a, int b, int n) {
        // Base case: If n becomes 0, it means we have printed the desired number of terms.
        // The recursion stops here.
        if (n == 0) {
            return;
        }

        // Print the current term 'a'.
        System.out.println(a);

        // Recursive step: Call printFibo again with updated values.
        // 'b' becomes the new 'a' (the next term to print in the next call).
        // 'a + b' becomes the new 'b' (the next term after 'b').
        // 'n - 1' decrements the count of remaining terms to print.
        printFibo(b, a + b, n - 1);
    }

    public static void main(String[] args) {
        // Start the Fibonacci sequence printing.
        // Initial call:
        // 0 is the first term (a)
        // 1 is the second term (b)
        // 5 is the number of terms to print (n)
        printFibo(0, 1, 5);
    }
}
