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
@RequestMapping("/admins")
public class StudentMgmtAdminController {
	@GetMapping
	public String getAdminHome() {
		return "<h1>Welcome Admin</h1>"
				+ "<a href='./admins'>Admins</a><br />"
				+ "<a href='./teachers'>Teachers</a><br />"
				+ "<a href='./students'>Students</a><br />";
	}
}
