package collectionsExamples;

import java.util.Vector;
import java.util.Enumeration;

public class VectorExamples {
    public static void main(String[] args) {
        // 1. Create a Vector
        Vector<String> vector = new Vector<>();

        // 2. Add elements
        vector.add("A"); // Add to the end
        vector.add("B");
        vector.addElement("C"); // Add using addElement()
        vector.insertElementAt("D", 0); // Insert at specific position
        System.out.println("After adding elements to vector : " + vector);

        // 3. Access elements
        System.out.println("First element: " + vector.firstElement()); // Access first element
        System.out.println("Last element: " + vector.lastElement());   // Access last element
        System.out.println("Element at index 1: " + vector.get(1));

        // 4. Modify elements
        vector.set(1, "E"); // Replace element at index 1
        System.out.println("After modifying index 1: " + vector);

        // 5. Remove elements
        vector.remove("E"); // Removes first occurrence of "E"
        vector.remove(0);   // Removes element at index 0
        vector.removeElementAt(1); // Removes element at specific position
        System.out.println("After removing elements: " + vector);

        // 6. Check size and capacity
        System.out.println("Size of the vector: " + vector.size());
        System.out.println("Capacity of the vector: " + vector.capacity());

        // 7. Add elements for traversal
        vector.add("X");
        vector.add("Y");
        vector.add("Z");

        // 8. Traverse the Vector
        System.out.println("Using for-each loop:");
        for (String item : vector) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("Using Enumeration:");
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }
        System.out.println();

        // 9. Clone the Vector
        Vector<String> clonedVector = (Vector<String>) vector.clone();
        System.out.println("Cloned vector: " + clonedVector);

        // 10. Clear the Vector
        vector.clear(); // Clear all elements
        System.out.println("After clearing the vector: " + vector);

        // 11. Check existence
        System.out.println("Does cloned vector contain 'X'? " + clonedVector.contains("X"));

        // 12. Convert to array
        Object[] array = clonedVector.toArray();
        System.out.println("Converted to array:");
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
