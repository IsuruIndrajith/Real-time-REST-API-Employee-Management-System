//configuring the springboot application for the postgre sql database
package com.ems_rest_api.ems_backend.entity;

//data base connecting of the JP entity
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Creating the instance variables
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
//the above annotation is to include the class as a JP entity
@Table(name="employees")
public class Employee {

//    to make the primary keys
    @Id
//    to configure the primary key generation strategy
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    IDENTITY primary key feature is for database auto increment feature to automatically increment the primary key
    private Long id;

//    @Column anontation to map a database table column with a class field

    @Column(name = "first_name")  //now this column name will map to the first name field
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_id", nullable = false, unique = true)
//    making the email column not null and unique
    private String email;

}
