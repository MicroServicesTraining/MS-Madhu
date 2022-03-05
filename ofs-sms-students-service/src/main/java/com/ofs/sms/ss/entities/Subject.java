/**
 * 
 */
package com.ofs.sms.ss.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Lalitha
 *
 */
@Entity
@Table(name = "subjects")
public class Subject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5750217725670342971L;

	@Id
	@Column(name = "sub_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long subjectId;
	private String name;
	private Integer topicsCount;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "crs_id", referencedColumnName = "course_id")
	private Course course;

	/**
	 * @return the subjectId
	 */
	public Long getSubjectId() {
		return subjectId;
	}

	/**
	 * @param subjectId the subjectId to set
	 */
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
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
	 * @return the topicsCount
	 */
	public Integer getTopicsCount() {
		return topicsCount;
	}

	/**
	 * @param topicsCount the topicsCount to set
	 */
	public void setTopicsCount(Integer topicsCount) {
		this.topicsCount = topicsCount;
	}

	/**
	 * @return the course
	 */
	public Course getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(Course course) {
		this.course = course;
	}

	/**
	 * @param subjectId
	 * @param name
	 * @param topicsCount
	 */
	public Subject(Long subjectId, String name, Integer topicsCount) {
		this.subjectId = subjectId;
		this.name = name;
		this.topicsCount = topicsCount;
	}
	
	public Subject() {}
}
