public class NumberPrinter {

    /*
     Recursively prints numbers from n down to 1.
     n - The starting number for the countdown.
    */
    public static void printNumbersDescending(int n) {
        // Base case: Stop when n becomes 0.
        if (n == 0) {
            return;
        }
        // Print the current number.
        System.out.println(n);
        // Recursively call with n-1.
        printNumbersDescending(n - 1);
    }

    /*
    Recursively prints numbers from n up to a specified limit (here, 5).
    n - The starting number for the count up.
    */
    public static void printNumbersAscending(int n) {
        // Base case: Stop when n exceeds the limit (6 in this case to print up to 5).
        if (n == 6) {
            return;
        }
        // Print the current number.
        System.out.println(n);
        // Recursively call with n+1.
        printNumbersAscending(n + 1);
    }

    public static void main(String[] args) {
        System.out.println("Printing numbers from 5 to 1:");
        printNumbersDescending(5); // Call the descending function starting from 5

        System.out.println("\nPrinting numbers from 1 to 5:");
        printNumbersAscending(1); // Call the ascending function starting from 1
    }
}
