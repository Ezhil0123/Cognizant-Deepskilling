package com.cognizant.employeemanagementsystem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cognizant.employeemanagementsystem.entity.Employee;
import com.cognizant.employeemanagementsystem.projection.EmployeeDTO;
import com.cognizant.employeemanagementsystem.projection.EmployeeView;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Derived Query Methods

    Optional<Employee> findByEmail(String email);

    List<Employee> findByName(String name);

    List<Employee> findByNameContaining(String keyword);

    List<Employee> findByDepartmentId(Long departmentId);

    List<Employee> findByDepartmentName(String departmentName);

    // JPQL Query

    @Query("SELECT e FROM Employee e WHERE e.email LIKE %:email%")
    List<Employee> searchByEmail(@Param("email") String email);

    // Native SQL Query

    @Query(value = "SELECT * FROM employees WHERE name = :name", nativeQuery = true)
    List<Employee> findEmployeeByName(@Param("name") String name);

    // Interface Projection

    List<EmployeeView> findAllProjectedBy();


    // Class Projection

    @Query("SELECT new com.cognizant.employeemanagementsystem.projection.EmployeeDTO(e.name,e.email) FROM Employee e")
    List<EmployeeDTO> getEmployeeDTO();

}