package com.codeclan.labemployeetracking.EmployeeTracking;

import com.codeclan.labemployeetracking.EmployeeTracking.models.Employee;
import com.codeclan.labemployeetracking.EmployeeTracking.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTrackingApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void makeNewEmployee() {
		Employee paul = new Employee("Paul", 32, 1, "dog@dogging.com");
		employeeRepository.save(paul);
	}

}

