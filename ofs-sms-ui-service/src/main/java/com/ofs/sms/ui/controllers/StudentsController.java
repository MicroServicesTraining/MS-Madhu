/**
 * 
 */
package com.ofs.sms.ui.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ofs.sms.ui.responses.StudentMgmtResponse;
import com.ofs.sms.ui.services.StudentsService;
import com.ofs.sms.ui.vos.StudentVO;

/**
 * @author Lalitha
 *
 */
@RestController
@RequestMapping("/public/api/v1/students")
public class StudentsController {
	
	@Autowired
	private StudentsService studentService;

	@GetMapping
	public StudentMgmtResponse<List<StudentVO>> getStudentsList(){
		return studentService.getStudentsList();
	}

	@GetMapping("/new")
	public ModelAndView getAddNewStudentPage(){
		return new ModelAndView("newstudentform");
	}
	
	@PostMapping
	public StudentMgmtResponse<StudentVO> saveStudent(HttpServletRequest request){
		return null;
	}

	
}
