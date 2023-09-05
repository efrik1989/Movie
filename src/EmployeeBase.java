import java.util.ArrayList;

public class EmployeeBase {
    ArrayList<Employee> employees = new ArrayList<Employee>();
    EmployeeBase employeeBase;

    public EmployeeBase getInstance() {
        if (employeeBase == null) {
            return new EmployeeBase();
        }
        return employeeBase;
    }

    void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    void removeEmployee(String name) {

    }

    Employee searchEmployee(String name) {
        for (Employee empl : employees) {
            if (empl.name.equals(name)) {
                return empl;
            }
        }
         return null;
    }

}
