package com.employeedirectory.directory.dao;

import java.util.List;

import com.employeedirectory.directory.modal.Employee;

public interface EmployeeDAO {

    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);
}
