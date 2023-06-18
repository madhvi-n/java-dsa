package data_structures.stacks;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a Stack of integers
        Stack<Integer> numbers = new Stack<>();

        // Pushing elements to the Stack
        numbers.push(5);
        numbers.push(10);
        numbers.push(15);

        // Popping elements from the Stack
        System.out.println("Popped element: " + numbers.pop());

        // Accessing the top element of the Stack
        System.out.println("Top element: " + numbers.peek());

        // Checking if the Stack is empty
        System.out.println("Is the Stack empty? " + numbers.isEmpty());
    }
}
