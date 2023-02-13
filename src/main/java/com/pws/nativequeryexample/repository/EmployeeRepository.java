package com.pws.nativequeryexample.repository;

import com.pws.nativequeryexample.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query(value = "SELECT * FROM Employee WHERE name like = :name", nativeQuery = true)
    List<Employee> findByName(@Param("name") String name);
}
