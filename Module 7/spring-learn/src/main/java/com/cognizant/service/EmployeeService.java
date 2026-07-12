package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.exception.EmployeeNotFoundException;
import com.cognizant.model.Employee;

@Service
public class EmployeeService {

    private static List<Employee> employees =
            new ArrayList<>();

    static {

        employees.add(
                new Employee(1, "Ezhil", 50000));

        employees.add(
                new Employee(2, "Rahul", 60000));

        employees.add(
                new Employee(3, "Priya", 70000));
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getEmployee(int id) {

    return employees.stream()
            .filter(e -> e.getId() == id)
            .findFirst()
            .orElseThrow(() ->
                    new EmployeeNotFoundException(
                            "Employee not found : " + id));
}

    public Employee addEmployee(Employee employee) {

        employees.add(employee);

        return employee;
    }

    public Employee updateEmployee(
            int id,
            Employee employee) {

        Employee emp = getEmployee(id);

        if (emp != null) {

            emp.setName(employee.getName());
            emp.setSalary(employee.getSalary());
        }

        return emp;
    }

    public void deleteEmployee(int id) {

        employees.removeIf(
                e -> e.getId() == id);
    }
}