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
@RequestMapping("/")
public class StudentMgmtSecurityController {

	@GetMapping
	public String sayHello() {
		return "<h1>Welcome User</h1>"
				+ "<a href='./admins'>Admins</a><br />"
				+ "<a href='./teachers'>Teachers</a><br />"
				+ "<a href='./students'>Students</a><br />";
	}
	
}
