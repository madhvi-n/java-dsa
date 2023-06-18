package data_structures.maps;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap of strings (name -> age)
        HashMap<String, Integer> ages = new HashMap<>();

        // Adding key-value pairs to the HashMap
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 35);

        // Accessing values in the HashMap
        System.out.println("Alice's age: " + ages.get("Alice"));
        System.out.println("Bob's age: " + ages.get("Bob"));

        // Updating a value in the HashMap
        ages.put("Alice", 26);

        // Removing a key-value pair from the HashMap
        ages.remove("Charlie");

        // Iterating over the key-value pairs in the HashMap
        for (String name : ages.keySet()) {
            int age = ages.get(name);
            System.out.println(name + ": " + age);
        }
    }
}
