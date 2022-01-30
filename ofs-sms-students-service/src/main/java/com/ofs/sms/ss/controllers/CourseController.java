/**
 * 
 */
package com.ofs.sms.ss.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ofs.sms.ss.entities.Course;
import com.ofs.sms.ss.responses.StudentMgmtResponse;
import com.ofs.sms.ss.service.CourseService;

/**
 * @author Lalitha
 *
 */

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping
	public StudentMgmtResponse<List<Course>> getAllCourses(){
		List<Course> courses =  courseService.getAllCourses();
		return new StudentMgmtResponse<List<Course>>("Courses found", 200, courses);
	}
	
	@PostMapping
	public Course saveCourse(Course course) {
		return courseService.saveCourse(course);
	}
}
