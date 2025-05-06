import java.util.ArrayList;
import java.util.Arrays;

// Part 1: ArrayList Basics and Adding Elements
public class ArrayListPart1 {
    public static void main(String[] args) {
        // === Creating ArrayLists ===
        System.out.println("=== Creating ArrayLists ===");

        // Creates an empty ArrayList with default capacity (10)
        ArrayList<String> fruits = new ArrayList<>();

        // Creates an empty ArrayList with initial capacity of 20 (performance optimization)
        ArrayList<Integer> numbers = new ArrayList<>(20);

        // Creates a new ArrayList initialized with values from another collection (Arrays.asList)
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));

        System.out.println("Initial fruits: " + fruits);     // Output: []
        System.out.println("Initial numbers: " + numbers);   // Output: []
        System.out.println("Initial colors: " + colors);     // Output: [Red, Green, Blue]
        System.out.println();

        // === Adding Elements ===
        System.out.println("=== Adding Elements ===");

        // add(E element) - appends to the end of the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("After adding fruits: " + fruits);  // [Apple, Banana, Orange]

        // add(int index, E element) - inserts "Mango" at index 1 (shifts current elements right)
        fruits.add(1, "Mango");
        System.out.println("After inserting Mango at index 1: " + fruits);  // [Apple, Mango, Banana, Orange]

        // addAll(Collection) - appends all elements from another list
        ArrayList<String> moreFruits = new ArrayList<>(Arrays.asList("Grapes", "Pineapple"));
        fruits.addAll(moreFruits);
        System.out.println("After adding more fruits: " + fruits);  // [Apple, Mango, Banana, Orange, Grapes, Pineapple]

        // addAll(int index, Collection) - inserts multiple elements starting at index 2
        fruits.addAll(2, Arrays.asList("Cherry", "Kiwi"));
        System.out.println("After adding at index 2: " + fruits);  // [Apple, Mango, Cherry, Kiwi, Banana, Orange, Grapes, Pineapple]
    }
}

/*
Output =>
=== Creating ArrayLists ===
Initial fruits: []
Initial numbers: []
Initial colors: [Red, Green, Blue]

=== Adding Elements ===
After adding fruits: [Apple, Banana, Orange]
After inserting Mango at index 1: [Apple, Mango, Banana, Orange]
After adding more fruits: [Apple, Mango, Banana, Orange, Grapes, Pineapple]
After adding at index 2: [Apple, Mango, Cherry, Kiwi, Banana, Orange, Grapes, Pineapple]
*/
