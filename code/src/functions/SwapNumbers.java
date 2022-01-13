package functions;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swap: " + a + ", " + b);

//        int temp = a;
//        a = b;
//        b = temp;
        swap(a, b);
        System.out.println("After swap: " + a + "," + b);
    }

//    Pass by value. Java does not have pass by reference.
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }



}