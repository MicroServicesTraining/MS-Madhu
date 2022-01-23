/**
 * 
 */
package com.ofs.sms.ss.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author USER
 *
 */
@Entity
@Table(name = "students")
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6511624147523693810L;

	/*
	 * rollno int(11) AI PK 
		name varchar(45) 
		course_id int(11) 
		fee decimal(10,0)
	 * */
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
	//some committ
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
	
	
}
