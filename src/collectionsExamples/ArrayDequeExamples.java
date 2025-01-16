package collectionsExamples;

import java.util.ArrayDeque;

public class ArrayDequeExamples {
    public static void main(String[] args) {
        // 1. Create an ArrayDeque
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // 2. Add elements to the deque
        deque.add(10);  // Adds to the end of the deque
        deque.add(20);
        deque.add(30);
        System.out.println("Deque after add(): " + deque);

        // 3. Add elements to the front and back
        deque.addFirst(5);  // Adds to the front
        deque.addLast(35);  // Adds to the back
        System.out.println("Deque after addFirst() and addLast(): " + deque);

        // 4. Peek at the front and back elements
        System.out.println("First element using peekFirst(): " + deque.peekFirst());
        System.out.println("Last element using peekLast(): " + deque.peekLast());

        // 5. Remove elements from the front and back
        deque.removeFirst();  // Removes the first element
        deque.removeLast();   // Removes the last element
        System.out.println("Deque after removeFirst() and removeLast(): " + deque);

        // 6. Push elements onto the deque (acts as a stack)
        deque.push(40);  // Adds to the front
        deque.push(50);
        System.out.println("Deque after push(): " + deque);

        // 7. Pop elements from the deque (acts as a stack)
        System.out.println("Popped element: " + deque.pop());
        System.out.println("Deque after pop(): " + deque);

        // 8. Offer elements (alternative to add, does not throw exception)
        deque.offer(60);  // Adds to the back
        deque.offerFirst(70);  // Adds to the front
        System.out.println("Deque after offer() and offerFirst(): " + deque);

        // 9. Check if the deque contains an element
        boolean contains30 = deque.contains(30);
        System.out.println("Does the deque contain 30? " + contains30);

        // 10. Traverse the deque using a for-each loop
        System.out.println("Traversing the deque:");
        for (int item : deque) {
            System.out.println(item);
        }

        // 11. Clear the deque
        deque.clear();
        System.out.println("Deque after clear(): " + deque);
        System.out.println("Is the deque empty? " + deque.isEmpty());
    }
}
