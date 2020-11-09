package com.cts.mcp.bms.service;
/**
 * 
@author micro-credentional-program
 *
 */

import com.cts.mcp.bms.domain.LogIn;
import com.cts.mcp.bms.responseentity.ApiResponse;

public interface LogInService {

	public ApiResponse getAllUser(LogIn logIn);

	public ApiResponse addLogIn(LogIn logIn);

}
