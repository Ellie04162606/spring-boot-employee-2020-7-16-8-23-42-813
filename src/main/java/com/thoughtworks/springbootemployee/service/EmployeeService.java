package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees();

    Employee getEmployee(int id);

    void addEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployee(int id);
}
