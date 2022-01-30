/**
 * 
 */
package com.ofs.sms.ss.dao;

import java.util.List;

import com.ofs.sms.ss.entities.Course;

/**
 * @author Lalitha
 *
 */
public interface CourseDao {

	List<Course> getAllCourses();

	Course saveCourse(Course course);

}
