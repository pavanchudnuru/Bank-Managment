package com.cts.mcp.bms.exception;
/**
 * 
@author micro-credentional-program
 *
 */

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cts.mcp.bms.responseentity.ApiResponse;


@ControllerAdvice
public class ExceptionController {
	
	
   @ExceptionHandler(value = UserNotFoundException.class)
   public ResponseEntity<ApiResponse> customerNotfoundException(UserNotFoundException exception) {
      return new ResponseEntity<>(new ApiResponse(HttpStatus.NOT_FOUND.value(), 
				exception.getMessage(),null), HttpStatus.NOT_FOUND);
   }
   
   @ExceptionHandler(value = UserInsertionFailedException.class)
   public ResponseEntity<ApiResponse> customerInsertionFailedException(UserNotFoundException exception) {
      return new ResponseEntity<>(new ApiResponse(HttpStatus.NOT_FOUND.value(), 
				exception.getMessage(),null), HttpStatus.NOT_FOUND);
   }
   
}