public class Manager extends Employee {
    private double bonus;

    public Manager(String name, int age, String department, double salary, double bonus) {
        super(name, age, department, salary); // Call the constructor of the Employee class
        this.bonus = bonus;
    }

    // Method to calculate total salary
    public double calculateTotalSalary() {
        return getSalary() + bonus;
    }

    @Override
    public void displayEmployeeInfo() {
        super.displayEmployeeInfo(); // Call the displayEmployeeInfo method of Employee
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}
