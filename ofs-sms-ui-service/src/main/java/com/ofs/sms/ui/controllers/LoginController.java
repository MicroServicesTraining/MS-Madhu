/**
 * 
 */
package com.ofs.sms.ui.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Lalitha
 *
 */
@RestController
@RequestMapping("/login")
public class LoginController {
	
	@GetMapping
	public ModelAndView getLoginForm() {
		return new ModelAndView("loginpage");
	}
	
	@PostMapping("/validate")
	public ModelAndView validateLogin() {
		return new ModelAndView("/homepage");
	}
	
	
}
