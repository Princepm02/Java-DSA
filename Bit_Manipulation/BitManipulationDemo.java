import java.util.Scanner;

public class BitManipulationDemo {
    public static String to4BitBinaryString(int n) {
        String binaryString = Integer.toBinaryString(n);
        if (binaryString.length() < 4) {
            StringBuilder sb = new StringBuilder();
            int paddingZeros = 4 - binaryString.length();
            for (int i = 0; i < paddingZeros; i++) {
                sb.append("0");
            }
            sb.append(binaryString);
            return sb.toString();
        } else {
            return binaryString;
        }
    }
    public static void main(String[] args) {
        int n = 5; // Initial number (binary: 0101)
        int pos = 2; // Position of the bit to operate on (0-based index from the right)

        // Get Bit
        // Logic: Create a bitmask with 1 at the given position (1 << pos).
        // Perform bitwise AND with the number. If the result is 0, the bit is 0; otherwise, it's 1.
        // Example: n = 5 (0101), pos = 2. bitMask = 1 << 2 = 0100. (0101 & 0100) = 0000. Bit is zero.
        int getBitMask = 1 << pos;
        if ((getBitMask & n) == 0) {
            System.out.println("Get Bit: Bit at position " + pos + " was zero in " + to4BitBinaryString(n));
        } else {
            System.out.println("Get Bit: Bit at position " + pos + " was one in " + to4BitBinaryString(n));
        }

        System.out.println();

        // Set Bit
        // Logic: Create a bitmask with 1 at the given position (1 << pos).
        // Perform bitwise OR with the number. This sets the bit at the given position to 1.
        // Example: n = 5 (0101), pos = 1. bitMask = 1 << 1 = 0010. (0101 | 0010) = 0111 (decimal 7).
        pos = 1;
        int setBitMask = 1 << pos;
        int newNumberSet = setBitMask | n;
        System.out.println("Set Bit: Original number " + to4BitBinaryString(n) + ", setting bit at position " + pos + " results in " + to4BitBinaryString(newNumberSet) + " (decimal: " + newNumberSet + ")");

        System.out.println();

        // Clear Bit
        // Logic: Create a bitmask with 1 at the given position (1 << pos).
        // Invert the bitmask using bitwise NOT (~). This creates a mask with 0 at the given position and 1s elsewhere.
        // Perform bitwise AND with the number. This clears the bit at the given position to 0.
        // Example: n = 5 (0101), pos = 2. bitMask = 1 << 2 = 0100. ~bitMask = 1011 (assuming 4 bits). (0101 & 1011) = 0001 (decimal 1).
        pos = 2;
        int clearBitMask = 1 << pos;
        int newBitMaskClear = ~(clearBitMask);
        int newNumberClear = newBitMaskClear & n;
        System.out.println("Clear Bit: Original number " + to4BitBinaryString(n) + ", clearing bit at position " + pos + " results in " + to4BitBinaryString(newNumberClear) + " (decimal: " + newNumberClear + ")");

        System.out.println();

        // Update Bit
        // Logic: Get user input for the operation (set or clear).
        // If set (oper == 1): Perform bitwise OR with the bitmask (same as Set Bit).
        // If clear (oper == 0): Perform bitwise AND with the inverted bitmask (same as Clear Bit).
        Scanner sc = new Scanner(System.in);
        System.out.print("Update Bit: Enter operation (1 for set, 0 for clear) for position 1: ");
        int oper = sc.nextInt();
        pos = 1;
        int updateBitMask = 1 << pos;
        if (oper == 1) {
            int newNumberUpdateSet = updateBitMask | n;
            System.out.println("Update Bit (set): Original number " + to4BitBinaryString(n) + ", setting bit at position " + pos + " results in " + to4BitBinaryString(newNumberUpdateSet) + " (decimal: " + newNumberUpdateSet + ")");
        } else {
            int newBitMaskUpdateClear = ~(updateBitMask);
            int newNumberUpdateClear = newBitMaskUpdateClear & n;
            System.out.println("Update Bit (clear): Original number " + to4BitBinaryString(n) + ", clearing bit at position " + pos + " results in " + to4BitBinaryString(newNumberUpdateClear) + " (decimal: " + newNumberUpdateClear + ")");
        }
        sc.close();
    }
}
/*
Output => Get Bit: Bit at position 2 was one in 0101
          
          Set Bit: Original number 0101, setting bit at position 1 results in 0111 (decimal: 7)
          
          Clear Bit: Original number 0101, clearing bit at position 2 results in 0001 (decimal: 1)
          
          Update Bit: Enter operation (1 for set, 0 for clear) for position 1: 1
          Update Bit (set): Original number 0101, setting bit at position 1 results in 0111 (decimal: 7)
*/
