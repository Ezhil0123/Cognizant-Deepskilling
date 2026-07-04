public class EmployeeManagement {

    private Employee[] employees;
    private int size;

    public EmployeeManagement(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    // Add Employee
    public void addEmployee(Employee employee) {

        if (size == employees.length) {
            System.out.println("Array is Full!");
            return;
        }

        employees[size++] = employee;
        System.out.println("Employee Added Successfully.");
    }

    // Search Employee
    public Employee searchEmployee(int id) {

        for (int i = 0; i < size; i++) {

            if (employees[i].getEmployeeId() == id) {
                return employees[i];
            }
        }

        return null;
    }

    // Traverse Employees
    public void displayEmployees() {

        if (size == 0) {
            System.out.println("No Employees Found.");
            return;
        }

        System.out.println("\nEmployee Records\n");

        for (int i = 0; i < size; i++) {

            System.out.println(employees[i]);
            System.out.println("------------------------");
        }
    }

    // Delete Employee
    public void deleteEmployee(int id) {

        int index = -1;

        for (int i = 0; i < size; i++) {

            if (employees[i].getEmployeeId() == id) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Employee Not Found.");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            employees[i] = employees[i + 1];
        }

        employees[size - 1] = null;
        size--;

        System.out.println("Employee Deleted Successfully.");
    }
}