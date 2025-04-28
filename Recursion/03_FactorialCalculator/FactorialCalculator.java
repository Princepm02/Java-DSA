public class FactorialCalculator {

    /*
     Recursively calculates the factorial of a non-negative integer n.
     The input 'n' is the number for which the factorial is calculated.
     Factorial of 0 is 1. Factorial of n (for n > 0) is n * factorial(n-1).
    */
    public static long factorial(int n) {
        // Base case: Factorial of 0 or 1 is 1.
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive step: Factorial of n is n * factorial(n-1).
        // Use long to handle larger factorial values.
        return (long)n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5; // You can change the number here
        long result = factorial(number);
        System.out.println("The factorial of " + number + " is: " + result);

        number = 0; // Example for factorial of 0
        result = factorial(number);
        System.out.println("The factorial of " + number + " is: " + result);

        number = 7; // Another example
        result = factorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
    }
}
