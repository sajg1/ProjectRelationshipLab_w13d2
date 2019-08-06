package com.codeclan.example.relationshipsLab;

import com.codeclan.example.relationshipsLab.behaviours.EmployeeRepository;
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

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployee() {
		Employee employee = new Employee("Steve", "Gossip");
		employeeRepository.save(employee);

	}

}
