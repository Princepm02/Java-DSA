public class TilePlacement {

    /*
    Problem:
    Count the number of ways to place 1×m tiles on an n×m floor.
    You can place tiles either vertically (1 tile covers m rows) or horizontally (1 tile spans m columns).
    
    Approach:
    - If n == m: You can either place all tiles vertically (1 way) or all horizontally (1 way) => total 2 ways.
    - If n < m: You cannot place any tile vertically, so only 1 way (all horizontal placements).
    - Else:
        horPlacement = count ways by placing one tile horizontally (reduces floor height by 1)
        verPlacement = count ways by placing one tile vertically (reduces floor height by m)
        total ways = horPlacement + verPlacement
    
    Time Complexity: O(2^n) — Exponential, as it branches into 2 recursive calls per state.
    Space Complexity: O(n) — due to recursion stack depth up to n.
    
     Note: This is not an optimal solution. It recalculates the same subproblems multiple times.
           We will improve this using Dynamic Programming in later versions.
    */

    public static int countTilingWays(int n, int m) {
        if (n == m) {
            return 2; // two ways: all vertical or all horizontal
        }
        if (n < m) {
            return 1; // only one way: all tiles placed horizontally
        }

        // Recursive calls:
        // 1. Place tile horizontally => reduce floor height by 1
        int horPlacement = countTilingWays(n - 1, m);

        // 2. Place tile vertically => reduce floor height by m
        int verPlacement = countTilingWays(n - m, m);

        // Total number of ways is the sum of both options
        return horPlacement + verPlacement;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 2;
        int totalWays = countTilingWays(n, m);
        System.out.println("Total ways to tile: " + totalWays); // Output => Total ways to tile: 5
    }
}
