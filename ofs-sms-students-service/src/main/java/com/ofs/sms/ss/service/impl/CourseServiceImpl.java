/**
 * 
 */
package com.ofs.sms.ss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofs.sms.ss.dao.CourseDao;
import com.ofs.sms.ss.entities.Course;
import com.ofs.sms.ss.service.CourseService;

/**
 * @author Lalitha
 *
 */
@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;

	/* (non-Javadoc)
	 * @see com.ofs.sms.ss.service.CourseService#getAllCourses()
	 */
	@Override
	public List<Course> getAllCourses() {
		return courseDao.getAllCourses();
	}

	@Override
	public Course saveCourse(Course course) {
		return courseDao.saveCourse(course);
	}

}
