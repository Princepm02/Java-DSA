import java.util.ArrayList;

public class SubsetGenerator {
    /*
    Prints all elements of a subset
    subset - The current subset to be printed
    */
    public static void printSubset(ArrayList<Integer> subset) {
        for(int num : subset) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /*
    Generates all possible subsets of numbers from 1 to n
    
    Time Complexity: O(2^n) - since there are 2^n possible subsets
    Space Complexity: O(n) - maximum recursion depth
    
    Note: This uses recursion. For larger n, consider iterative approaches.
     
    n -> The largest number in the set (1 to n)
    currentSubset -> The subset being constructed in current recursion
    */
    public static void generateSubsets(int n, ArrayList<Integer> currentSubset) {
        // Base case: when we've processed all numbers
        if(n == 0) {
            printSubset(currentSubset);
            return;
        }
        
        // Recursive case 1: Don't include n in the subset
        generateSubsets(n - 1, currentSubset);

        // Recursive case 2: Include n in the subset
        currentSubset.add(n);
        generateSubsets(n - 1, currentSubset);
        
        // Backtrack: remove n before returning to previous call
        currentSubset.remove(currentSubset.size() - 1);
    }
 
    public static void main(String[] args) {
        int n = 3; // Generate subsets for numbers 1 to 3
        System.out.print("All subsets of numbers from 1 to " + n + ":");
        generateSubsets(n, new ArrayList<Integer>());
    }
}
/*
Output =>
All subsets of numbers from 1 to 3:
1
2
2 1
3
3 1
3 2
3 2 1
*/
