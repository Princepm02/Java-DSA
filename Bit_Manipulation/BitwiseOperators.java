public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;  // in binary:  0101
        int b = 3;  // in binary:  0011

        System.out.println("a = " + a + ", b = " + b);
        // a = 5, b = 3

        // Bitwise AND (&): 
        //   Compares each bit of a and b; result bit is 1 only if both bits are 1.
        System.out.println("a & b = " + (a & b));  // Output: 1  (0001)

        // Bitwise OR (|): 
        //   Compares each bit of a and b; result bit is 1 if either bit is 1.
        System.out.println("a | b = " + (a | b));  // Output: 7  (0111)

        // Bitwise XOR (^): 
        //   Compares each bit of a and b; result bit is 1 if bits are different.
        System.out.println("a ^ b = " + (a ^ b));  // Output: 6  (0110)

        // Bitwise one's complement (~):
        //   Inverts every bit of the operand.
        System.out.println("~a = " + (~a));        // Output: -6 (in two's‑complement: ...1010)
        System.out.println("~b = " + (~b));        // Output: -4 (in two's‑complement: ...1100)

        // Left shift (<<):
        //   Shifts bits left by the given count; fills with 0 on the right.
        //   Effectively multiplies by 2ⁿ.
        System.out.println("a << 1 = " + (a << 1)); // Output: 10 (1010)
        System.out.println("b << 2 = " + (b << 2)); // Output: 12 (1100)

        // Right shift (>>):
        //   Shifts bits right by the given count; fills with sign bit (0 for positive).
        //   Effectively divides by 2ⁿ, rounding toward –∞.
        System.out.println("a >> 1 = " + (a >> 1)); // Output: 2  (0010)
        System.out.println("b >> 1 = " + (b >> 1)); // Output: 1  (0001)
    }
}
/*
Output => a = 5, b = 3
          a & b = 1
          a | b = 7
          a ^ b = 6
          ~a = -6
          ~b = -4
          a << 1 = 10
          b << 2 = 12
          a >> 1 = 2
          b >> 1 = 1
*/
