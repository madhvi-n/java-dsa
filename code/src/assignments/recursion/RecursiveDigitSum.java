package assignments.recursion;

public class RecursiveDigitSum {
    public static void main(String[] args) {
        System.out.println(digitSum(12345));
    }

    static int digitSum(int n ) {
        if(n % 10 == n){
            return n;
        }

        return (n % 10) + digitSum(n/10);
    }

}