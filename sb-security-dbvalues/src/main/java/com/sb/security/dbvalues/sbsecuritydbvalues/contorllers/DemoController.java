/**
 * 
 */
package com.sb.security.dbvalues.sbsecuritydbvalues.contorllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author dorak
 *
 */
@RestController
public class DemoController {
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello...!";
	}
	
	@GetMapping("/login")
	public ModelAndView doLogin() {
		return new ModelAndView("login");
	}
	
	@GetMapping("/admin")
	public ModelAndView sayHelloToAdmin() {
		return new ModelAndView("admin");
	}
	
	@GetMapping("/user")
	public ModelAndView sayHelloToUser() {
		return new ModelAndView("user");
	}
}
