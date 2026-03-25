package com.example.employee.service;

import com.example.employee.controller.request.EmployeeRequest;
import com.example.employee.controller.response.EmployeeResponse;
import com.example.employee.model.Employee;

import java.util.List;

public interface EmployeeService {

    void create(EmployeeRequest employeeRequest);

     List<Employee> findAll();

}

//test for git
