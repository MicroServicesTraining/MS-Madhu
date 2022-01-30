/**
 * 
 */
package com.ofs.sms.ui.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
