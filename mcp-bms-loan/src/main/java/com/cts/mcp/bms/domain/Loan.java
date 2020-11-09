package com.cts.mcp.bms.domain;
/**
 * 
@author micro-credentional-program
 *
 */

public class Loan {

	private String loanType;
	private Long amount;
	private String loanDate;
	private float rateOfInterest;
	private String durationOfLoan;

	public Loan() {
		super();
		
	}

	public Loan(String loanType, Long amount, String loanDate, float rateOfInterest, String durationOfLoan) {
		super();
		this.loanType = loanType;
		this.amount = amount;
		this.loanDate = loanDate;
		this.rateOfInterest = rateOfInterest;
		this.durationOfLoan = durationOfLoan;
	}

	public Loan(String string, int i, String string2, double d, String string3) {
		
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(String loanDate) {
		this.loanDate = loanDate;
	}

	public float getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public String getDurationOfLoan() {
		return durationOfLoan;
	}

	public void setDurationOfLoan(String durationOfLoan) {
		this.durationOfLoan = durationOfLoan;
	}

	@Override
	public String toString() {
		return "Loan [loanType=" + loanType + ", amount=" + amount + ", loanDate=" + loanDate + ", rateOfInterest="
				+ rateOfInterest + ", durationOfLoan=" + durationOfLoan + "]";
	}

}