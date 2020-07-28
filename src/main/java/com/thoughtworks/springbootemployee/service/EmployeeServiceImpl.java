package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> employees = new ArrayList<>();

    @Override
    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public Employee getEmployee(int id) {
        return employees.stream().filter(e -> id == e.getId()).findFirst().orElse(null);
    }

    @Override
    public void addEmployee(Employee employee) {
        Employee employeeInDatabase = employees.stream().findFirst().orElse(null);
        if (employeeInDatabase == null)
            employees.add(employee);
    }

    @Override
    public void updateEmployee(int id, Employee employee) {
        Employee employeeInDatabase = employees.stream().findFirst().orElse(null);

        if (employeeInDatabase != null) {
            employeeInDatabase.setName(employee.getName());
            employeeInDatabase.setAge(employee.getAge());
            employeeInDatabase.setGender(employee.getGender());
        }
        //TODO 异常抛出
    }

    @Override
    public void deleteEmployee(int id) {
        Employee employeeInDatabase = employees.stream().findFirst().orElse(null);
        if (employeeInDatabase != null) {
            employees.remove(employeeInDatabase);
        }
        //Todo 异常抛出
    }
}
