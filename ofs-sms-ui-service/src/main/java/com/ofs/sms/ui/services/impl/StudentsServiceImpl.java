/**
 * 
 */
package com.ofs.sms.ui.services.impl;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ofs.sms.ui.responses.StudentMgmtResponse;
import com.ofs.sms.ui.services.StudentsService;
import com.ofs.sms.ui.vos.StudentProfileVO;
import com.ofs.sms.ui.vos.StudentVO;

/**
 * @author Lalitha
 *
 */
@Service
public class StudentsServiceImpl implements StudentsService{

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public StudentMgmtResponse<List<StudentVO>> getStudentsList() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<>(headers);
		StudentMgmtResponse<List<StudentVO>> response = restTemplate.exchange("http://localhost:8081/sms/api/v1/students", HttpMethod.GET, entity, StudentMgmtResponse.class).getBody();
		return response;
	}

	@Override
	public StudentMgmtResponse<StudentVO> saveStudent(HttpServletRequest request) {
		StudentVO studentVO = convertHttpRequestToStudentVO(request);
		/*HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<StudentVO> entity = new HttpEntity<>(studentVO, headers);
		
		StudentMgmtResponse<StudentVO> response = restTemplate.exchange("http://localhost:8081/sms/api/v1/students", HttpMethod.POST, entity, StudentMgmtResponse.class).getBody();
		*/
		//StudentMgmtResponse<StudentVO> response = restTemplate.postForEntity("http://localhost:8081/sms/api/v1/students", studentVO, StudentMgmtResponse.class).getBody();
		StudentMgmtResponse<StudentVO> response = restTemplate.postForObject("http://localhost:8081/sms/api/v1/students", studentVO, StudentMgmtResponse.class);
		return response;
	}

	private StudentVO convertHttpRequestToStudentVO(HttpServletRequest request) {
		StudentVO studentVO = new StudentVO();
		StudentProfileVO studentProfileVO = new StudentProfileVO();
		studentVO.setStudentName(request.getParameter("studentName"));
		studentVO.setFeePaid(Double.parseDouble(request.getParameter("feePaid")));
		studentVO.setJoinedCourse(Long.parseLong(request.getParameter("courseId")));
		studentProfileVO.setGender(request.getParameter("gender"));
		studentProfileVO.setPhoneNumber(request.getParameter("phoneNumber"));
		studentProfileVO.setDateOfBirth(new Date(request.getParameter("dateOfBirth")));
		studentProfileVO.setAddress1(request.getParameter("address1"));
		studentProfileVO.setAddress1(request.getParameter("address2"));
		studentProfileVO.setCity(request.getParameter("city"));
		studentProfileVO.setState(request.getParameter("state"));
		studentProfileVO.setZipCode(request.getParameter("zipCode"));
		studentVO.setStudentProfile(studentProfileVO);		
		return studentVO;
	}

	
	
}
