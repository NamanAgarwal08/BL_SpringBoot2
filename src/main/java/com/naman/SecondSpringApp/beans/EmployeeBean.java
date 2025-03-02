package com.naman.SecondSpringApp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private String name = "Naman Agarwal";
    private int id = 2115000644;

    @Autowired
    private DepartmentBean department;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDepartmentName() {
        return department.getDeptName();
    }
}