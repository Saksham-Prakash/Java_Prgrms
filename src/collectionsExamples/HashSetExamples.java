package collectionsExamples;

import java.util.HashSet;

public class HashSetExamples {
    public static void main(String[] args) {
        // 1. Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // 2. Add elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        System.out.println("HashSet after add(): " + hashSet);

        // 3. Try to add duplicate elements
        hashSet.add("Apple");  // Duplicate, won't be added
        System.out.println("HashSet after adding duplicate: " + hashSet);

        // 4. Check if the set contains an element
        boolean containsBanana = hashSet.contains("Banana");
        System.out.println("Does the HashSet contain 'Banana'? " + containsBanana);

        // 5. Remove an element
        hashSet.remove("Cherry");
        System.out.println("HashSet after remove(): " + hashSet);

        // 6. Check if the HashSet is empty
        System.out.println("Is the HashSet empty? " + hashSet.isEmpty());

        // 7. Get the size of the HashSet
        System.out.println("Size of the HashSet: " + hashSet.size());

        // 8. Traverse the HashSet using a for-each loop
        System.out.println("Traversing the HashSet:");
        for (String item : hashSet) {
            System.out.println(item);
        }

        // 9. Add all elements from another collection
        HashSet<String> anotherSet = new HashSet<>();
        anotherSet.add("Date");
        anotherSet.add("Fig");
        anotherSet.add("Apple");  // Duplicate element
        hashSet.addAll(anotherSet);
        System.out.println("HashSet after addAll(): " + hashSet);

        // 10. Clear the HashSet
        hashSet.clear();
        System.out.println("HashSet after clear(): " + hashSet);
        System.out.println("Is the HashSet empty? " + hashSet.isEmpty());
    }
}

