import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static List<Integer> findPrimes(int limit) {
        // Create a boolean array "isPrime" and initialize all entries as true.
        // A value in isPrime[i] will finally be false if i is Not a prime, else true.
        boolean[] isPrime = new boolean[limit + 1];
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        // Iterate through all numbers starting from 2 (the first prime).
        for (int p = 2; p * p <= limit; p++) {
            // If isPrime[p] is not changed, then it's a prime.
            if (isPrime[p]) {
                // Mark all multiples of p as not prime.
                for (int i = p * p; i <= limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Collect all prime numbers into a list.
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        int limit = 50;
        List<Integer> primes = findPrimes(limit);

        System.out.println("Prime numbers up to " + limit + ":");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }
}