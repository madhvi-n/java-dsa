package recursion;

public class Recursion {
    public static void main(String[] args) {
        print(1);
//        print1(1);
    }

    static  void print1(int n) {
        System.out.println(n);
        print2(2);
    }

    static void print2(int i) {
        System.out.println(i);
        print3(3);
    }

    static void print3(int i) {
        System.out.println(i);
        print4(4);
    }

    static void print4(int i) {
        System.out.println(i);
        print5(5);
    }

    static void print5(int i) {
        System.out.println(i);
    }


    static void print(int n) {
        if(n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n + 1);
    }



}