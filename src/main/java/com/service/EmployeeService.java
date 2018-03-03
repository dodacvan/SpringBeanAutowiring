package com.service;

import com.model.Employee;

public class EmployeeService {
    private Employee employee;

    // cai nay de autowire by constructor - cau hinh them trong file xml
    public EmployeeService(Employee emp) {
        System.out.println("Autowiring by constructor used");
        this.employee = emp;
    }

    // default constructor to avoid BeanInstantiationException for autowire
    // byName or byType
    public EmployeeService() {
        System.out.println("Default Constructor used");
    }

    // used for autowire byName and byType
    // When we use spring autowire byName or byType, default constructor is used. 
    // That’s why we have explicitly defined the default constructor for the EmployeeService bean.
    public void setEmployee(Employee emp) {
        this.employee = emp;
    }

    public Employee getEmployee() {
        return this.employee;
    }
}
