package com.cts.mcp.bms.sample;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.cts.mcp.bms.controller.UserController;
import com.cts.mcp.bms.domain.Loan;
import com.cts.mcp.bms.repository.LoanRepo;
import com.cts.mcp.bms.service.LoanServiceImp;

@SpringBootTest
class ApplicationTests {

	@Mock
	private LoanRepo loanRepo;

	@InjectMocks
	LoanServiceImp loanServiceimp;

	@InjectMocks
	UserController userController;

	@Test
	void testsaveLoanDetails() throws Exception {
		//Loan loan = new Loan();
		final Loan loan1 = new Loan();
		loan1.setLoanType("saving");
		loan1.setLoanDate("12-8-1998");
		loan1.setAmount(1000000L);
		
		loan1.setRateOfInterest(3);
		loan1.setDurationOfLoan("36");
		when(loanRepo.saveLoanDetails(loan1)).thenReturn(loan1);

		final Loan loans =loanServiceimp.addLoanDetails (loan1);
		assertThat(loans).isNotNull();
	}
	
	
	
	@Test
	void testGetCustomer() throws Exception {
		final List<Loan> loan = new ArrayList<>();
		
		loan.add(new Loan("saving",10000,"09-10-2010",3.6,"36"));
		loan.add(new Loan("saving",10000,"09-10-2010",3.6,"36"));
		loan.add(new Loan("saving",10000,"09-10-2010",3.6,"36"));
		
		when(loanRepo.findAll()).thenReturn(loan);

		final List<Loan> loanList = loanServiceimp.getAllLoanUsers();
		assertThat(loanList).isNotNull();
	}

}
