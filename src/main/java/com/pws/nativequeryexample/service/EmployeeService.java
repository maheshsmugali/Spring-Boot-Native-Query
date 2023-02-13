package com.pws.nativequeryexample.service;

import com.pws.nativequeryexample.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findByName(String name);
}
