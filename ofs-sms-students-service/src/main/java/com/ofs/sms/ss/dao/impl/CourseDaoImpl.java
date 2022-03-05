/**
 * 
 */
package com.ofs.sms.ss.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ofs.sms.ss.dao.CourseDao;
import com.ofs.sms.ss.entities.Course;
import com.ofs.sms.ss.repositories.CourseRepository;

/**
 * @author Lalitha
 *
 */
@Component
public class CourseDaoImpl implements CourseDao {
	
	@Autowired
	private CourseRepository courseRepository;

	/* (non-Javadoc)
	 * @see com.ofs.sms.ss.dao.CourseDao#getAllCourses()
	 */
	@Override
	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}

	@Override
	public Course saveCourse(Course course) {
		return courseRepository.save(course);
	}

}
