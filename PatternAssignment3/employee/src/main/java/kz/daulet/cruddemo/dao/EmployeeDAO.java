package kz.daulet.cruddemo.dao;

import kz.daulet.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
