public class KeypadCombinations {

    // Array mapping digits ('0' through '9') to their corresponding letters on a phone keypad.
    // The index in the array corresponds to the digit (e.g., keypad[2] is "def").
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    /*
    Recursively generates and prints all possible letter combinations for a given digit string
    based on the standard phone keypad mapping. This uses a backtracking-like approach.
    
    number      The input digit string (e.g., "23").
    idx         The index of the digit currently being processed in the 'number' string (starts at 0).
    combination The letter combination built so far along the current recursive path.
    */
    public static void printComb(String number, int idx, String combination) {
        // Base Case: If we have processed all digits in the input 'number' string.
        // This means a complete letter combination corresponding to all digits is formed.
        if (idx == number.length()) {
            // The 'combination' parameter holds one complete letter combination.
            // Print this combination to the console.
            System.out.println(combination);
            return; // Stop this specific recursive path.
        }

        // --- Recursive Step ---
        // We are currently considering the digit at the current index 'idx'.

        char currDigit = number.charAt(idx); // Get the character representing the current digit (e.g., '2').
        // Get the string of corresponding letters for this digit from the 'keypad' array.
        // We convert the digit character to an integer index (e.g., '2' - '0' gives 2).
        String mapping = keypad[currDigit - '0']; // e.g., if currDigit is '2', mapping becomes "def"

        // Iterate through each letter available for the current digit.
        // For each letter, we explore a new path by including it in the combination.
        for (int i = 0; i < mapping.length(); i++) {
            char letter = mapping.charAt(i); // Get the current letter from the mapping (e.g., 'd', then 'e', then 'f').

            // Make a recursive call:
            // - Move to the NEXT digit in the input number string (idx + 1).
            // - Append the current 'letter' from the mapping to the 'combination' built so far.
            //   This forms the beginning of the combination for the next step.
            printComb(number, idx + 1, combination + letter);
        }

        // After the loop finishes exploring all letters for the current digit,
        // this function call's task for index 'idx' is complete. The recursion
        // naturally unwinds as the function returns implicitly here.
    }

    public static void main(String[] args) {
        // Input digit string for which we want to find combinations.
        String inputNumber = "23";

        System.out.println("Input Number: " + inputNumber);
        System.out.println("--- Keypad Combinations ---");

        // Start the recursive process:
        // - Pass the input number string.
        // - Start processing from the first digit (index 0).
        // - Begin building combinations with an initial empty string "".
        printComb(inputNumber, 0, "");

        System.out.println("-------------------------");

        // Another example
        String inputNumber2 = "9";
        System.out.println("\nInput Number: " + inputNumber2);
        System.out.println("--- Keypad Combinations ---");
        printComb(inputNumber2, 0, "");
        System.out.println("-------------------------");
        
    }
}
/*
Output => Input Number: 23
          --- Keypad Combinations ---
          dg
          dh
          di
          eg
          eh
          ei
          fg
          fh
          fi
          -------------------------
          
          Input Number: 9
          --- Keypad Combinations ---
          y
          z
          -------------------------
*/
