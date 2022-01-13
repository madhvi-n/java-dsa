package functions;

public class Shadowing {
    static int x = 100;
    public static void main(String[] args) {
        System.out.println(x); //This will print 100

        int x = 50; //The class variable at line 4 is shadowed by this.
        System.out.println(x); //Scope begins when value is initialized.
    }

    static void fun() {
        System.out.println(x); // This will print 100
    }
}