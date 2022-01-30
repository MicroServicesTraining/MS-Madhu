/**
 * 
 */
package com.ofs.sms.ui.responses;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author USER
 *
 */
@JsonInclude(Include.NON_NULL)
public class StudentMgmtResponse<T> implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3240890474395125240L;
	
	private String message;
	private Integer code;
	//@JsonInclude(Include.NON_NULL)
	private T data;
	
	/**
	 * @param message
	 * @param code
	 * @param data
	 */
	public StudentMgmtResponse(String message, Integer code, T data) {
		this.message = message;
		this.code = code;
		this.data = data;
	}
	
	public StudentMgmtResponse(){}
	
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(Integer code) {
		this.code = code;
	}
	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}
}
