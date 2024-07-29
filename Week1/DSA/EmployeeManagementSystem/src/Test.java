public class Test {
    public static void main(String[] args) {
        // Create test data
        Employee employee1 = new Employee(1, "Kingshuk", "Manager", 50000);
        Employee employee2 = new Employee(2, "Nilabja", "Developer", 40000);

        EmployeeManagementSystem ems = new EmployeeManagementSystem(2);

        ems.addEmployee(employee1);
        ems.addEmployee(employee2);

        Employee foundEmployee = ems.searchEmployee(1);
        System.out.println(foundEmployee);

        ems.traverseEmployees();

        ems.deleteEmployee(1);
        foundEmployee = ems.searchEmployee(1);
        System.out.println(foundEmployee); 
    }
}
