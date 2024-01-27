import java.util.Scanner;

public class StringComparison {
    // Method to compare two strings
    static int usrstrcmp(String str1, String str2) {
        return str1.compareTo(str2);
    }

    // Method to compare specified number of characters from the first string with the second string
    static int usrstrcmp(String str1, String str2, int numChars) {
        return str1.substring(0, numChars).compareTo(str2.substring(0, numChars));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        // Compare two strings using the first version of usrstrcmp()
        int result1 = usrstrcmp(string1, string2);
        System.out.println("Result of full string comparison: " + result1);

        // Compare specified number of characters from the first string with the second string
        System.out.print("Enter the number of characters to compare: ");
        int numChars = scanner.nextInt();
        int result2 = usrstrcmp(string1, string2, numChars);
        System.out.println("Result of partial string comparison: " + result2);

        // Display results
        if (result1 == 0) {
            System.out.println("The strings are equal (full comparison).");
        } else {
            System.out.println("The strings are not equal (full comparison).");
        }

        if (result2 == 0) {
            System.out.println("The strings are equal (partial comparison).");
        } else {
            System.out.println("The strings are not equal (partial comparison).");
        }

        scanner.close();
    }
}
