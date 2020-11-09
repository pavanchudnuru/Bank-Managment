package com.cts.mcp.bms.service;
/**
 * 
@author micro-credentional-program
 *
 */

import java.util.List;

import com.cts.mcp.bms.domain.SignUp;
import com.cts.mcp.bms.responseentity.ApiResponse;

public interface SignUpService {

	public List<SignUp> getAllCustomers();

	public SignUp addSignUp(SignUp signup);

	public ApiResponse updateSignUp(SignUp signup);

}
