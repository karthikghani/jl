import java.util.Scanner;

// Base class Person
class Person {
    private String name;
    private int age;
    private String gender;

    // Constructor to initialize Person details
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

// Derived class Employee
class Employee extends Person {
    private String employeeId;
    private double salary;

    // Constructor to initialize Employee details
    public Employee(String name, int age, String gender, String employeeId, double salary) {
        super(name, age, gender);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Method to display Employee details
    public void displayEmployeeDetails() {
        super.displayDetails();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
        System.out.println("---------------");
    }
}

// Derived class Student
class Student extends Person {
    private String studentId;
    private String course;

    // Constructor to initialize Student details
    public Student(String name, int age, String gender, String studentId, String course) {
        super(name, age, gender);
        this.studentId = studentId;
        this.course = course;
    }

    // Method to display Student details
    public void displayStudentDetails() {
        super.displayDetails();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
        System.out.println("---------------");
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display details of at least five students
        System.out.println("Enter details for at least five students:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline left by nextInt()
            System.out.print("Gender: ");
            String gender = scanner.nextLine();
            System.out.print("Student ID: ");
            String studentId = scanner.nextLine();
            System.out.print("Course: ");
            String course = scanner.nextLine();

            Student student = new Student(name, age, gender, studentId, course);
            student.displayStudentDetails();
        }

        // Display details of at least five employees
        System.out.println("Enter details for at least five employees:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline left by nextInt()
            System.out.print("Gender: ");
            String gender = scanner.nextLine();
            System.out.print("Employee ID: ");
            String employeeId = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline left by nextDouble()

            Employee employee = new Employee(name, age, gender, employeeId, salary);
            employee.displayEmployeeDetails();
        }

        scanner.close();
    }
}
