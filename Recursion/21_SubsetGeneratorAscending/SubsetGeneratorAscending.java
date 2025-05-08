import java.util.ArrayList;

public class SubsetGeneratorAscending {

    /*
    Prints the current subset in ascending order
    subset - The current subset to be printed
    */
    public static void printSubset(ArrayList<Integer> subset) {
        for (int num : subset) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /*
    Recursively generates all subsets in ascending order using backtracking
    
    How it works:
    1. We start with number 1 and make a binary choice at each step:
       - Include the current number in the subset
       - Exclude the current number from the subset
    2. We proceed sequentially through numbers 1 to n
    3. When we reach beyond n (start > n), we print the current subset
    
    The recursion builds the subset tree as follows:
    - Left branches represent including the current number
    - Right branches represent excluding the current number

    Time Complexity: O(2^n) — since each element has 2 choices (include/exclude).
    Space Complexity: O(n) — for the recursion stack and subset list.
    
    Parameters:
    - n: upper limit of numbers in the original set
    - start: current number to consider adding to the subset
    - currentSubset: list representing the current subset
    */
    public static void generateSubsets(int n, int start, ArrayList<Integer> currentSubset) {
        // Base case: when we've processed all numbers
        if (start > n) {
            printSubset(currentSubset);
            return;
        }

        // Case 1: INCLUDE the current number
        currentSubset.add(start);  // Add to subset
        generateSubsets(n, start + 1, currentSubset);  // Recurse with next number
        
        // Backtrack: remove last added number before trying exclusion
        currentSubset.remove(currentSubset.size() - 1);

        // Case 2: EXCLUDE the current number
        generateSubsets(n, start + 1, currentSubset);  // Recurse without adding
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


/*
Execution Flow for n=3:
1. Start with empty subset []
2. At 1: 
   - Include 1 → [1]
     - At 2: 
       - Include 2 → [1,2]
         - At 3:
           - Include 3 → [1,2,3] (print)
           - Exclude 3 → [1,2] (print)
       - Exclude 2 → [1]
         - At 3:
           - Include 3 → [1,3] (print)
           - Exclude 3 → [1] (print)
   - Exclude 1 → []
     - At 2:
       - Include 2 → [2]
         - At 3:
           - Include 3 → [2,3] (print)
           - Exclude 3 → [2] (print)
       - Exclude 2 → []
         - At 3:
           - Include 3 → [3] (print)
           - Exclude 3 → [] (print)
*/
