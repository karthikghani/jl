import java.util.Scanner;

// Define the Compute interface
interface Compute {
    double convert(double value);
}

// Implementation of the Compute interface to convert gigabytes to bytes
class StorageConverter implements Compute {
    @Override
    public double convert(double gigabytes) {
        // 1 gigabyte = 1024^3 bytes
        return gigabytes * Math.pow(1024, 3);
    }
}

// Implementation of the Compute interface to convert Euros to Rupees
class CurrencyConverter implements Compute {
    @Override
    public double convert(double euros) {
        // Assuming 1 Euro = 90 Rupees
        return euros * 90;
    }
}
public class ConversionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user for gigabytes
        System.out.print("Enter the value in gigabytes: ");
        double gbValue = scanner.nextDouble();

        // Take input from the user for Euros
        System.out.print("Enter the value in Euros: ");
        double euroValue = scanner.nextDouble();

        // Declare objects for both classes
        StorageConverter storageConverter = new StorageConverter();
        CurrencyConverter currencyConverter = new CurrencyConverter();

        // Demonstrate conversion from gigabytes to bytes
        double bytesResult = storageConverter.convert(gbValue);
        System.out.println(gbValue + " gigabytes is equal to " + bytesResult + " bytes.");

        // Demonstrate conversion from Euros to Rupees
        double rupeesResult = currencyConverter.convert(euroValue);
        System.out.println(euroValue + " Euros is equal to " + rupeesResult + " Rupees.");

        scanner.close();
    }
}

