import java.util.ArrayList;
import java.util.Arrays;

// Part 2: Accessing, Modifying and Removing Elements
public class ArrayListPart2 {
    public static void main(String[] args) {
        // Initialize ArrayList with initial elements using Arrays.asList()
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList(
            "Apple", "Mango", "Cherry", "Kiwi", "Banana", "Orange", "Grapes", "Pineapple"));

        // === Accessing Elements ===
        System.out.println("=== Accessing Elements ===");

        // get(int index) - retrieve element at index 0
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // size() - returns the number of elements in the list
        System.out.println("Number of fruits: " + fruits.size());

        // indexOf(Object) - returns index of first occurrence, or -1 if not found
        System.out.println("Index of Banana: " + fruits.indexOf("Banana"));

        // contains(Object) - checks if an element exists in the list
        System.out.println("Contains Mango? " + fruits.contains("Mango"));
        System.out.println();

        // === Modifying Elements ===
        System.out.println("=== Modifying Elements ===");

        // set(int index, E element) - replaces the element at index 3 with "Strawberry"
        fruits.set(3, "Strawberry");
        System.out.println("After replacing index 3: " + fruits);

        // replaceAll(UnaryOperator) - converts all elements to uppercase
        fruits.replaceAll(String::toUpperCase);  // uses method reference (Java 8+)
        System.out.println("After replaceAll to uppercase: " + fruits);
        System.out.println();

        // === Removing Elements ===
        System.out.println("=== Removing Elements ===");

        // remove(int index) - removes the element at index 2 ("CHERRY" after uppercase)
        String removed = fruits.remove(2);
        System.out.println("Removed element at index 2: " + removed);
        System.out.println("After removal: " + fruits);

        // remove(Object o) - removes the first occurrence of "GRAPES" if it exists
        boolean isRemoved = fruits.remove("GRAPES");
        System.out.println("Was GRAPES removed? " + isRemoved);
        System.out.println("After removing GRAPES: " + fruits);

        // removeAll(Collection) - removes all elements matching those in the given collection
        fruits.removeAll(Arrays.asList("APPLE", "MANGO"));  // case-sensitive match
        System.out.println("After removeAll APPLE and MANGO: " + fruits);
    }
}

/*
Output =>
=== Accessing Elements ===
First fruit: Apple
Number of fruits: 8
Index of Banana: 4
Contains Mango? true

=== Modifying Elements ===
After replacing index 3: [Apple, Mango, Cherry, Strawberry, Banana, Orange, Grapes, Pineapple]
After replaceAll to uppercase: [APPLE, MANGO, CHERRY, STRAWBERRY, BANANA, ORANGE, GRAPES, PINEAPPLE]

=== Removing Elements ===
Removed element at index 2: CHERRY
After removal: [APPLE, MANGO, STRAWBERRY, BANANA, ORANGE, GRAPES, PINEAPPLE]
Was GRAPES removed? true
After removing GRAPES: [APPLE, MANGO, STRAWBERRY, BANANA, ORANGE, PINEAPPLE]
After removeAll APPLE and MANGO: [STRAWBERRY, BANANA, ORANGE, PINEAPPLE]
*/
