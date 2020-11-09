package com.cts.mcp.bms.exception;

/**
 * 
@author micro-credentional-program
 *
 */
public class UserInsertionFailedException extends RuntimeException {

	private static final long serialVersionUID = 1L;


	/**Customer Insertion Failed Exception method
	 * 
	 * @param message
	 */
	public UserInsertionFailedException(String message) {
		super(message);
	}

}
