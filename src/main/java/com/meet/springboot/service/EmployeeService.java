package com.meet.springboot.service;

import java.util.List;

import com.meet.springboot.bo.EmployeeBo;

public interface EmployeeService {

	EmployeeBo addEmployee(EmployeeBo employee);

	List<EmployeeBo> getAllEmployees();

	EmployeeBo getEmployeeById(int id);

	EmployeeBo updateEmployee(EmployeeBo employee);

	int deleteEmployeeById(int id);

}
