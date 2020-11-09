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

import com.cts.mcp.bms.domain.Loan;
import com.cts.mcp.bms.repository.LoanRepo;

@Service
public class LoanServiceImp implements LoanService {

	@Autowired
	LoanRepo loanrepo;
	public static final Logger logger = LoggerFactory.getLogger(LoanServiceImp.class);

	@Override
	public List<Loan> getAllLoanUsers() {
		
		List<Loan> loan = loanrepo.findAll();

		logger.info("All Loan Details");
		return loan;
	}

	@Override
	public Loan addLoanDetails(Loan loan) {
		
		Loan loans = loanrepo.saveLoanDetails(loan);
		logger.info("Loan details saved successfully");
		return loans;
	}

}
