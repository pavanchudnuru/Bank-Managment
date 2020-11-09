package com.cts.mcp.bms.service;
/**
 * 
@author micro-credentional-program
 *
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.mcp.bms.controller.UserController;
import com.cts.mcp.bms.domain.LogIn;
import com.cts.mcp.bms.exception.UserInvalidException;
import com.cts.mcp.bms.repository.LogInRepo;
import com.cts.mcp.bms.responseentity.ApiResponse;

@Service
public class LogInServiceImp implements LogInService {

	@Autowired
	LogInRepo logInRepo;

	public static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Override
	public ApiResponse getAllUser(LogIn logIn) {

		logInRepo.findAll(logIn);

		logger.info("Valid user");

		return new ApiResponse(200, "success", null);

	}

	@Override
	public ApiResponse addLogIn(LogIn login) {
		// TODO Auto-generated method stub
		LogIn logIn2 = logInRepo.insertion(login);

		if (logIn2 == null) {
			throw new UserInvalidException("please enter valid credentionals ");
		}

		logger.info("user added successfully");

		return new ApiResponse(200, "success", null);
	}

}
