/**
 * PrimeChecker.java
 * This program checks if a number is prime.
 * A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
 */
public class PrimeChecker {

    /**
     * Main method to test the prime checking logic.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Test various numbers
        int[] testNumbers = {2, 3, 4, 5, 10, 17, 20, 29, 30, 97};

        System.out.println("--- Prime Number Checker ---");

        for (int num : testNumbers) {
            if (isPrime(num)) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is NOT a prime number");
            }
        }
    }

    /**
     * Checks if a given number is prime.
     * @param n The number to check.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(int n) {
        // Numbers less than or equal to 1 are not prime
        if (n <= 1) {
            return false;
        }

        // 2 is the only even prime number
        if (n == 2) {
            return true;
        }

        // Even numbers greater than 2 are not prime
        if (n % 2 == 0) {
            return false;
        }

        // Check odd divisors up to the square root of n
        // If n has a divisor greater than sqrt(n), it must also have one less than sqrt(n)
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false; // Found a divisor, not prime
            }
        }

        return true; // No divisors found, number is prime
    }
}
