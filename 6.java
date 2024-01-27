import java.util.Scanner;

// Abstract base class Bank
abstract class Bank {
    protected String name;
    protected long accountNumber;
    protected double balance;

    public Bank() {
        readDetails();
    }

    public void readDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        name = scanner.nextLine();
        System.out.print("Enter account number: ");
        accountNumber = scanner.nextLong();
        System.out.print("Enter balance: ");
        balance = scanner.nextDouble();
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    // Abstract method to calculate rate of interest
    public abstract void calculateInterest();
}

// Derived class CityBank
class CityBank extends Bank {
    public CityBank() {
        super();
    }

    // Override the calculate method for CityBank
    @Override
    public void calculateInterest() {
        double interestRate = 8.0; // Example interest rate for City Bank
        double interestEarned = (balance * interestRate) / 100;
        System.out.println("Interest earned by City Bank account holders: " + interestEarned);
    }
}

// Derived class SBIBank
class SBIBank extends Bank {
    public SBIBank() {
        super();
    }

    // Override the calculate method for SBIBank
    @Override
    public void calculateInterest() {
        double interestRate = 7.5; // Example interest rate for SBI Bank
        double interestEarned = (balance * interestRate) / 100;
        System.out.println("Interest earned by SBI Bank account holders: " + interestEarned);
    }
}

// Derived class CanaraBank
class CanaraBank extends Bank {
    public CanaraBank() {
        super();
    }

    // Override the calculate method for CanaraBank
    @Override
    public void calculateInterest() {
        double interestRate = 9.0; // Example interest rate for Canara Bank
        double interestEarned = (balance * interestRate) / 100;
        System.out.println("Interest earned by Canara Bank account holders: " + interestEarned);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        CityBank cityBank = new CityBank();
        SBIBank sbiBank = new SBIBank();
        CanaraBank canaraBank = new CanaraBank();

        // Display details and calculate interest for each bank
        System.out.println("City Bank Details:");
        cityBank.displayDetails();
        cityBank.calculateInterest();
        System.out.println();

        System.out.println("SBI Bank Details:");
        sbiBank.displayDetails();
        sbiBank.calculateInterest();
        System.out.println();

        System.out.println("Canara Bank Details:");
        canaraBank.displayDetails();
        canaraBank.calculateInterest();
    }
}
