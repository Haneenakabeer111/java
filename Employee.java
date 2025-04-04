package haneena;

import java.util.Scanner;

public class Employee {
    int eNo, eSalary;
    String eName;

    // Constructor
    public Employee() {}

    public Employee(int no, int sal, String name) {
        eNo = no;
        eSalary = sal;
        eName = name;
    }

    // Method to show employee data
    public void showData() {
        System.out.print("EmpId = " + eNo + " " + "Name = " + eName + " " + 
                         "Salary = " + eSalary);
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Read number of employees
        System.out.println("Enter number of employees: ");
        int n = sc.nextInt();
        
        // Create array of Employee objects
        Employee[] employees = new Employee[n];
        
        // Read employee details one by one
        int eid, esal;
        String enam;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " employee details...");
            System.out.println("Enter employee id (integer): ");
            eid = sc.nextInt();
            
            System.out.println("Enter employee name (String): ");
            sc.nextLine();  // This consumes the newline character left after nextInt()
            enam = sc.nextLine(); // Read the employee name
            
            System.out.println("Enter employee salary (integer): ");
            esal = sc.nextInt();
            
            // Create new Employee object and assign it to the array
            employees[i] = new Employee(eid, esal, enam);
        }

        // Display all employees' details
        System.out.println("Employees are:\n");
        for (Employee y : employees) {
            y.showData();
        }

        // Search for an employee by employee number
        System.out.println("Enter employee number to search: ");
        int semp = sc.nextInt();
        boolean found = false;
        
        for (Employee e : employees) {
            if (semp == e.eNo) {
                found = true;
                System.out.println("Employee found.");
                e.showData();
                break;
            }
        }
        
        if (!found) {
            System.out.println("Employee not found.");
        }

        // Close the scanner
        sc.close();
    }
}