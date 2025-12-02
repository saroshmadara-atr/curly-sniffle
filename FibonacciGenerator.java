import java.util.Scanner; // Import added for potential future use (e.g., taking user input)

/**
 * FibonacciGenerator.java
 * This program calculates and prints the Fibonacci sequence up to a specified number of terms.
 * The Fibonacci sequence is a series where the next number is the sum of the previous two.
 * The sequence starts with 0 and 1. (e.g., 0, 1, 1, 2, 3, 5, 8, 13, ...)
 */
public class FibonacciGenerator {

    /**
     * Main method to run the Fibonacci generation logic.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // --- Configuration ---
        int maxTerms = 10; // Change this value to generate more or fewer terms
        
        System.out.println("--- Fibonacci Series up to " + maxTerms + " terms ---");

        // Call the method to generate the series
        printFibonacciSeries(maxTerms);
    }

    /**
     * Generates and prints the Fibonacci series.
     * * @param n The number of terms to generate.
     */
    public static void printFibonacciSeries(int n) {
        // Edge case: If 0 or negative terms are requested
        if (n <= 0) {
            System.out.println("The number of terms must be a positive integer.");
            return;
        }

        // Initialize the first two terms of the sequence
        long firstTerm = 0;
        long secondTerm = 1;
        
        System.out.print("Series: ");

        // Case 1: Only 1 term requested
        if (n == 1) {
            System.out.println(firstTerm);
            return;
        }

        // Case 2: 2 or more terms requested
        
        // Print the first two terms immediately
        System.out.print(firstTerm + ", " + secondTerm);

        // Loop starting from the 3rd term (i=2) up to the requested number of terms (n)
        for (int i = 2; i < n; i++) {
            // Calculate the next term
            long nextTerm = firstTerm + secondTerm;
            
            // Print the next calculated term
            System.out.print(", " + nextTerm);

            // Update the terms for the next iteration:
            // The old secondTerm becomes the new firstTerm
            firstTerm = secondTerm;
            // The calculated nextTerm becomes the new secondTerm
            secondTerm = nextTerm;
        }
        
        // Final newline for clean output
        System.out.println();
    }
}