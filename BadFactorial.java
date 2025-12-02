public class BadFactorial {

    public static void main(String[] args){
        System.out.println("Factorial of 5: " + calculateFactorial(5));
    }
    // Bad: No input validation (can lead to StackOverflowError or wrong output)
    public static long calculateFactorial(int n) {
        // Bad: Implicitly relies on the caller to pass non-negative number
        if (n == 0) {
            return 1;
        }
        // Bad: Recursive calls consume stack space and can be slower
        // due to function call overhead compared to iteration.
        return n * calculateFactorial(n - 1); 
    }
}
