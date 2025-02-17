public class StackTest {
    public static void main(String[] args) {
        try {
            // Create a stack of Integers with a capacity of 5.
            Stack<Integer> numberStack = new Stack<>(7);
            System.out.println("Testing number stack:");

            // Push numbers 1 to 5 onto the stack.
            for (int i = 1; i <= 7; i++) {
                System.out.println("Pushing " + i);
                numberStack.push(i);
            }

            // List all elements currently in the stack.
            System.out.println("Stack contents: " + numberStack.list());

            // Attempt to push another element to trigger StackFullException.
            try {
                System.out.println("Attempting to push 6 on a full stack...");
                numberStack.push(8);
            } catch (StackFullException e) {
                System.out.println("Expected exception: " + e.getMessage());
            }

            // Peek at the top element of the stack.
            System.out.println("Peeking top element: " + numberStack.peek());

            // Pop all elements from the stack.
            System.out.println("Popping elements:");
            while (true) {
                System.out.println("Popped: " + numberStack.pop());
            }
        } catch (StackEmptyException | StackFullException e) {
            // Catch exception when the stack becomes empty.
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            // Create a stack of Strings with a capacity of 3.
            Stack<String> textStack = new Stack<>(3);
            System.out.println("\nTesting text stack:");

            // Push text values onto the stack.
            System.out.println("Pushing 'Hello'");
            textStack.push("Hello");
            System.out.println("Pushing 'World'");
            textStack.push("World");
            System.out.println("Pushing 'Stack'");
            textStack.push("Stack");

            // List all elements currently in the stack.
            System.out.println("Stack contents: " + textStack.list());

            // Peek at the top element of the stack.
            System.out.println("Peeking top element: " + textStack.peek());

            // Pop all elements from the stack.
            System.out.println("Popping elements:");
            while (true) {
                System.out.println("Popped: " + textStack.pop());
            }
        } catch (StackEmptyException | StackFullException e) {
            // Expected exception when trying to pop from an empty stack.
            System.out.println("Expected exception: " + e.getMessage());
        }
    }
}