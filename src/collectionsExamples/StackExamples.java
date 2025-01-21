package collectionsExamples;
import java.util.Stack;

public class StackExamples {
    public static void main(String[] args) {
        // 1. Create a Stack
        Stack<Integer> stack = new Stack<>();

        // 2. Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("After pushing elements: " + stack);

        // 3. Peek at the top element
        System.out.println("Top element using peek(): " + stack.peek());

        // 4. Pop elements from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("After popping an element: " + stack);

        // 5. Search for an element in the stack
        int position = stack.search(10); // Returns 1-based position
        if (position != -1) {
            System.out.println("Element 10 found at position (1-based): " + position);
        } else {
            System.out.println("Element 10 not found in the stack.");
        }

        // 6. Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());

        // 7. Traverse the stack using a for-each loop
        System.out.println("Traversing the stack:");
        for (int item : stack) {
            System.out.println(item);
        }

        // 8. Push more elements
        stack.push(40);
        stack.push(50);
        System.out.println("After pushing more elements: " + stack);

        // 9. Traverse the stack using a while loop
        System.out.println("Traversing the stack using a while loop (LIFO):");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // 10. Final check
        System.out.println("Is the stack empty after popping all elements? " + stack.isEmpty());
    }
}
