/**
 * 
 */
package com.ofs.oauth2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ofs.oauth2.entities.Employee;

/**
 * @author Lalitha
 *
 */
@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@RequestMapping(value="/all", method= {RequestMethod.GET}, produces = "application/json")
	@ResponseBody
	public List<Employee> getEmployeesList(){
		List<Employee> employeesList = new ArrayList<>();
		Employee emp1 = new Employee();
		emp1.setId(1001L);
		emp1.setName("Ramesh");
		emp1.setSalary(1800000.00);
		Employee emp2 = new Employee();
		emp2.setId(1002L);
		emp2.setName("Sharath");
		emp2.setSalary(1500000.00);
		employeesList.add(emp1);
		employeesList.add(emp2);
		return employeesList;
	}
	
}
