package data_structures.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue of strings
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the Queue
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        // Removing elements from the Queue
        System.out.println("Removed element: " + queue.remove());

        // Accessing the first element of the Queue
        System.out.println("First element: " + queue.peek());

        // Checking if the Queue is empty
        System.out.println("Is the Queue empty? " + queue.isEmpty());
    }
}
