package com.codeclan.example.relationshipsLab.behaviours;

import com.codeclan.example.relationshipsLab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
