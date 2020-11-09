package com.cts.mcp.bms.sample;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.cts.mcp.bms.controller.UserController;
import com.cts.mcp.bms.domain.SignUp;
import com.cts.mcp.bms.repository.signUpRepository;
import com.cts.mcp.bms.service.SignUpServiceImp;

@SpringBootTest
class ApplicationTests {
	
	
	@Mock
	signUpRepository sigupRepository;
	

	@InjectMocks
	SignUpServiceImp signUpServiceImp;

	@InjectMocks
	UserController userController;

	@Test
	void testInsertion() throws Exception {
		final SignUp signUp1 = new SignUp();
		signUp1.setName("pavan");
		signUp1.setUserName("pavan12");
		signUp1.setPassword("pavan123");
		signUp1.setAddress("mcl");
		signUp1.setState("Ap");
		signUp1.setCountry("Ind");
		signUp1.setEmailAddress("pavan046");
		signUp1.setPan("asdfg");
		signUp1.setContactNumber(779494);
		signUp1.setDob("01-02-95");
		signUp1.setAccountType("saving");
		
		
		
		when(signUpServiceImp.addSignUp(signUp1)).thenReturn(signUp1);

		final SignUp signup = signUpServiceImp.addSignUp(signUp1);
		assertThat(signup).isNotNull();
		assertEquals("pavan", signup.getName());
		assertEquals("pavan12",signup.getUserName() );
		assertEquals("pavan123", signup.getPassword());
		assertEquals("mcl", signup.getAddress());
		assertEquals("Ap",signup.getState());
		assertEquals("Ind",signup.getCountry());
		assertEquals("pavan046", signup.getEmailAddress());
		assertEquals("asdfg", signup.getPan());
		assertEquals(779494, signup.getContactNumber());
		assertEquals("01-02-95", signup.getDob());
		assertEquals("saving", signup.getAccountType());
		
	}
	
	
	
	@Test
	void testGetCustomer() throws Exception {
		final List<SignUp> signup = new ArrayList<>();
		signup.add(new SignUp("pavan","pavan12","pavan123","MCL","Ap","Ind","pavan046","asdfg",779494,"01-02-95","saving"));
		signup.add(new SignUp("pavan","pavan12","pavan123","MCL","Ap","Ind","pavan046","asdfg",779494,"01-02-95","saving"));
		signup.add(new SignUp("pavan","pavan12","pavan123","MCL","Ap","Ind","pavan046","asdfg",779423,"01-02-95","saving"));
		
		when(sigupRepository.findAllCustomers()).thenReturn(signup);

		final List<SignUp> signupList = signUpServiceImp.getAllCustomers();
		assertThat(signupList).isNotNull();
	}
}
