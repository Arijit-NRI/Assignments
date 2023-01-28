import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.*;

class Employee {
    private int empNo;
    String empName;
    String empDesignation;

    public Employee(int empNo, String empName, String empDesignation) {
        this.empNo = empNo;
        this.empName = empName;
        this.empDesignation = empDesignation;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }
}

public class CrudApp {
    static ArrayList<Employee> empList = new ArrayList<Employee>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Insert Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Update Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    insertEmployee();
                    break;
                case 2:
                    displayEmployees();
                    break;
                case 3:
                    searchEmployee();
                    break;
                case 4:
                    deleteEmployee();
                    break;
                case 5:
                    updateEmployee();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);
    }

    public static void insertEmployee() {
        int empNo;
        String empName;
        String empDesignation;
        System.out.print("Enter Employee Number: ");
        empNo = sc.nextInt();
        System.out.print("Enter Employee Name: ");
        empName = sc.next();
        System.out.print("Enter Employee Designation: ");
        empDesignation = sc.next();
        empList.add(new Employee(empNo, empName, empDesignation));
        System.out.println("Employee inserted successfully");
    }

    public static void displayEmployees() {
        Iterator<Employee> itr = empList.iterator();
        System.out.println("Employee Number\tEmployee Name\tEmployee Designation");
        while (itr.hasNext()) {
            Employee emp = itr.next();
            System.out.println(emp.getEmpNo() + "\t\t" + emp.getEmpName()+ "\t\t"+ emp.empDesignation );
        }
    }
    public static void searchEmployee() 
    {
                int empNo;
                System.out.println("Enter Employee Number to search: ");
                empNo = sc.nextInt();
                Iterator<Employee> itr = empList.iterator();
                boolean isFound = false;
                while (itr.hasNext()) {
                    Employee emp = itr.next();
                    if (emp.getEmpNo() == empNo) {
                        System.out.println("Employee Found");
                        System.out.println("Employee Number: " + emp.getEmpNo());
                        System.out.println("Employee Name: " + emp.getEmpName());
                        System.out.println("Employee Designation: " + emp.getEmpDesignation());
                        isFound = true;
                        break;
                    }
                }
                if (!isFound) {
                    System.out.println("Employee not found");
                }
            }

        
            public static void deleteEmployee() {
                int empNo;
                System.out.print("Enter Employee Number to delete: ");
                empNo = sc.nextInt();
                Iterator<Employee> itr = empList.iterator();
                boolean isFound = false;
                while (itr.hasNext()) {
                    Employee emp = itr.next();
                    if (emp.getEmpNo() == empNo) {
                        itr.remove();
                        System.out.println("Employee deleted successfully");
                        isFound = true;
                        break;
                    }
                }
                if (!isFound) {
                    System.out.println("Employee not found");
                }
            }
        
            public static void updateEmployee() {
                int empNo;
                String empName;
                String empDesignation;
                System.out.println("Enter Employee Number to update: ");
                empNo = sc.nextInt();
                Iterator<Employee> itr = empList.iterator();
                boolean isFound = false;
                while (itr.hasNext()) {
                    Employee emp = itr.next();
                    if (emp.getEmpNo() == empNo) {
                        System.out.print("Enter new Employee Name: ");
                        empName = sc.next();
                        System.out.print("Enter new Employee Designation: ");
                        empDesignation = sc.next();
                        emp.empName = empName;
                        emp.empDesignation = empDesignation;
                        System.out.println("Employee updated successfully");
                        isFound = true;
                        break;
                    }
                }
                if (!isFound) {
                    System.out.println("Employee not found");
                }
            }
        }
     
