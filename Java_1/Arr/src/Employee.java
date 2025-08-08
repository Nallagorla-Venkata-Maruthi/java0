import java.util.Scanner;

public class Employee {

    String empName;
    int empId;
    String empDept;

    void setDetails(String name, int id, String dept) {
        empName = name;
        empId = id;
        empDept = dept;
    }

    void display() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Department: " + empDept);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter employee department: ");
        String dept = sc.nextLine();

        emp.setDetails(name, id, dept);
        emp.display();

        sc.close();
    }
}
