package assignments.math;

import java.util.ArrayList;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        System.out.println(sieve(n, primes));
    }

    //False denotes number is prime, true denotes number is multiple
    static ArrayList<Integer> sieve(int n, boolean[] primes) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 2; i * i <= n; i++) {
            if(!primes[i]) {
                for(int j = i * 2; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if(!primes[i]) {
                result.add(i);
            }
        }
        return result;
    }
}