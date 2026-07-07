package com.cognizant.employeemanagementsystem.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.cognizant.employeemanagementsystem.entity.Employee;
import com.cognizant.employeemanagementsystem.service.EmployeeService;
import org.springframework.data.domain.Page;
import com.cognizant.employeemanagementsystem.projection.EmployeeDTO;
import com.cognizant.employeemanagementsystem.projection.EmployeeView;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @PostMapping
    public Employee save(@RequestBody Employee employee) {
        return service.saveEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAll() {
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable Long id) {
        return service.getEmployeeById(id);
    }

    @PutMapping("/{id}")
    public Employee update(@PathVariable Long id,
                           @RequestBody Employee employee) {
        return service.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteEmployee(id);
        return "Employee Deleted Successfully";
    }

    @GetMapping("/email/{email}")
public Employee getByEmail(@PathVariable String email) {
    return service.getEmployeeByEmail(email);
}

    @GetMapping("/name/{name}")
    public List<Employee> getByName(@PathVariable String name) {
        return service.getEmployeesByName(name);
    }

    @GetMapping("/department/{departmentName}")
    public List<Employee> getByDepartment(
            @PathVariable String departmentName) {

        return service.getEmployeesByDepartmentName(departmentName);
    }

    @GetMapping("/search")
    public List<Employee> searchByEmail(
            @RequestParam String email) {

        return service.searchEmployeesByEmail(email);
    }

    @GetMapping("/page")
    public Page<Employee> getEmployeesWithPagination(

            @RequestParam int page,

            @RequestParam int size) {

        return service.getEmployeesWithPagination(page, size);
    }

    @GetMapping("/pageSort")
    public Page<Employee> getEmployeesWithPaginationAndSorting(

            @RequestParam int page,

            @RequestParam int size,

            @RequestParam String field) {

        return service.getEmployeesWithPaginationAndSorting(
                page,
                size,
                field);
    }

        @GetMapping("/projection")
    public List<EmployeeView> getProjection(){

        return service.getEmployeeProjection();

    }

    @GetMapping("/projection/dto")
    public List<EmployeeDTO> getDTOProjection(){

        return service.getEmployeeDTOProjection();

    }

    @PostMapping("/batch")
    public String saveEmployees(@RequestBody List<Employee> employees){

        service.saveEmployees(employees);

        return "Employees Saved Successfully";

    }
    }