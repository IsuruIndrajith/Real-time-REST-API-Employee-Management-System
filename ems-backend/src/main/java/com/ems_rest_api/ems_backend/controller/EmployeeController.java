package com.ems_rest_api.ems_backend.controller;

import com.ems_rest_api.ems_backend.dto.EmployeeDto;
import com.ems_rest_api.ems_backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor //auto creation of constructor
@RestController //that means this class is capable to handle the http requests
@RequestMapping("/api/employees") //To define the base URL for all the rest APIs that we are going to build within this controller
public class EmployeeController {

    // Inject the dependencies
    private final EmployeeService employeeService;

    // Build Add Employee REST API. Create a method and make it annotated with annotations
    @PostMapping // to map incoming HTTP POST requests to this method
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
}