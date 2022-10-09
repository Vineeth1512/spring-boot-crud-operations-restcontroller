package com.example.service;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);

	List<Employee> getAllEmployees();

	Employee updateEmployee(Employee employee);

	void deleteById(int id);

}
