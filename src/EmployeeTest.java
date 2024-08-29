public class EmployeeTest {
    public static void main(String[] args) {
        // Creating an Employee instance
        Employee emp = new Employee("Aditi Basnet", 30, "IT", 50000);

        // Creating a Manager instance
        Manager mgr = new Manager("Aishworya Shrestha", 40, "HR", 70000, 10000);

        // Display information of both Employee and Manager
        System.out.println("Employee Information:");
        emp.displayEmployeeInfo();

        System.out.println("\nManager Information:");
        mgr.displayEmployeeInfo();

        // Raise the salary of both Employee and Manager by 10%
        emp.raiseSalary(10);
        mgr.raiseSalary(10);

        // Display the updated information including bonus
        System.out.println("\nUpdated Employee Information:");
        emp.displayEmployeeInfo();

        System.out.println("\nUpdated Manager Information:");
        mgr.displayEmployeeInfo();
    }
}
