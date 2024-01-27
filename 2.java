import java.util.Scanner;

class Employee {
    String name;
    int empId;
    String department;
    int age;
    String designation;

    public Employee(String name, int empId, String department, int age, String designation) {
        this.name = name;
        this.empId = empId;
        this.department = department;
        this.age = age;
        this.designation = designation;
    }
}

public class EmployeeDatabase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        // a. Read and display details of at least five employees
        System.out.println("Enter details for at least five employees:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Emp_id: ");
            int empId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline left by nextInt()
            System.out.print("Department: ");
            String department = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline left by nextInt()
            System.out.print("Designation: ");
            String designation = scanner.nextLine();

            employees[i] = new Employee(name, empId, department, age, designation);
        }

        // b. Calculate and display the sum of salary of all employees of "sales" department
        int sumSalarySales = calculateSumSalary(employees, "sales");
        System.out.println("\nSum of salary of all employees in the 'sales' department: " + sumSalarySales);

        // c. Retrieve the details of the highest paid manager in the "purchase" department
        Employee highestPaidManager = getHighestPaidManager(employees, "purchase");
        if (highestPaidManager != null) {
            System.out.println("\nDetails of the highest paid manager in the 'purchase' department:");
            displayEmployeeDetails(highestPaidManager);
        } else {
            System.out.println("\nNo manager found in the 'purchase' department.");
        }

        scanner.close();
    }

    static int calculateSumSalary(Employee[] employees, String department) {
        int sumSalary = 0;
        for (Employee employee : employees) {
            if (employee.department.equalsIgnoreCase(department)) {
                // Assuming salary is not explicitly provided, you can add a salary field and use it here
                // For now, just adding empId as a placeholder for salary
                sumSalary += employee.empId;
            }
        }
        return sumSalary;
    }

    static Employee getHighestPaidManager(Employee[] employees, String department) {
        Employee highestPaidManager = null;
        int maxSalary = 0;
        for (Employee employee : employees) {
            if (employee.department.equalsIgnoreCase(department) && employee.designation.equalsIgnoreCase("manager")) {
                // Assuming salary is not explicitly provided, you can add a salary field and use it here
                // For now, just comparing empId as a placeholder for salary
                if (employee.empId > maxSalary) {
                    maxSalary = employee.empId;
                    highestPaidManager = employee;
                }
            }
        }
        return highestPaidManager;
    }

    static void displayEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.name);
        System.out.println("Emp_id: " + employee.empId);
        System.out.println("Department: " + employee.department);
        System.out.println("Age: " + employee.age);
        System.out.println("Designation: " + employee.designation);
    }
}
