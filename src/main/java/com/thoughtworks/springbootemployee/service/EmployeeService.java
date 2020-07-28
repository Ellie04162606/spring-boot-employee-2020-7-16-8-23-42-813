package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> getEmployees();

    Employee getEmployee(int id);

    void addEmployee(Employee employee);

    void updateEmployee(int id, Employee employee);

    void deleteEmployee(int id);
}
