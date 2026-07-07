package com.cognizant.employeemanagementsystem.service;

import java.util.List;
import com.cognizant.employeemanagementsystem.entity.Department;

public interface DepartmentService {

    Department saveDepartment(Department department);

    List<Department> getAllDepartments();

    Department getDepartmentById(Long id);

    Department updateDepartment(Long id, Department department);

    void deleteDepartment(Long id);

}