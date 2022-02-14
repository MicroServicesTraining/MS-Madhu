/**
 * 
 */
package com.ofs.oauth2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Lalitha
 *
 */
@RestController
@RequestMapping("/employees")
public class EmployeesController {

	@GetMapping("/")
	public ModelAndView getEmployeesList() {
		return new ModelAndView("employeespage");
	}
	
}
