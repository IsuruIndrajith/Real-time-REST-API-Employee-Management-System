package com.ems_rest_api.ems_backend.service.Impl;

import com.ems_rest_api.ems_backend.dto.EmployeeDto;
import com.ems_rest_api.ems_backend.entity.Employee;
import com.ems_rest_api.ems_backend.mapper.EmployeeMapper;
import com.ems_rest_api.ems_backend.repository.EmployeeRepository;
import com.ems_rest_api.ems_backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

//this annotation tells spring container to create spring bean for EmployeeServiceImpl class

//instead of creating the constructor manually here using lumbo
@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

//    here using constructor based dependency injection
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
//        convert employeeDto into employee JP entity: storing employee into the database

        Employee savedEmployee = employeeRepository.save(employee);
//        Saving EmployeeJp entity to the data base

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
//        return saved object back to the client.SavedEmployee Jp entity into EmployeeDto
    }
}
