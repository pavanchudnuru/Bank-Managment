package com.cts.mcp.bms.service;
/**
 * 
@author micro-credentional-program
 *
 */
import java.util.List;

import com.cts.mcp.bms.domain.Loan;

public interface LoanService {

	public List<Loan> getAllLoanUsers();

	public Loan addLoanDetails(Loan loan);

}
