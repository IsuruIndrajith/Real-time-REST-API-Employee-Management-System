package com.ems_rest_api.ems_backend.repository;

import com.ems_rest_api.ems_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//here 2 parameters. <Type of entity> <Type of the primary key>
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//    after this extending, this employee repository will get CRUD methods to perform CRUDE database operations on this employee JP entity
//this extended Jpa repository will inherit all the methods from all the interfaces like CRUDE operations LIST operations

//This EmployeeRepository will get CRUD methods to perform CRUD database operations on employee JPA entity
}
