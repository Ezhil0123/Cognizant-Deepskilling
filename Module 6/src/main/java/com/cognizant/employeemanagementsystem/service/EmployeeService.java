package com.cognizant.employeemanagementsystem.service;

import java.util.List;
import com.cognizant.employeemanagementsystem.entity.Employee;
import org.springframework.data.domain.Page;
import com.cognizant.employeemanagementsystem.projection.EmployeeDTO;
import com.cognizant.employeemanagementsystem.projection.EmployeeView;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);

    void deleteEmployee(Long id);

    // Exercise 5 Methods

    Employee getEmployeeByEmail(String email);

    List<Employee> getEmployeesByName(String name);

    List<Employee> getEmployeesByDepartmentName(String departmentName);

    List<Employee> searchEmployeesByEmail(String email);

    Page<Employee> getEmployeesWithPagination(int page, int size);

    Page<Employee> getEmployeesWithPaginationAndSorting(int page,
                                                        int size,
                                                        String field);

    List<EmployeeView> getEmployeeProjection();

    List<EmployeeDTO> getEmployeeDTOProjection();

    void saveEmployees(List<Employee> employees);
    
}