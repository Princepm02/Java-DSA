public class FriendsPairing {

    /*
    Counts the number of ways to invite n people to a party, either singly or in pairs.
    
    Time Complexity: O(2^n) - Exponential due to overlapping subproblems.
    Space Complexity: O(n) - Maximum recursion depth.
    
    Note: This is not the optimal solution. We'll optimize it later using Dynamic Programming (DP).
    */
    public static int countWaysToPair(int n) {
        // Base Case: If 0 or 1 person, only 1 way (no pairing needed).
        if (n <= 1) {
            return 1;
        }

        // Recursive Case:
        // 1. Invite the nth person alone: solve for (n-1) people.
        int waysAlone = countWaysToPair(n - 1);

        // 2. Pair the nth person with any of the (n-1) remaining people: 
        //    solve for (n-2) people.
        int waysPaired = (n - 1) * countWaysToPair(n - 2);

        // Total ways = ways to invite alone + ways to invite in pairs.
        return waysAlone + waysPaired;
    }

    public static void main(String[] args) {
        int n = 4; // Number of friends
        System.out.println("Total ways to invite: " + countWaysToPair(n)); // Output: 10
    }
}
