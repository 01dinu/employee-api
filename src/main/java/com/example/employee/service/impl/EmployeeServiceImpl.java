package com.example.employee.service.impl;

import com.example.employee.controller.request.EmployeeRequest;
import com.example.employee.controller.response.EmployeeResponse;
import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;
import com.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void create(EmployeeRequest employeeRequest) {

        System.out.println(employeeRequest.getName());

        Employee employee = new Employee();

        employee.setName(employeeRequest.getName());

        employeeRepository.createEmployee(employee);

    }

    @Override
    public List<Employee> findAll() {


        return employeeRepository.findAll();
    }
}
