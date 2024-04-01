import java.util.Scanner;


class Employee {

    int eno;

    String ename;

    double salary;


    public Employee(int eno, String ename, double salary) {

        this.eno = eno;

        this.ename = ename;

        this.salary = salary;

    }


    public int getEno() {

        return eno;

    }


    public String getEname() {

        return ename;

    }

}


public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of employees:");

        int n = scanner.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Enter details of employee " + (i + 1) + ":");

            System.out.println("Employee number:");

            int eno = scanner.nextInt();

            System.out.println("Employee name:");

            String ename = scanner.next();

            System.out.println("Employee salary:");

            double salary = scanner.nextDouble();

            employees[i] = new Employee(eno, ename, salary);

        }

        System.out.println("Enter the employee number to search:");

        int searcheno = scanner.nextInt();

        boolean found = false;

        for (Employee emp : employees) {

            if (emp.getEno() == searcheno) {

                System.out.println("Employee found - Employee Number: " + emp.getEno() + " Employee Name: " + emp.getEname() + " Salary: " + emp.salary);

                found = true;

                break;

            }

        }

        if (!found) {

            System.out.println("Employee not found");

        }

        scanner.close();

    }

}

