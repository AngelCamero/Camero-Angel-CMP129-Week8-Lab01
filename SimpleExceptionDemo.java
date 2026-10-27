public class SimpleExceptionDemo {
    public static void safeDivide(int numerator, int denominator){
        try {
            System.out.println("Attempting to divide " + numerator + " by " + denominator);
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        }
        catch(ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        finally {
            System.out.println("Division operation is complete.");
            System.out.println();
        }
    }
    public static void main(String[] args) {
    safeDivide(20, 4);
    safeDivide(15, 0);
    safeDivide(-30, 5);
    }
}
