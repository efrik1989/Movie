package controller;

import model.Employee;

import java.util.ArrayList;

public class EmployeeBase {
    ArrayList<Employee> employees = new ArrayList<Employee>();
    private static final EmployeeBase INSTANCE = new EmployeeBase();

    public static EmployeeBase getInstance() {
        if (INSTANCE == null) {
            return new EmployeeBase();
        }
        return INSTANCE;
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
