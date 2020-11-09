package com.cts.mcp.bms.controller;
/**
 * 
@author micro-credentional-program
 *
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.mcp.bms.domain.Loan;
import com.cts.mcp.bms.exception.LoanInvalidDataException;
import com.cts.mcp.bms.responseentity.ApiResponse;
import com.cts.mcp.bms.service.LoanService;

@RestController
@RequestMapping("/V1/user")
@ComponentScan

public class UserController {

	@Autowired
	LoanService loanService;

	@GetMapping("/loan/details")
	public ApiResponse getLoanUsers() {

		List<Loan> loan = loanService.getAllLoanUsers();

		return new ApiResponse(200, "Details of loan users", loan);

	}
	
	@PostMapping(path = "loan/details", consumes = "application/json")
	public ApiResponse loanDetails(@RequestBody Loan loan) {
		Loan loans = loanService.addLoanDetails(loan);
		if (loans == null) {
			throw new LoanInvalidDataException("Loan application Failed.Check your details");

		}
		return new ApiResponse(200, "Details of loan users", loan);

	}

}