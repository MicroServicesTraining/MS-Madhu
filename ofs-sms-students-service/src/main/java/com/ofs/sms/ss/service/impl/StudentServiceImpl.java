/**
 * 
 */
package com.ofs.sms.ss.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.ofs.sms.ss.dao.StudentDao;
import com.ofs.sms.ss.entities.Student;
import com.ofs.sms.ss.entities.StudentProfile;
import com.ofs.sms.ss.exceptions.InvalidInputException;
import com.ofs.sms.ss.service.StudentService;
import com.ofs.sms.ss.vo.StudentProfileVO;
import com.ofs.sms.ss.vo.StudentVO;

/**
 * @author USER
 *
 */
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;

	@Override
	public List<StudentVO> getStudentsList() {
		List<Student> studentsList = studentDao.getStudentsList();
		
		if(CollectionUtils.isEmpty(studentsList)) {
			return null;
		}else {
			List<StudentVO> studentVOs = new ArrayList<StudentVO>();
			for(Student student : studentsList) {
				StudentVO studentVO = convertEntityToVO(student);
				studentVOs.add(studentVO);
			}
			return studentVOs;
		}
		
	}

	@Override
	public StudentVO addStudent(StudentVO studentVO) {
		Student student = convertVOToEntity(studentVO);
		Student st = studentDao.addStudent(student);
		StudentVO resultStudentVO = convertEntityToVO(st);
		return resultStudentVO;
	}

	private Student convertVOToEntity(StudentVO studentVO) {
		Student student = null;
		if(studentVO != null) {
			student = new Student();
			student.setRollNumber(studentVO.getStudentId()!= null ? studentVO.getStudentId() : null);
			//student.setRollNumber(Optional.ofNullable(studentVO.getStudentId()).orElseThrow(null));
			student.setName(studentVO.getStudentName());
			student.setCourseId(studentVO.getJoinedCourse());
			student.setFee(studentVO.getFeePaid());
			//student.setCourses(studentVO.getCourses());
			StudentProfile studentProfile = convertProfileVOToProfileEntity(studentVO.getStudentProfile());
			student.setStudentProfile(studentProfile);
			studentProfile.setStudent(student);
		}
		return student;
	}

	private StudentProfile convertProfileVOToProfileEntity(StudentProfileVO studentProfileVO) {
		StudentProfile studentProfile = null;
		if(studentProfileVO != null) {
			studentProfile = new StudentProfile();
			studentProfile.setGender(studentProfileVO.getGender());
			studentProfile.setPhoneNumber(studentProfileVO.getPhoneNumber());
			studentProfile.setDateOfBirth(studentProfileVO.getDateOfBirth());
			studentProfile.setAddress1(studentProfileVO.getAddress1());
			studentProfile.setAddress1(studentProfileVO.getAddress2());
			studentProfile.setCity(studentProfileVO.getCity());
			studentProfile.setState(studentProfileVO.getState());
			studentProfile.setZipCode(studentProfileVO.getZipCode());
		}
		return studentProfile;
	}

	private StudentVO convertEntityToVO(Student student) {
		StudentVO studentVO = null;
		if(student != null) {
			studentVO = new StudentVO();
			studentVO.setStudentId(student.getRollNumber());
			studentVO.setStudentName(student.getName());
			studentVO.setJoinedCourse(student.getCourseId());
			studentVO.setFeePaid(student.getFee());
			//studentVO.setCourses(student.getCourses());
			studentVO.setStudentProfile(convertProfileEntityToProfileVo(student.getStudentProfile()));
		}
		return studentVO;
	}
	

	private StudentProfileVO convertProfileEntityToProfileVo(StudentProfile studentProfile) {
		StudentProfileVO studentProfileVO = null;
		if(studentProfile != null) {
			studentProfileVO = new StudentProfileVO();
			studentProfileVO.setGender(studentProfile.getGender());
			studentProfileVO.setPhoneNumber(studentProfile.getPhoneNumber());
			studentProfileVO.setDateOfBirth(studentProfile.getDateOfBirth());
			studentProfileVO.setAddress1(studentProfile.getAddress1());
			studentProfileVO.setAddress2(studentProfile.getAddress2());
			studentProfileVO.setCity(studentProfile.getCity());
			studentProfileVO.setState(studentProfile.getState());
			studentProfileVO.setZipCode(studentProfile.getZipCode());
		}
		return studentProfileVO;
	}

	@Override
	public StudentVO getStudentByRollNo(Long rollNumber) throws InvalidInputException {

		if(rollNumber <= 0) {
			throw new InvalidInputException("Entered Rollnumber can not be negative value or zero");
		}
		Student student = studentDao.getStudentByRollNo(rollNumber);
		return convertEntityToVO(student);
	}

	@Override
	public StudentVO modifyStudent(StudentVO studentVO) {
		Student student = convertVOToEntity(studentVO);
		student =  studentDao.modifyStudent(student);
		return convertEntityToVO(student);
	}

	@Override
	public StudentVO removeStudent(Long rollNo) {
		Student student = studentDao.removeStudent(rollNo);
		return convertEntityToVO(student);
	}

	@Override
	public List<StudentVO> getStudentsByFee(Double fee) throws InvalidInputException {
		if(fee <= 0) {
			throw new InvalidInputException("Entered fee can not be negative value or zero");
		}
		List<Student> studentsList = studentDao.getStudentsByFee(fee);
		
		if(CollectionUtils.isEmpty(studentsList)) {
			return null;
		}else {
			List<StudentVO> studentVOs = new ArrayList<StudentVO>();
			for(Student student : studentsList) {
				StudentVO studentVO = convertEntityToVO(student);
				studentVOs.add(studentVO);
			}
			return studentVOs;
		}
	}

	@Override
	public List<StudentVO> getStudentsByFeeRange(Double minfee, Double maxfee) throws InvalidInputException {
		if(minfee <= 0 || maxfee <= 0) {
			throw new InvalidInputException("Entered fee can not be negative value or zero");
		}
		List<Student> studentsList = studentDao.getStudentsByFeeRange(minfee, maxfee);
		
		if(CollectionUtils.isEmpty(studentsList)) {
			return null;
		}else {
			List<StudentVO> studentVOs = new ArrayList<StudentVO>();
			for(Student student : studentsList) {
				StudentVO studentVO = convertEntityToVO(student);
				studentVOs.add(studentVO);
			}
			return studentVOs;
		}
	}

}
