package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/getEmp")
	public Employee saveEmp(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);

	}

	@GetMapping("/emp")
	public List<Employee> getAllEmps() {

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
