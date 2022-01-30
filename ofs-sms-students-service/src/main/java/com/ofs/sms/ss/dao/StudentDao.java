/**
 * 
 */
package com.ofs.sms.ss.dao;

import java.util.List;

import com.ofs.sms.ss.entities.Student;

/**
 * @author USER
 *
 */
public interface StudentDao {

	List<Student> getStudentsList();

	Student addStudent(Student student);

	Student getStudentByRollNo(Long rollNumber);

	Student modifyStudent(Student student);

	Student removeStudent(Long rollNo);

	List<Student> getStudentsByFee(Double fee);

	List<Student> getStudentsByFeeRange(Double minfee, Double maxfee);

}
