import java.util.Scanner;

// Custom exception for negative number input
class NegativeNumberInputException extends Exception {
    public NegativeNumberInputException(String message) {
        super(message);
    }
}

// Custom exception for divide by zero
class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Read two positive integers
            System.out.print("Enter the numerator (positive integer): ");
            int numerator = scanner.nextInt();

            if (numerator <= 0) {
                throw new NegativeNumberInputException("Numerator must be a positive integer.");
            }

            System.out.print("Enter the denominator (positive integer, non-zero): ");
            int denominator = scanner.nextInt();

            if (denominator <= 0) {
                throw new NegativeNumberInputException("Denominator must be a positive integer.");
            }

            if (denominator == 0) {
                throw new DivideByZeroException("Cannot divide by zero.");
            }

            // Perform the division operation
            double result = (double) numerator / denominator;

            // Display the result
            System.out.println("Result of division: " + result);

        } catch (NegativeNumberInputException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (DivideByZeroException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred.");
        } finally {
            scanner.close();
        }
    }
}


