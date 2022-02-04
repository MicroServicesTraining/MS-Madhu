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
@RequestMapping("/teachers")
public class StudentMgmtTeacherController {
	@GetMapping
	public String getTeacherHome() {
		return "<h1>Welcome Teacher</h>";
	}
}
