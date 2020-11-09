package com.cts.mcp.bms.exception;

/**
 * @author javacloudmc446
 *
 */
public class LoanInvalidDataException extends RuntimeException {

	private static final long serialVersionUID = 1L;


	/**Customer Insertion Failed Exception method
	 * 
	 * @param message
	 */
	public LoanInvalidDataException(String message) {
		super(message);
	}

}
