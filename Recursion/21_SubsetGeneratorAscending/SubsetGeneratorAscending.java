import java.util.ArrayList;

public class SubsetGeneratorAscending {

    /*
    Prints all elements of a subset in Ascending order
    subset - The current subset to be printed
    */
    public static void printSubset(ArrayList<Integer> subset) {
        for (int num : subset) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /*
    Recursively generates all subsets of the set {1, 2, ..., n} in ascending order.
    
    We start from 'start = 1' and go up to 'n', deciding for each number whether
    to include it or not in the current subset.
    
    Time Complexity: O(2^n) — since each element has 2 choices (include/exclude).
    Space Complexity: O(n) — for the recursion stack and subset list.
    
    This is a backtracking approach that explores all subset possibilities.

    Parameters:
    - n: upper limit of numbers in the original set
    - start: current number to consider adding to the subset
    - currentSubset: list representing the current subset
    */
    public static void generateSubsets(int n, int start, ArrayList<Integer> currentSubset) {
        if (start > n) {
            printSubset(currentSubset);
            return;
        }

        // Case 1: Include current number
        currentSubset.add(start);
        generateSubsets(n, start + 1, currentSubset);

        // Backtrack
        currentSubset.remove(currentSubset.size() - 1);

        // Case 2: Exclude current number
        generateSubsets(n, start + 1, currentSubset);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("All subsets of numbers from 1 to " + n + ":");
        generateSubsets(n, 1, new ArrayList<>());
    }
}
/*
Output =>
All subsets of numbers from 1 to 3:
1 2 3 
1 2
1 3
1
2 3
2
3
*/
