/**
 * 
 */
package com.ofs.sms.ss.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author USER
 *
 */
@Entity
@Table(name = "students")
@NamedQueries({ //@NamedQuery(name = "Student.getStudentsByFee", query = "select s from Student s where s.fee > ?1"),
		@NamedQuery(name = "Student.getStudentsByFeeRange", query = "select s from Student s where s.fee > ?1 and s.fee < ?2") })
@NamedNativeQueries({
	@NamedNativeQuery(name = "Student.getStudentsByFee", query = "select * from students  where fee > :fee", resultClass = Student.class)
})
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6511624147523693810L;

	/*
	 * rollno int(11) AI PK name varchar(45) course_id int(11) fee decimal(10,0)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "rollno")
	private Long rollNumber;

	@Column
	private String name;

	@Column(name = "course_id")
	private Long courseId;

	@Column
	private Double fee;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "student")
	private StudentProfile studentProfile;
	
/*	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "student_courses", 
		joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "rollno"),
		inverseJoinColumns = @JoinColumn(name = "crs_id", referencedColumnName = "course_id")
			)
	private Set<Course> courses;*/

	/**
	 * @return the rollNumber
	 */
	public Long getRollNumber() {
		return this.rollNumber;
	}

	/**
	 * @param rollNumber the rollNumber to set
	 */
	public void setRollNumber(Long rollNumber) {
		this.rollNumber = rollNumber;
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
	 * @return the studentProfile
	 */
	public StudentProfile getStudentProfile() {
		return studentProfile;
	}

	/**
	 * @param studentProfile the studentProfile to set
	 */
	public void setStudentProfile(StudentProfile studentProfile) {
		this.studentProfile = studentProfile;
	}
	
	

	/**
	 * @param rollNumber
	 * @param name
	 * @param courseId
	 * @param fee
	 */
	public Student(Long rollNumber, String name, Double fee, Long courseId) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.courseId = courseId;
		this.fee = fee;
	}

	public Student() {}

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
	 * @return the courses
	 */
	/*public Set<Course> getCourses() {
		return courses;
	}*/

	/**
	 * @param courses the courses to set
	 */
	/*public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}*/
}
