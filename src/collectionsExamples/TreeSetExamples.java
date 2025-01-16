package collectionsExamples;

import java.util.TreeSet;

public class TreeSetExamples {
    public static void main(String[] args) {
        // 1. Create a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // 2. Add elements
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        System.out.println("TreeSet after add(): " + treeSet); // Sorted order

        // 3. Try to add duplicate elements
        treeSet.add("Apple"); // Duplicate, won't be added
        System.out.println("TreeSet after adding duplicate: " + treeSet);

        // 4. Check if the TreeSet contains an element
        boolean containsBanana = treeSet.contains("Banana");
        System.out.println("Does the TreeSet contain 'Banana'? " + containsBanana);

        // 5. Remove an element
        treeSet.remove("Cherry");
        System.out.println("TreeSet after remove(): " + treeSet);

        // 6. Get the first and last elements
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());

        // 7. Get elements lower, floor, ceiling, and higher than a given element
        System.out.println("Element lower than 'Banana': " + treeSet.lower("Banana"));
        System.out.println("Element floor of 'Banana': " + treeSet.floor("Banana"));
        System.out.println("Element ceiling of 'Banana': " + treeSet.ceiling("Banana"));
        System.out.println("Element higher than 'Banana': " + treeSet.higher("Banana"));

        // 8. Get a subset (headSet, tailSet, subSet)
        System.out.println("HeadSet up to 'Banana' (exclusive): " + treeSet.headSet("Banana"));
        System.out.println("TailSet from 'Banana' (inclusive): " + treeSet.tailSet("Banana"));
        System.out.println("SubSet from 'Apple' (inclusive) to 'Banana' (exclusive): " + treeSet.subSet("Apple", "Banana"));

        // 9. Check if the TreeSet is empty
        System.out.println("Is the TreeSet empty? " + treeSet.isEmpty());

        // 10. Traverse the TreeSet
        System.out.println("Traversing the TreeSet:");
        for (String item : treeSet) {
            System.out.println(item);
        }

        // 11. Clear the TreeSet
        treeSet.clear();
        System.out.println("TreeSet after clear(): " + treeSet);
        System.out.println("Is the TreeSet empty? " + treeSet.isEmpty());
    }
}
