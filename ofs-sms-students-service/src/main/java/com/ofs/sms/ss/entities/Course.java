/**
 * 
 */
package com.ofs.sms.ss.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Lalitha
 *
 */

@Entity
@Table(name = "courses")
public class Course implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3928691744873417347L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "course_id")
	private Long courseId;
	
	private String name;
	private Double fee;
	private Integer duration;
	
	@OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
	private Set<Subject> subjects;
	
	/*@ManyToMany(mappedBy = "courses")
	private Set<Student> students = new HashSet<>();*/
	
	
	/**
	 * @param courseId
	 * @param name
	 * @param fee
	 * @param duration
	 */
	public Course(Long courseId, String name, Double fee, Integer duration) {
		this.courseId = courseId;
		this.name = name;
		this.fee = fee;
		this.duration = duration;
	}
	
	public Course() {}

	/**
	 * @return the courseId
	 */
	public Long getCourseId() {
		return courseId;
	}

	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the fee
	 */
	public Double getFee() {
		return fee;
	}

	/**
	 * @param fee the fee to set
	 */
	public void setFee(Double fee) {
		this.fee = fee;
	}

	/**
	 * @return the duration
	 */
	public Integer getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	/**
	 * @return the subjects
	 */
	public Set<Subject> getSubjects() {
		return subjects;
	}

	/**
	 * @param subjects the subjects to set
	 */
	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}

	/**
	 * @return the students
	 */
	/*public Set<Student> getStudents() {
		return students;
	}*/

	/**
	 * @param students the students to set
	 */
	/*public void setStudents(Set<Student> students) {
		this.students = students;
	}*/
	
}
