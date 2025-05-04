public class CountMazePath {

    /*
    Recursively counts the number of paths from (i,j) to (n-1,m-1) in a grid,
    where you can only move DOWN or RIGHT.

    Time Complexity: O(2^(n+m)) - Exponential, since each call branches into 2 recursive calls.
    Space Complexity: O(n+m) - Due to recursion stack depth (max depth = path length = n+m-1).
    
    Note: This is NOT the optimal solution. We'll solve this more efficiently later using Dynamic Programming.
    
    i - Current row position
    j - Current column position
    n - Total rows in the grid
    m - Total columns in the grid
    return -> Total paths from (i,j) to the bottom-right corner (n-1,m-1)
    */
    public static int countPaths(int i, int j, int n, int m) {
        // Base Case 1: Out of grid bounds → invalid path
        if (i == n || j == m) {
            return 0;
        }

        // Base Case 2: Reached the destination (bottom-right corner) → valid path
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // Recursive Case:
        // 1. Move DOWN and count all paths from the new position (i+1, j)
        int downPaths = countPaths(i + 1, j, n, m);

        // 2. Move RIGHT and count all paths from the new position (i, j+1)
        int rightPaths = countPaths(i, j + 1, n, m);

        // Total paths = paths from down + paths from right
        return downPaths + rightPaths;
    }

    public static void main(String[] args) {
        // Define grid size (3x3 in this example)
        int n = 3, m = 3;

        // Start counting paths from (0, 0) to (n-1, m-1)
        int totalPaths = countPaths(0, 0, n, m);

        // Output the result (6 for 3x3 grid)
        System.out.println("Total paths: " + totalPaths);
    }
}
// Output => Total paths: 6
