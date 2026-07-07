package com.cognizant.employeemanagementsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.employeemanagementsystem.entity.Employee;
import com.cognizant.employeemanagementsystem.repository.EmployeeRepository;

import main.java.com.cognizant.employeemanagementsystem.projection.EmployeeDTO;
import main.java.com.cognizant.employeemanagementsystem.projection.EmployeeView;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {

        Employee existing = repository.findById(id).orElseThrow();

        existing.setName(employee.getName());
        existing.setEmail(employee.getEmail());
        existing.setDepartment(employee.getDepartment());

        return repository.save(existing);
    }

    @Override
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Page<Employee> getEmployeesWithPagination(int page, int size) {

        Pageable pageable = PageRequest.of(page, size);

        return repository.findAll(pageable);
    }

    @Override
    public Page<Employee> getEmployeesWithPaginationAndSorting(int page,
                                                            int size,
                                                            String field) {

        Pageable pageable =
                PageRequest.of(page, size, Sort.by(field).ascending());

        return repository.findAll(pageable);
    }

    @Override
    public Page<Employee> getEmployeesWithPaginationAndSorting(
            int page,
            int size,
            String field) {

        Pageable pageable = PageRequest.of(
                page,
                size,
                Sort.by(field).descending());

        return repository.findAll(pageable);
    }

    @Override
    public List<EmployeeView> getEmployeeProjection() {

        return repository.findAllProjectedBy();

    }

    @Override
    public List<EmployeeDTO> getEmployeeDTOProjection() {

        return repository.getEmployeeDTO();

    }

    @Override
    public void saveEmployees(List<Employee> employees) {

        repository.saveAll(employees);

    }
    }