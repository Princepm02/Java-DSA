public class printPower {

    /*
    Recursively calculates x raised to the power of n.
    
    x -> The base number.
    n -> The exponent.
    It returns the result of x^n.
    
    Time Complexity: O(n) - The function makes 'n' recursive calls.
    Space Complexity: O(n) - Due to the recursion call stack depth, which can go up to 'n'.
    */
    public static int printPow(int x, int n) {
        // Base case 1: If the exponent n is 0, x^0 is always 1.
        if (n == 0) {
            return 1;
        }
        // Base case 2: If the base x is 0, 0^n is always 0 for n > 0.
        // (Note: 0^0 is typically defined as 1, handled by the first base case).
        if (x == 0) {
            return 0;
        }

        // Recursive step: x^n = x * x^(n-1).
        // Calculate x^(n-1) recursively and then multiply by x.
        int res = x * printPow(x, n - 1);

        // Return the calculated result.
        return res;
    }

    public static void main(String[] args) {
        // Example usage: Calculate 2^5
        int x = 2;
        int n = 5;
        int result = printPow(x, n); // Call the recursive power function
        System.out.println(x + "^" + n + " = " + result); // Print the result

        // Another example: Calculate 3^0
        x = 3;
        n = 0;
        result = printPow(x, n);
        System.out.println(x + "^" + n + " = " + result);

         // Example: Calculate 0^5
        x = 0;
        n = 5;
        result = printPow(x, n);
        System.out.println(x + "^" + n + " = " + result);
    }
}
