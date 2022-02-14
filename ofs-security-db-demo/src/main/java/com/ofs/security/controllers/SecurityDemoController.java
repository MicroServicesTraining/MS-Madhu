/**
 * 
 */
package com.ofs.security.controllers;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Lalitha
 *
 */
@RestController
public class SecurityDemoController {
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello...!";
	}
	
	@GetMapping("/login")
	public ModelAndView doLogin() {
		return new ModelAndView("login");
	}
	
	
	@GetMapping("/admin")
	public ModelAndView sayHelloToAdmin(Model model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = "";
		if(principal instanceof User) {
			 username = ((User)principal).getUsername();
		}else {
			 username = principal.toString();
		}
		model.addAttribute("username", username);
		return new ModelAndView("adminhome");
	}
	
	@GetMapping("/user")
	public ModelAndView sayHelloToUser() {
		return new ModelAndView("userhome");
	}	
	
}