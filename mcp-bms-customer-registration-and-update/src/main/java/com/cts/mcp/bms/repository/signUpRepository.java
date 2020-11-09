package com.cts.mcp.bms.repository;
/**
 * 
@author micro-credentional-program
 *
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.cts.mcp.bms.domain.SignUp;

@Service
public class signUpRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<SignUp> findAllCustomers() {
		return jdbcTemplate.query("SELECT * FROM users", new RowMapper<SignUp>() {
			public SignUp mapRow(ResultSet rs, int arg1) throws SQLException {
				SignUp signUp = new SignUp();

				signUp.setName(rs.getString("name"));
				signUp.setUserName(rs.getString("userName"));
				signUp.setPassword(rs.getString("password"));
				signUp.setAddress(rs.getString("address"));
				signUp.setState(rs.getString("state"));
				signUp.setCountry(rs.getString("country"));
				signUp.setEmailAddress(rs.getString("emailAddress"));
				signUp.setPan(rs.getString("pan"));

				signUp.setContactNumber(rs.getLong("contactNumber"));

				signUp.setDob(rs.getString("dob"));
				signUp.setAccountType(rs.getString("accountType"));

				return signUp;
			}
		});
	}

	public SignUp insertion(SignUp signUp) {
		System.out.println("inside insertion DAO" + signUp.getEmailAddress());
		String sqlQuery = "insert into users (name,userName,password,address,state,country,emailAddress,pan,contactNumber,dob,accountType)"
				+ "values (?,?,?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sqlQuery, signUp.getName(), signUp.getUserName(), signUp.getPassword(), signUp.getAddress(),
				signUp.getState(), signUp.getCountry(), signUp.getEmailAddress(), signUp.getPan(),
				signUp.getContactNumber(), signUp.getDob(), signUp.getAccountType());

		return signUp;
	}

	public int updateCustomerDetails(SignUp signUp) {
		return jdbcTemplate.update(
				"update users set name = ?, address = ?, state = ? , country =?, contactNumber = ?  where emailAddress = ?",
				new Object[] { signUp.getName(), signUp.getAddress(), signUp.getState(), signUp.getCountry(),
						signUp.getContactNumber(), signUp.getEmailAddress(), });

	}

}
