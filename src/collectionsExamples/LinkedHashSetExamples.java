package collectionsExamples;

import java.util.LinkedHashSet;

public class LinkedHashSetExamples {
    public static void main(String[] args) {
        // 1. Create a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // 2. Add elements
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        System.out.println("LinkedHashSet after add(): " + linkedHashSet);

        // 3. Try to add duplicate elements
        linkedHashSet.add("Banana"); // Duplicate, won't be added
        System.out.println("LinkedHashSet after adding duplicate: " + linkedHashSet);

        // 4. Remove an element
        linkedHashSet.remove("Apple");
        System.out.println("LinkedHashSet after remove(): " + linkedHashSet);

        // 5. Check if the LinkedHashSet contains an element
        boolean containsBanana = linkedHashSet.contains("Banana");
        System.out.println("Does the LinkedHashSet contain 'Banana'? " + containsBanana);

        // 6. Get the size of the LinkedHashSet
        System.out.println("Size of the LinkedHashSet: " + linkedHashSet.size());

        // 7. Check if the LinkedHashSet is empty
        System.out.println("Is the LinkedHashSet empty? " + linkedHashSet.isEmpty());

        // 8. Traverse the LinkedHashSet
        System.out.println("Traversing the LinkedHashSet:");
        for (String item : linkedHashSet) {
            System.out.println(item);
        }

        // 9. Clear the LinkedHashSet
        linkedHashSet.clear();
        System.out.println("LinkedHashSet after clear(): " + linkedHashSet);
        System.out.println("Is the LinkedHashSet empty? " + linkedHashSet.isEmpty());
    }
}
