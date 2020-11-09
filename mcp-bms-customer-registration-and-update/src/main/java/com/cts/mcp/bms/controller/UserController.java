package com.cts.mcp.bms.controller;
/**
 * 
@author micro-credentional-program
 *
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.mcp.bms.domain.SignUp;
import com.cts.mcp.bms.exception.UserNotFoundException;
import com.cts.mcp.bms.responseentity.ApiResponse;
import com.cts.mcp.bms.service.SignUpService;
import com.netflix.ribbon.proxy.annotation.Hystrix;


@RestController
@RequestMapping("/V1/user")
@ComponentScan

public class UserController {
	/**
	 * Controller for fetching customer details
	 * 
	 * @param signup
	 * 
	 * @return
	 */

	@Autowired
	SignUpService signUpService;

	@GetMapping("/signup")
	public ApiResponse getAllCustomers() {

		List<SignUp> signUps = signUpService.getAllCustomers();
		if (signUps == null) {
			throw new UserNotFoundException("Registration Failed.Check your details");
		}

		return new ApiResponse(200, "ALL DETAILS OF CUSTOMER", signUps);

	}
	
	/**
	 * Controller for saving customer details
	 * 
	 * @param signup
	 * 
	 * @return
	 */
	
	@Hystrix
	@PostMapping(path = "signup", consumes = "application/json")
	public ApiResponse addCustomer(@RequestBody SignUp signup) {

		SignUp signUp = signUpService.addSignUp(signup);

		if (signUp == null) {
			throw new UserNotFoundException("Registration Failed.Check your details");
		}

		return new ApiResponse(200, "user registered successfully", signUp);
	}
	
	
	/**
	 * Controller for update customer details
	 * 
	 * @param signup
	 * 
	 * @return
	 */
	@PutMapping(path = "signup", consumes = "application/json")
	public ApiResponse updateCustomer(@RequestBody SignUp signup) {

		return signUpService.updateSignUp(signup);
	}
	public ApiResponse circuitBreaker1(@RequestBody SignUp signUp)
	{
		return new ApiResponse(HttpStatus.GATEWAY_TIMEOUT.value(),"Timeout",null);
	}
	


}