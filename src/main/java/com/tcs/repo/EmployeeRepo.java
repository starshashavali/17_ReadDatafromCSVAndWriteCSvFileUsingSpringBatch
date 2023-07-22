package com.tcs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.entity.Employee;

public interface EmployeeRepo  extends JpaRepository<Employee, Integer> {

} 
