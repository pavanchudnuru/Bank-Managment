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

import com.cts.mcp.bms.domain.LogIn;
import com.cts.mcp.bms.domain.SignUp;

@Service
public class LogInRepo {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<SignUp> findAll(LogIn logIn) {

		return jdbcTemplate.query("SELECT * FROM users where username = ? ", new Object[] { logIn.getUsername() },
				new RowMapper<SignUp>() {
					public SignUp mapRow(ResultSet rs, int arg1) throws SQLException {
						SignUp signUp = new SignUp();

						signUp.setName(rs.getString("name"));
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

	public LogIn insertion(LogIn login) {

		String sqlQuery = "insert into user (username,password)" + "values (?,?)";
		jdbcTemplate.update(sqlQuery, login.getUsername(), login.getPassword());
		return login;
	}
}