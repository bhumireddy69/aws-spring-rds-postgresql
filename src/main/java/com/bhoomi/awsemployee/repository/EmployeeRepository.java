package com.bhoomi.awsemployee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bhoomi.awsemployee.entity.Employee;
/**
 * JPA for Employee table
 * 
 * @filename EmployeeRepository.java
 *
 * @author Chaitanya Bhoomireddy
 * 
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
}
