package collectionsExamples;

import java.util.PriorityQueue;

public class PqExamples {
    public static void main(String[] args) {
        // 1. Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 2. Add elements using add() and offer()
        pq.add(20);  // Adds element to the queue
        pq.offer(10); // Alternative to add()
        pq.add(30);
        pq.add(15);
        System.out.println("PriorityQueue after adding elements: " + pq);

        // 3. Peek at the head element
        System.out.println("Head element using peek(): " + pq.peek());

        // 4. Remove the head element using poll()
        System.out.println("Element removed using poll(): " + pq.poll());
        System.out.println("PriorityQueue after poll(): " + pq);

        // 5. Remove a specific element
        pq.remove(30); // Removes element "30" if it exists
        System.out.println("PriorityQueue after removing 30: " + pq);

        // 6. Check if an element exists
        boolean contains15 = pq.contains(15);
        System.out.println("Does the PriorityQueue contain 15? " + contains15);

        // 7. Traverse the PriorityQueue using a for-each loop
        System.out.println("Traversing PriorityQueue:");
        for (int item : pq) {
            System.out.println(item);
        }

        // 8. Add more elements
        pq.add(50);
        pq.add(5);
        System.out.println("PriorityQueue after adding more elements: " + pq);

        // 9. Check the size of the PriorityQueue
        System.out.println("Size of PriorityQueue: " + pq.size());

        // 10. Clear the PriorityQueue
        pq.clear();
        System.out.println("PriorityQueue after clearing: " + pq);
        System.out.println("Is the PriorityQueue empty? " + pq.isEmpty());
    }
}
