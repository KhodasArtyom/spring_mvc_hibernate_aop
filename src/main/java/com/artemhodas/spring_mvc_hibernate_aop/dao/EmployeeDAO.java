package com.artemhodas.spring_mvc_hibernate_aop.dao;

import com.artemhodas.spring_mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAllEmployees();
}
