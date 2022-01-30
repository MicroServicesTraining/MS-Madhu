/**
 * 
 */
package com.ofs.sms.ss.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ofs.sms.ss.entities.Student;
import com.ofs.sms.ss.exceptions.InvalidInputException;
import com.ofs.sms.ss.responses.StudentMgmtResponse;
import com.ofs.sms.ss.service.StudentService;
import com.ofs.sms.ss.vo.StudentVO;

/**
 * @author USER
 *
 */
@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@GetMapping
	public StudentMgmtResponse<List<StudentVO>> getStudentsList() {
		List<StudentVO> studentVOs = studentService.getStudentsList();
		if(CollectionUtils.isEmpty(studentVOs)) {
			return new StudentMgmtResponse<List<StudentVO>>("No Student records found", HttpStatus.NO_CONTENT.value(), studentVOs);
		}else {
			return new StudentMgmtResponse<List<StudentVO>>("Student records found", HttpStatus.OK.value(), studentVOs);
		}
	}
	
	@GetMapping("/rollNo/{rollNo}")
	public StudentMgmtResponse<StudentVO> getStudentByRollNo(@PathVariable(name = "rollNo") Long rollNumber) throws InvalidInputException {
		StudentVO studentVO = studentService.getStudentByRollNo(rollNumber);
		StudentMgmtResponse<StudentVO> response = null;
		if(studentVO != null) {
			response = new StudentMgmtResponse<StudentVO>(null, null, studentVO);
		}else {
			response = new StudentMgmtResponse<StudentVO>("No Student found with given Roll Number", HttpStatus.NOT_FOUND.value(), studentVO);
		}
		return response;
	}
	
	@PostMapping
	public StudentMgmtResponse<StudentVO> addStudent(@RequestBody StudentVO studentVO) {
		StudentVO st = studentService.addStudent(studentVO);		
		if (st != null) {
			StudentMgmtResponse<StudentVO> response = new StudentMgmtResponse<>("Student Added Successfully", HttpStatus.CREATED.value(), st);
			return response;
		}else {
			StudentMgmtResponse<StudentVO> response = new StudentMgmtResponse<StudentVO>("Adding Student Failed", HttpStatus.INTERNAL_SERVER_ERROR.value(),null);
			return response;
		}
	}
	
	@PutMapping
	public StudentMgmtResponse<StudentVO> modifyStudent(@RequestBody StudentVO studentVO) {
		StudentVO st =  studentService.modifyStudent(studentVO);
		if (st != null) {
			StudentMgmtResponse<StudentVO> response = new StudentMgmtResponse<>("Student Modified Successfully", HttpStatus.OK.value(), st);
			return response;
		}else {
			StudentMgmtResponse<StudentVO> response = new StudentMgmtResponse<StudentVO>("Modify Student Failed", HttpStatus.INTERNAL_SERVER_ERROR.value(),null);
			return response;
		}
	}
	
	@DeleteMapping("/rollNo/{rollNo}")
	public StudentMgmtResponse<StudentVO> removeStudent(@PathVariable Long rollNo) {
		StudentVO st = studentService.removeStudent(rollNo);
		if (st != null) {
			StudentMgmtResponse<StudentVO> response = new StudentMgmtResponse<>("Student Removed Successfully", HttpStatus.OK.value(), st);
			return response;
		}else {
			StudentMgmtResponse<StudentVO> response = new StudentMgmtResponse<StudentVO>("Removing Student Failed", HttpStatus.INTERNAL_SERVER_ERROR.value(),null);
			return response;
		}
	}
	
	
}
