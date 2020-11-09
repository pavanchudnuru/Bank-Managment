package com.cts.mcp.bms.exception;

/**
 * 
@author micro-credentional-program
 *
 */
public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;


	/**Customer not found exception method
	 * 
	 * @param message
	 */
	public UserNotFoundException(String message) {
		super(message);
	}

}
