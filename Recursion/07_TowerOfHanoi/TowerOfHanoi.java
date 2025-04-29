public class TowerOfHanoi {

    // The total number of moves required for n disks is 2^n - 1
    // Example: For n=3 disks, steps = 2^3 - 1 = 8 - 1 = 7 moves.
    
    /*
    Solves the Tower of Hanoi puzzle recursively.

    Time Complexity: O(2^n), Space Complexity: O(n)
    
    n           The number of disks to move.
    source      The name/identifier of the source rod (e.g., 'A').
    auxiliary   The name/identifier of the auxiliary (helper) rod (e.g., 'B').
    destination The name/identifier of the destination rod (e.g., 'C').
    */
    public static void solveHanoi(int n, char source, char auxiliary, char destination) {
        // Base Case: If there is only one disk, just move it from source to destination.
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return; // Stop the recursion for this branch
        }

        // Recursive Step 1: Move top n-1 disks from Source to Auxiliary,
        // using Destination as the helper rod.
        solveHanoi(n - 1, source, destination, auxiliary);

        // Step 2: Move the n-th disk (the largest of the current stack)
        // from the Source rod to the Destination rod.
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Recursive Step 3: Move the n-1 disks from Auxiliary to Destination,
        // using the original Source rod as the helper rod.
        solveHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int numberOfDisks = 3; // Change this to try with a different number of disks
        char sourceRod = 'A';
        char auxiliaryRod = 'B';
        char destinationRod = 'C';

        System.out.println("Solving Tower of Hanoi for " + numberOfDisks + " disks:");
        solveHanoi(numberOfDisks, sourceRod, auxiliaryRod, destinationRod);
    }
}
/*
Output => Solving Tower of Hanoi for 3 disks:
          Move disk 1 from A to C
          Move disk 2 from A to B
          Move disk 1 from C to B
          Move disk 3 from A to C
          Move disk 1 from B to A
          Move disk 2 from B to C
          Move disk 1 from A to C
*/
