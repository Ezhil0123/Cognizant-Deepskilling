public class Main {

    public static void main(String[] args) {

        EmployeeManagement management = new EmployeeManagement(10);

        management.addEmployee(new Employee(101, "Rahul", "Manager", 75000));
        management.addEmployee(new Employee(102, "Priya", "Developer", 65000));
        management.addEmployee(new Employee(103, "Amit", "Tester", 50000));

        management.displayEmployees();

        System.out.println("\nSearching Employee...\n");

        Employee employee = management.searchEmployee(102);

        if (employee != null)
            System.out.println(employee);
        else
            System.out.println("Employee Not Found.");

        System.out.println("\nDeleting Employee...\n");

        management.deleteEmployee(101);

        management.displayEmployees();
    }
}