/**
 * 
 */
package com.ofs.sms.ss.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.ofs.sms.ss.responses.StudentMgmtResponse;

/**
 * @author USER
 *
 */
@ControllerAdvice
public class StudentMgmtExceptionHandler {

	@ExceptionHandler(InvalidInputException.class)
	public ResponseEntity<StudentMgmtResponse<String>> invalidInputExceptionHandler(InvalidInputException iie){
		StudentMgmtResponse<String> response = new StudentMgmtResponse<String>(iie.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value(), null);
		return new ResponseEntity<StudentMgmtResponse<String>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<StudentMgmtResponse<String>> genericExceptionHandler(Exception e, WebRequest request){
		StudentMgmtResponse<String> response = new StudentMgmtResponse<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value(), null);
		return new ResponseEntity<StudentMgmtResponse<String>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
