class ComplexNumber {
    private double real;
    private double imaginary;

    // Constructor to initialize the complex number
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Getter method for real part
    public double getReal() {
        return real;
    }

    // Getter method for imaginary part
    public double getImaginary() {
        return imaginary;
    }

    // Method to add two complex numbers
    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    // Method to subtract two complex numbers
    public ComplexNumber subtract(ComplexNumber other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    // Method to compare two complex numbers
    public boolean isEqual(ComplexNumber other) {
        return this.real == other.real && this.imaginary == other.imaginary;
    }
}

public class ComplexNumberOperations {
    public static void main(String[] args) {
        // Creating complex numbers
        ComplexNumber complex1 = new ComplexNumber(3.0, 4.0);
        ComplexNumber complex2 = new ComplexNumber(2.0, -1.0);

        // a. Addition of two complex numbers
        ComplexNumber sum = complex1.add(complex2);
        System.out.println("Sum: " + sum.getReal() + " + " + sum.getImaginary() + "i");

        // b. Subtraction of two complex numbers
        ComplexNumber difference = complex1.subtract(complex2);
        System.out.println("Difference: " + difference.getReal() + " + " + difference.getImaginary() + "i");

        // c. Compare two complex numbers
        if (complex1.isEqual(complex2)) {
            System.out.println("The complex numbers are equal.");
        } else {
            System.out.println("The complex numbers are not equal.");
        }
    }
}
