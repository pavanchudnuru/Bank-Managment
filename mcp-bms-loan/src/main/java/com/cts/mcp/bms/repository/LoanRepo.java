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

import com.cts.mcp.bms.domain.Loan;

@Service
public class LoanRepo {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Loan> findAll() {
		return jdbcTemplate.query("SELECT * FROM loan", new RowMapper<Loan>() {
			public Loan mapRow(ResultSet rs, int arg1) throws SQLException {
				Loan loan = new Loan();
				loan.setLoanType(rs.getString("loan_type"));
				loan.setAmount(rs.getLong("loan_amount"));
				loan.setLoanDate(rs.getString("loan_date"));
				loan.setRateOfInterest(rs.getFloat("rate_of_interest"));
				loan.setDurationOfLoan(rs.getString("loan_duration"));
				return loan;
			}
		});
	}

	public Loan saveLoanDetails(Loan loan) {
		String sqlQuery = "insert into loan (loan_type,loan_amount,loan_date,rate_of_interest,loan_duration)"
				+ "values (?,?,?,?,?)";
		jdbcTemplate.update(sqlQuery, loan.getLoanType(), loan.getAmount(), loan.getLoanDate(),
				loan.getRateOfInterest(), loan.getDurationOfLoan());
		return loan;
	}

}
