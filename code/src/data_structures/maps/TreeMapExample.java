package data_structures.maps;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap of strings (name -> age)
        TreeMap<String, Integer> ages = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 35);

        // Accessing the value associated with a key
        System.out.println("Bob's age: " + ages.get("Bob"));

        // Removing a key-value pair from the TreeMap
        ages.remove("Charlie");

        // Iterating over the key-value pairs in the TreeMap
        for (String name : ages.keySet()) {
            int age = ages.get(name);
            System.out.println(name + ": " + age);
        }
    }
}
