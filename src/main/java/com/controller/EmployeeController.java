package com.controller;

import com.EmployeeRepository;
import com.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://192.168.178.50:4200")
@RequestMapping("api")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    //GetAllEmployees
    @GetMapping("/employee")
    public List<Employee> getAllEmployees(){
        return  employeeRepository.findAll();
    }


}
