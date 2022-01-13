package functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1, 2, 3,4, 5, 6, 7, 8);
        fun("Hello", "World", "John");
        multiple( 10 , 12, "Hello", "World", "Maya", "Scarlet");
    }

    static void multiple(int a, int b, String ...v) { //Variable length args should come in the end
        System.out.println("Sum" + ": " + a + b);
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(String ...v) {
        System.out.println(Arrays.toString(v));
    }
}