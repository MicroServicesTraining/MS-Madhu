/**
 * 
 */
package com.ofs.sms.ss.service;

import java.util.List;

import com.ofs.sms.ss.exceptions.InvalidInputException;
import com.ofs.sms.ss.vo.StudentVO;

/**
 * @author USER
 *
 */
public interface StudentService {

	List<StudentVO> getStudentsList();

	StudentVO addStudent(StudentVO studentVO);

	StudentVO getStudentByRollNo(Long rollNumber) throws InvalidInputException;

	StudentVO modifyStudent(StudentVO studentVO);

	StudentVO removeStudent(Long rollNo);

	StudentVO getStudentByName(String name) throws InvalidInputException;

	StudentVO getStudentByCourse(Long courseId) throws InvalidInputException;

	StudentVO getStudentByFee(Double fee) throws InvalidInputException;
  
	List<StudentVO> getStudentsByFee(Double fee) throws InvalidInputException;

	List<StudentVO> getStudentsByFeeRange(Double minfee, Double maxfee) throws InvalidInputException;

}
