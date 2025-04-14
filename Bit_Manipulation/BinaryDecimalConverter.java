import java.util.Scanner;

public class BinaryDecimalConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose conversion:");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        System.out.print("Enter choice (1 or 2): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a binary number (e.g. 1011): ");
                int binaryInput = sc.nextInt();
                int decimalResult = binaryToDecimal(binaryInput);
                System.out.println("Decimal value: " + decimalResult);
                break;

            case 2:
                System.out.print("Enter a decimal number (e.g. 13): ");
                int decimalInput = sc.nextInt();
                String binaryResult = decimalToBinary(decimalInput);
                System.out.println("Binary value: " + binaryResult);
                break;

            default:
                System.out.println("Invalid choice. Please run again and select 1 or 2.");
        }

        sc.close();
    }

    /*
     Converts an integer representing a binary number (e.g. 1011) into its decimal equivalent.
     Logic: Iterates through the binary digits from right to left, multiplying
             each digit by the corresponding power of 2 and summing the results.
    */
    public static int binaryToDecimal(int binary) {
        int decimal = 0;
        int power = 0;

        while (binary > 0) {
            int digit = binary % 10;
            if (digit != 0 && digit != 1) {
                throw new IllegalArgumentException("Invalid binary digit detected: " + digit);
            }
            decimal += digit * Math.pow(2, power);
            binary /= 10;
            power++;
        }

        return decimal;
    }

    /*
     Converts a decimal integer into its binary representation as a String.
     Logic: Repeatedly divides the decimal number by 2 and appends the remainder
            (0 or 1) to a StringBuilder. The final result is the reversed StringBuilder.
     */
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        while (decimal > 0) {
            sb.append(decimal % 2);
            decimal /= 2;
        }

        return sb.reverse().toString();
    }
}
