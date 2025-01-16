package collectionsExamples;

import java.util.LinkedList;

public class LinkedListExamples {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // 1. Add elements
        list.add("A"); // Adds to the end
        list.add("B");
        list.addLast("C"); // Adds to the end
        list.addFirst("D"); // Adds to the start
        System.out.println("After adding elements: " + list);

        // 2. Access elements
        System.out.println("First element: " + list.getFirst()); // Access first element
        System.out.println("Last element: " + list.getLast());   // Access last element
        System.out.println("Element at index 1: " + list.get(1));

        // 3. Modify elements
        list.set(1, "E"); // Replace element at index 1
        System.out.println("After modifying index 1: " + list);

        // 4. Remove elements
        list.remove(); // Removes first element
        list.removeLast(); // Removes last element
        list.remove("E"); // Removes the first occurrence of "E"
        System.out.println("After removing elements: " + list);

        // 5. Check size and emptiness
        System.out.println("Size of the list: " + list.size());
        System.out.println("Is the list empty? " + list.isEmpty());

        // 6. Add elements for traversal
        list.add("X");
        list.add("Y");
        list.add("Z");

        // 7. Traverse the list
        System.out.println("Using for-each loop:");
        for (String item : list) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("Using iterator:");
        var iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 8. Offer, Poll, Peek (Queue operations)
        list.offer("QueueItem"); // Add to the end (Queue operation)
        System.out.println("After offer: " + list);
        System.out.println("Peek (view first element): " + list.peek());
        System.out.println("Poll (remove first element): " + list.poll());
        System.out.println("After poll: " + list);

        // 9. Push and Pop (Stack operations)
        list.push("StackItem"); // Add to the front (Stack operation)
        System.out.println("After push: " + list);
        System.out.println("Pop (remove first element): " + list.pop());
        System.out.println("After pop: " + list);

        // 10. Clear and Clone
        LinkedList<String> clonedList = (LinkedList<String>) list.clone(); // Clone the list
        System.out.println("Cloned list: " + clonedList);

        list.clear(); // Clear the list
        System.out.println("After clearing the list: " + list);

        // 11. Check for element existence
        System.out.println("Does cloned list contain 'X'? " + clonedList.contains("X"));

        // 12. Convert to array
        Object[] array = clonedList.toArray();
        System.out.println("Converted to array:");
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
