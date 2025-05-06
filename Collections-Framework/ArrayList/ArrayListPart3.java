import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

// Part 3: Iteration and Utility Methods
public class ArrayListPart3 {
    public static void main(String[] args) {
        // Create ArrayList with initial elements using Arrays.asList()
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList(
            "BANANA", "ORANGE", "PINEAPPLE", "STRAWBERRY"));

        // === Iterating through ArrayList ===
        System.out.println("=== Iterating through ArrayList ===");

        // a) Using simple for loop with index access
        System.out.println("\nUsing simple for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Fruit at index " + i + ": " + fruits.get(i));
        }

        // b) Using enhanced for loop (for-each)
        System.out.println("\nUsing enhanced for loop:");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // c) Using Iterator (good for safe removal during iteration)
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println("Fruit (Iterator): " + iterator.next());
        }

        // d) Using ListIterator (allows bidirectional traversal and modification)
        System.out.println("\nUsing ListIterator (forward):");
        ListIterator<String> listIterator = fruits.listIterator();

        // Forward traversal
        while (listIterator.hasNext()) {
            System.out.println("Fruit (ListIterator): " + listIterator.next());
        }

        // Backward traversal (starts from the end of the list)
        System.out.println("\nUsing ListIterator (backward):");
        while (listIterator.hasPrevious()) {
            System.out.println("Fruit (ListIterator): " + listIterator.previous());
        }

        // === Other Important Operations ===
        System.out.println("\n=== Other Important Operations ===");

        // Check if list is empty
        System.out.println("Is fruits empty? " + fruits.isEmpty());

        // Extract a sublist (from index 1 to 2, end index is exclusive)
        System.out.println("Sublist from 1 to 3: " + fruits.subList(1, 3));

        // Convert ArrayList to array
        String[] fruitsArray = fruits.toArray(new String[0]);
        System.out.println("Array version: " + Arrays.toString(fruitsArray));

        // Sort the list alphabetically (case-insensitive)
        fruits.sort(String::compareToIgnoreCase);
        System.out.println("Sorted fruits: " + fruits);

        // Clone the list (shallow copy)
        @SuppressWarnings("unchecked")  // suppress cast warning
        ArrayList<String> fruitsCopy = (ArrayList<String>) fruits.clone();
        System.out.println("Cloned copy: " + fruitsCopy);
    }
}

/*
Output =>
=== Iterating through ArrayList ===

Using simple for loop:
Fruit at index 0: BANANA
Fruit at index 1: ORANGE
Fruit at index 2: PINEAPPLE
Fruit at index 3: STRAWBERRY

Using enhanced for loop:
Fruit: BANANA
Fruit: ORANGE
Fruit: PINEAPPLE
Fruit: STRAWBERRY

Using Iterator:
Fruit (Iterator): BANANA
Fruit (Iterator): ORANGE
Fruit (Iterator): PINEAPPLE
Fruit (Iterator): STRAWBERRY

Using ListIterator (forward):
Fruit (ListIterator): BANANA
Fruit (ListIterator): ORANGE
Fruit (ListIterator): PINEAPPLE
Fruit (ListIterator): STRAWBERRY

Using ListIterator (backward):
Fruit (ListIterator): STRAWBERRY
Fruit (ListIterator): PINEAPPLE
Fruit (ListIterator): ORANGE
Fruit (ListIterator): BANANA

=== Other Important Operations ===
Is fruits empty? false
Sublist from 1 to 3: [ORANGE, PINEAPPLE]
Array version: [BANANA, ORANGE, PINEAPPLE, STRAWBERRY]
Sorted fruits: [BANANA, ORANGE, PINEAPPLE, STRAWBERRY]
Cloned copy: [BANANA, ORANGE, PINEAPPLE, STRAWBERRY]
*/
