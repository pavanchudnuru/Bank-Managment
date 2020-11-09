package com.cts.mcp.bms.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cts.mcp.bms.domain.LogIn;

@SpringBootTest
class ApplicationTests {
	
//	 @Autowired
//	 MockMvc mockMvc;

	 


//	    @Autowired
//	    private LogInServiceImp logInServiceImp;
//	    
//	    @MockBean
//	    private LogInRepo  logInRepo;

	
		
		
		@Test
		void testLoginModel() throws Exception {
			final LogIn login1 = new LogIn();
			login1.setUsername("pavan");
			login1.setPassword("pavan123");
			assertEquals("pavan",login1.getUsername());
			assertEquals("pavan123",login1.getPassword());
		}


}
