package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.model.LazyLoadingBean;
import com.example.service.EmployeeService;
import com.example.service.TestBean;

@RestController
public class EmployeeController {
	/*
	 * // @Value annotation is used to access the properties which is defined in
	 * application properties
	 * 
	 * @Value("${server.port}") public String serverPort;
	 * 
	 * @GetMapping("/get") public void getServer() {
	 * System.out.println("this is my server port" + serverPort); }
	 */
	@Autowired
	// @Qualifier("employeeServiceImplv2")
	private EmployeeService employeeService;

	@Autowired
	private TestBean bean;

	@Autowired
	private LazyLoadingBean lazyLoadingBean;

	@Value("${spring.name}")
	private String name;

	@PostMapping("/getEmp")
	public Employee saveEmp(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);

	}

	@GetMapping("/emp")
	public List<Employee> getAllEmps() {
		bean.method();
		System.out.println(" My name is " + name);

		return employeeService.getAllEmployees();
	}

	@PutMapping("/emps")
	public Employee update(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}

	@DeleteMapping("emp/{id}")
	public String deleteById(@PathVariable("id") int id) {
		employeeService.deleteById(id);
		return "Row Deleted";
	}

}
