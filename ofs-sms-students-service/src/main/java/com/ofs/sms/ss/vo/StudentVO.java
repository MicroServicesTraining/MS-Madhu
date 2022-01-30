/**
 * 
 */
package com.ofs.sms.ss.vo;

import java.io.Serializable;

/**
 * @author Sekhar
 *
 */
public class StudentVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1739235036996208266L;
	
	private Long studentId;
	private String studentName;
	private Long joinedCourse;
	private Double feePaid;
	
	/**
	 * @return the studentId
	 */
	public Long getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the joinedCourse
	 */
	public Long getJoinedCourse() {
		return joinedCourse;
	}
	/**
	 * @param joinedCourse the joinedCourse to set
	 */
	public void setJoinedCourse(Long joinedCourse) {
		this.joinedCourse = joinedCourse;
	}
	/**
	 * @return the feePaid
	 */
	public Double getFeePaid() {
		return feePaid;
	}
	/**
	 * @param feePaid the feePaid to set
	 */
	public void setFeePaid(Double feePaid) {
		this.feePaid = feePaid;
	}
	
}
