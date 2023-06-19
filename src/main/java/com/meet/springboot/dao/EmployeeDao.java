package com.meet.springboot.dao;

import java.util.List;

import com.meet.springboot.vo.EmployeeVo;

public interface EmployeeDao {

	EmployeeVo addEmployee(EmployeeVo employeevo);

	List<EmployeeVo> getAllEmployees();

	EmployeeVo getEmployeeById(int id);

	EmployeeVo updateEmployee(EmployeeVo employeevo);

	int deleteEmployeeById(int id);

}
