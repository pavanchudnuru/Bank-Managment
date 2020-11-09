package com.cts.mcp.bms.service;
/**
 * 
@author micro-credentional-program
 *
 */

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.mcp.bms.domain.SignUp;
import com.cts.mcp.bms.repository.signUpRepository;
import com.cts.mcp.bms.responseentity.ApiResponse;

@Service
public class SignUpServiceImp implements SignUpService {

	@Autowired
	signUpRepository repo;
	
	public static final Logger logger = LoggerFactory.getLogger(SignUpServiceImp.class);

	@Override
	public List<SignUp> getAllCustomers() {
		
		List<SignUp> signUps = repo.findAllCustomers();
		
		logger.info("User inserted succesfully");
		
		return signUps;
	}

	@Override
	public SignUp addSignUp(SignUp signup) {
		logger.info("Saving Customer details in Db");
		return repo.insertion(signup);
		
	}

	@Override
	public ApiResponse updateSignUp(SignUp signup) {
		// TODO Auto-generated method stub
		int signUp = repo.updateCustomerDetails(signup);
		
		return new ApiResponse(200, "User details successfully updated", signUp);
	}

//	@Override
//	public SignUp addUser(SignUp signUp) {
//		

//		repo.insertion(signUp);

	// TODO Auto-generated method stub
//		return null;
//	}

}
