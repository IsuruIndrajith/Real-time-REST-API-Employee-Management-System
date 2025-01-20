package com.ems_rest_api.ems_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//this class is to transfer data between client and the server
@Getter
@Setter
//these annotations are to create Getter and Setter methods for the instance variables
@NoArgsConstructor
@AllArgsConstructor
//the above annotations are to create constructors for this class
public class EmployeeDto {
//    this class is to transfer the data between client and the server. we can use this as a response for the RESt API
//    instance variables for this class
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}

//Mapper class to map Employee dto to Employee entity
