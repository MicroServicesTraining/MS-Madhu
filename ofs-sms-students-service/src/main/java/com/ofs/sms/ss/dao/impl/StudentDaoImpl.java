/**
 * 
 */
package com.ofs.sms.ss.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ofs.sms.ss.dao.StudentDao;
import com.ofs.sms.ss.entities.Student;
import com.ofs.sms.ss.repositories.StudentRepository;

/**
 * @author USER
 *
 */
@Component
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getStudentsList() {
		return studentRepository.findAll();
	}

	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentByRollNo(Long rollNumber) {
		Optional<Student> result = studentRepository.findById(rollNumber);
		if(result.isPresent()) {
			return result.get();
		}else {
			return null;
		}		
	}

	@Override
	public Student modifyStudent(Student student) {
		Optional<Student> result = studentRepository.findById(student.getRollNumber());
		if(result.isPresent()) {
			Student st = studentRepository.save(student);	
			return st;
		}else {
			return null;
		}
	}

	@Override
	public Student removeStudent(Long rollNo) {
		Optional<Student> result = studentRepository.findById(rollNo);
		Student st = null;
		if(result.isPresent()) {
			st = result.get();
			studentRepository.deleteById(rollNo);
			return st;
		}else {
			return null;
		}
	}

	@Override
	public Student getStudentByName(String name) {
		Optional<Student> result = studentRepository.findByName(name);//select * from student where name = 'Ravi';
		if(result.isPresent()) {
			return result.get();
		}else {
			return null;
		}	
	}

	@Override
	public Student getStudentByCourse(Long courseId) {
		Optional<Student> result = studentRepository.findByCourseId(courseId); //select * from student where course_id = 1;
		}
	}

	@Override
	public List<Student> getStudentsByFeeRange(Double minfee, Double maxfee) {
		Optional<List<Student>> result = studentRepository.getStudentsByFeeRange(minfee, maxfee);
		if(result.isPresent()) {
			return result.get();
		}else {
			return null;
		}	
	}
	
	@Override
	public Student getStudentByFee(Double fee) {
		Optional<Student> result = studentRepository.findByFee(fee); //select * from student where fee = 9000;
		if(result.isPresent()) {
			return result.get();
		}else {
			return null;
		}	
		}
	}

}
