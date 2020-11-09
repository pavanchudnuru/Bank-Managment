package com.cts.mcp.bms.responseentity;
/**
 * 
@author micro-credentional-program
 *
 */
public class ApiResponse {

    private int status;
    private String message;
    private Object result;

    public ApiResponse() {
		super();
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public ApiResponse(int status, String message, Object result){
        this.status = status;
        this.message = message;
        this.result = result;
    }

    public int getStatus() {
        return status;
    }

}
