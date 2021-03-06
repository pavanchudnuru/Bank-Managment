package com.cts.mcp.bms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.cts.mcp.bms.responseentity.ApiResponse;

/**
 * @author micro-credentional-program
 *
 */

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(value = UserInvalidException.class)
	public ResponseEntity<ApiResponse> customerNotfoundException(UserInvalidException exception) {
		return new ResponseEntity<>(new ApiResponse(HttpStatus.NOT_FOUND.value(), exception.getMessage(), null),
				HttpStatus.NOT_FOUND);
	}
}