package com.cts.mcp.bms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.mcp.bms.domain.LogIn;
import com.cts.mcp.bms.responseentity.ApiResponse;
import com.cts.mcp.bms.service.LogInService;

/**
 * @author micro-credentional-program
 *
 */

@RestController
@RequestMapping("/V1/user")
@ComponentScan

public class UserController {

	@Autowired
	LogInService logInservice;
	public static final Logger logger = LoggerFactory.getLogger(UserController.class);

	/**
	 * Controller for applyLoan
	 * 
	 * @param Login
	 * 
	 * 
	 * @return
	 * 
	 */

	@GetMapping("/login")
	public ApiResponse getAll(@RequestBody LogIn logIn) {

		return logInservice.addLogIn(logIn);

	}

	@PostMapping(path = "login", consumes = "application/json")
	public ApiResponse insert(@RequestBody LogIn logIn) {

		return logInservice.addLogIn(logIn);
	}

}