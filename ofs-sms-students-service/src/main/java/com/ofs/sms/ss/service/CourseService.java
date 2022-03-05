/**
 * 
 */
package com.ofs.sms.ss.service;

import java.util.List;

import com.ofs.sms.ss.entities.Course;

/**
 * @author Lalitha
 *
 */
public interface CourseService {

	List<Course> getAllCourses();

	Course saveCourse(Course course);

}
