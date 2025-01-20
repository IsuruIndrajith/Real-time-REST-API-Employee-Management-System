package com.ems_rest_api.ems_backend.mapper;
import com.ems_rest_api.ems_backend.dto.EmployeeDto;
import com.ems_rest_api.ems_backend.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
//getting all the values from the employee JPA entity and set those values to the employee Dto
//Employee JPA entity ---> Employee Dto
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
