public class RecursivePowerLogN {
    // Time Complexity: O(log n), Space Complexity: O(log n)

    public static int printPower(int x, int n) {
        // Base Case 1: If n is 0, x^0 is always 1. This stops the recursion.
        if(n == 0) {
            return 1;
        }

        // Recursive Case 1: If n is even, we can use the property x^n = (x^(n/2)) * (x^(n/2)).
        // By calculating x^(n/2) once and multiplying it by itself, we reduce the number of multiplications.
        // More importantly, the recursive calls are made with n/2, significantly reducing the stack height.
        if(n % 2 == 0) {
            int halfPower = printPower(x, n/2); // Calculate x^(n/2)
            return halfPower * halfPower;        // Return (x^(n/2)) * (x^(n/2))
        }
        // Recursive Case 2: If n is odd, we can use the property x^n = x * (x^(n/2)) * (x^(n/2)).
        // Since integer division of an odd number by 2 truncates, n/2 effectively becomes (n-1)/2.
        // For example, if n=5, n/2=2. The calculation becomes x * x^2 * x^2 = x^5.
        // Again, the recursive calls with n/2 (which is (n-1)/2 for odd n) reduce the stack height.
        else {
            int halfPower = printPower(x, n/2); // Calculate x^(n/2)
            return x * halfPower * halfPower;    // Return x * (x^(n/2)) * (x^(n/2))
        }
    }

    public static void main(String args[]) {
        int x = 2, n = 5;
        int output = printPower(x, n);
        System.out.println(output); // This will print 2^5 = 32
    }
}
