package kz.daulet.cruddemo.service;

import kz.daulet.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
