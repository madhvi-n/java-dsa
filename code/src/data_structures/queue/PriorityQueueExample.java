package data_structures.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue of integers
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        numbers.offer(10);
        numbers.offer(20);
        numbers.offer(15);

        // Accessing and removing the highest priority element
        System.out.println("Highest priority element: " + numbers.poll());

        // Accessing the highest priority element without removing it
        System.out.println("Highest priority element: " + numbers.peek());

        // Checking if the PriorityQueue is empty
        System.out.println("Is the PriorityQueue empty? " + numbers.isEmpty());
    }
}
