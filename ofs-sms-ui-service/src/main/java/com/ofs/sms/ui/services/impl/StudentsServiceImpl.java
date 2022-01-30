/**
 * 
 */
package com.ofs.sms.ui.services.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ofs.sms.ui.responses.StudentMgmtResponse;
import com.ofs.sms.ui.services.StudentsService;
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

	
	
}
