package com.codeclan.example.relationshipsLab.behaviours;

import com.codeclan.example.relationshipsLab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
