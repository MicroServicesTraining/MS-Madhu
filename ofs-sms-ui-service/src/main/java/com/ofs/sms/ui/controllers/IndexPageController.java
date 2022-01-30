/**
 * 
 */
package com.ofs.sms.ui.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Lalitha
 *
 */
@RestController
public class IndexPageController {

	@GetMapping({"/", "/index"})
	public ModelAndView getIndexPage() {
		return new ModelAndView("index");
	}
	
}
