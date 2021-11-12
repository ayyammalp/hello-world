package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Employee;

public interface IEmployeeInfo extends JpaRepository<Employee, Long> {
public List<Employee> getAllEmployee();
public Employee getEmployeebyId(String employeeId);

}
