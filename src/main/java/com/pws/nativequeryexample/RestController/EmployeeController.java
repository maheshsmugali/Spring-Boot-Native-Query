package com.pws.nativequeryexample.RestController;

import com.pws.nativequeryexample.entity.Employee;
import com.pws.nativequeryexample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getEmployeesByName(@RequestParam(value = "name") String name) {
        List<Employee> employees = employeeService.findByName(name);
        return ResponseEntity.ok(employees);
    }
}
