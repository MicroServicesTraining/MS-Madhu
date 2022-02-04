/**
 * 
 */
package com.ofs.sms.sec.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lalitha
 *
 */
@RestController
@RequestMapping("/students")
public class StudentMgmtStudentController {
	@GetMapping
	public String getStudentHome() {
		return "<h1>Welcome Student</h>";
	}
}
