import java.util.Scanner;

class Employees{
    int empid;
    String name;
    double salary;
    String address;

public Employees(int empid, String name, double salary, String address){
  this.empid=empid;
  this.name=name;
  this.salary=salary;
  this.address=address;
    }
}

class Teacher extends Employees{
    String department;
    String subjectsTaught;

    public Teacher(int empid, String name, double salary, String address, String department, String subjectsTaught){
    super(empid, name, salary, address);
    this.department=department;
    this.subjectsTaught=subjectsTaught;
    }

public void display(){
   System.out.println("Employee id:" + empid);
   System.out.println("Name:" + name);
   System.out.println("salary:" + salary);
   System.out.println("Address:" + address);
   System.out.println("Department:" + department);
   System.out.println("Subjects Taught:" + subjectsTaught);
    }
}

public class Employees{
public static void main(String[]args){
  Scanner scanner=new Scanner(System.in);
  System.out.println("enter the number of teachers");
  int n=scanner.nextInt();
  Teacher[] teachers=new Teacher[n];

for(int i=0;i<n;i++){
   System.out.println("enter the details of teacher" + (i+1) + ":");
   System.out.println("Employee id:");
   int empid=scanner.nextInt();
   scanner.nextLine(); 
   System.out.println("Name:");
   String name=scanner.nextLine();
   System.out.println("salary");
   double salary=scanner.nextDouble();
   scanner.nextLine(); 
   System.out.println("Address");
   String address=scanner.nextLine();
   System.out.println("Department");
   String department=scanner.nextLine();
   System.out.println("subjectsTaught");
   String subjectsTaught=scanner.nextLine();
   teachers[i]=new Teacher(empid, name, salary, address, department, subjectsTaught);
        }
System.out.println("\nDetails of Teachers:");
for(Teacher teacher : teachers){
teacher.display();
        }
    }
}
