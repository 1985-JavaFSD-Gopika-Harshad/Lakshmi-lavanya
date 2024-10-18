import java.util.ArrayList;

public class GenericStack<T> {
    private ArrayList<T> stack;

    // Constructor to initialize the stack
    public GenericStack() {
        stack = new ArrayList<>();
    }

    // Push an item onto the stack
    public void push(T item) {
        stack.add(item);
    }

    // Pop an item from the stack (removes and returns the top item)
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    // Peek at the top item of the stack without removing it
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.get(stack.size() - 1);
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Get the number of items in the stack
    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        // Sample usage with Integer stack
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        System.out.println("Top of stack: " + intStack.peek()); // Output: 30
        System.out.println("Stack size: " + intStack.size()); // Output: 3

        System.out.println("Popped: " + intStack.pop()); // Output: 30
        System.out.println("Top of stack after pop: " + intStack.peek()); // Output: 20
        System.out.println("Stack size after pop: " + intStack.size()); // Output: 2

        // Sample usage with String stack
        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("Hello");
        stringStack.push("World");
        System.out.println("Top of string stack: " + stringStack.peek()); // Output: World
        System.out.println("String stack size: " + stringStack.size()); // Output: 2
    }
}
second code