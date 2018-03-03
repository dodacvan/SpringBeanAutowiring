package com.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.model.Employee;

public class EmployeeAutowiredByTypeService {
    // Autowired annotation on variable/setters is equivalent to
    // autowire="byType"
    @Autowired
    private Employee employee;

    @Autowired
    public void setEmployee(Employee emp) {
        this.employee = emp;
    }

    public Employee getEmployee() {
        return this.employee;
    }
    
    /*Note that I have annotated both Employee variable and 
    it’s setter method with Spring @Autowired annotation, 
    however only one of these is sufficient for spring bean autowiring.*/
}
