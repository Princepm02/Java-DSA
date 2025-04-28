public class SumCalculator {

    /*
     Recursively calculates the sum of the first n natural numbers.
     The input 'n' is the number up to which the sum is calculated.
    */
    public static int sumOfNaturalNumbers(int n) {
        // Base case: If n is 0, the sum is 0.
        if (n == 0) {
            return 0;
        } else {
            // Recursive step: sum of n is n + sum of (n-1)
            return n + sumOfNaturalNumbers(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 10; // You can change the value of n here
        int sum = sumOfNaturalNumbers(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

        n = 5; // Another example
        sum = sumOfNaturalNumbers(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
