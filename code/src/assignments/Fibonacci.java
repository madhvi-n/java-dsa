package assignments;

public class Fibonacci {
    public static void main(String[] args) {
        int num = 10;
        int first = 0;
        int second = 1;
        for (int i = 1; i <= num; ++i) {
            System.out.print(first + ", ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}