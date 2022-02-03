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
@RequestMapping("/security")
public class StudentMgmtSecurityController {

	@GetMapping
	public String sayHello() {
		return "<h1>Welcome User</h1>";
	}
	
}
