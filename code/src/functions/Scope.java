package functions;

public class Scope {
    public static void main(String[] args) {
        int a = 20;
//        int b = 10;
        String name = "John";
        {
//            int a = 100; Already initialized outside the block in the same function so cannot be reinitialized again
            a = a + 50;  //Reassign the original reference variable to some other value
            int c = 100;
            System.out.println(c);
            name += " Joe";
            // Values initialized inside the block remains in the block

        }
        System.out.println(a);
        System.out.println(name);
//        System.out.println(c); Values inside the block cannot be accessed outside the block;
    }
}