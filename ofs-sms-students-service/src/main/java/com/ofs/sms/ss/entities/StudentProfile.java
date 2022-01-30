/**
 * 
 */
package com.ofs.sms.ss.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Lalitha
 *
 */
@Entity
@Table(name = "student_profiles")
public class StudentProfile implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7625351765824590705L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stu_profile_id")
	private Long profileId;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "gender")
	private String gender;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "birth_date")
	private Date dateOfBirth;
	
	@Column(name = "addr1")
	private String address1;
	
	@Column(name = "addr2")
	private String address2;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "zip")
	private String zipCode;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "rollno", referencedColumnName = "rollno", nullable = false)
	private Student student;
	
	/**
	 * @return the sprofileId
	 */
	public Long getProfileId() {
		return profileId;
	}
	/**
	 * @param sprofileId the sprofileId to set
	 */
	public void setProfileId(Long sprofileId) {
		this.profileId = sprofileId;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}
	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}
	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}
	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}
	/**
	 * @param profileId
	 * @param phoneNumber
	 * @param gender
	 * @param dateOfBirth
	 * @param address1
	 * @param address2
	 * @param city
	 * @param state
	 * @param zipCode
	 * @param student
	 */
	public StudentProfile(Long profileId, String phoneNumber, String gender, Date dateOfBirth, String address1,
			String address2, String city, String state, String zipCode, Student student) {
		this.profileId = profileId;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.student = student;
	}
	
	public StudentProfile() {}
	
}
