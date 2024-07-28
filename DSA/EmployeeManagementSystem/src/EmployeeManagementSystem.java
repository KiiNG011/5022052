import java.util.Arrays;

public class EmployeeManagementSystem {
    Employee[] employees;
    int count;

    public EmployeeManagementSystem(int size) {
        employees = new Employee[size];
        count = 0;
    }

    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count++] = employee;
        } else {
            System.out.println("Array is full");
        }
    }

    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == employeeId) {
                // Shift elements to the left
                System.arraycopy(employees, i + 1, employees, i, count - i - 1);
                count--;
                break;
            }
        }
    }
}
