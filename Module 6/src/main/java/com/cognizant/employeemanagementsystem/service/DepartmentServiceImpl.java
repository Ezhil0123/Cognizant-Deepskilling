package com.cognizant.employeemanagementsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.employeemanagementsystem.entity.Department;
import com.cognizant.employeemanagementsystem.repository.DepartmentRepository;

import main.java.com.cognizant.employeemanagementsystem.entity.Employee;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository repository;

    public DepartmentServiceImpl(DepartmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Department saveDepartment(Department department) {
        return repository.save(department);
    }

    @Override
    public List<Department> getAllDepartments() {
        return repository.findAll();
    }

    @Override
    public Department getDepartmentById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Department updateDepartment(Long id, Department department) {
        Department existing = repository.findById(id).orElseThrow();

        existing.setName(department.getName());

        return repository.save(existing);
    }

    @Override
    public void deleteDepartment(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Employee getEmployeeByEmail(String email) {
        return repository.findByEmail(email).orElseThrow();
    }

    @Override
    public List<Employee> getEmployeesByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Employee> getEmployeesByDepartmentName(String departmentName) {
        return repository.findByDepartmentName(departmentName);
    }

    @Override
    public List<Employee> searchEmployeesByEmail(String email) {
        return repository.searchByEmail(email);
    }
    }