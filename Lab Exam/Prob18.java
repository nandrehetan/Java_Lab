import java.util.*;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    private String designation;
    private double salary;

    public Employee(String name, int age, String designation, double salary) {
        super(name, age);
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class Prob18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        // Accept data for 5 persons
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter designation: ");
            String designation = scanner.nextLine();
            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            employees[i] = new Employee(name, age, designation, salary);
        }

        // Display the name of employees with salary greater than 5000
        System.out.println("Employees with salary greater than 5000:");
        for (Employee employee : employees) {
            if (employee.getSalary() > 5000) {
                System.out.println(employee.getName());
            }
        }

        scanner.close();
    }
}
