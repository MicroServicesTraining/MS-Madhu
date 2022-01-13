/**
 * 
 */
package com.ofs.sms.ss.exceptions;

/**
 * @author USER
 *
 */
public class InvalidInputException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3027845807754698616L;

	private String message;

	/**
	 * @param message
	 */
	public InvalidInputException(String message) {
		super(message);
		this.message = message;
	}

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

}
