package com.codeclan.example.relationshipsLab;

import com.codeclan.example.relationshipsLab.behaviours.DepartmentRepository;
import com.codeclan.example.relationshipsLab.behaviours.EmployeeRepository;
import com.codeclan.example.relationshipsLab.models.Department;
import com.codeclan.example.relationshipsLab.models.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RelationshipsLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployee() {
		Department department = new Department("ITCrowd");
		departmentRepository.save(department);
		Employee employee = new Employee("Steve", "Gossip", 4567, department);
		employeeRepository.save(employee);

	}

}
