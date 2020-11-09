package com.cts.mcp.bms.domain;

/**
 * @author micro-credentional-program
 *
 */

public class SignUp {

	private String name;
	private String userName;
	private String password;
	private String address;
	private String state;

	private String country;

	private String emailAddress;

	private String pan;
	private long contactNumber;
	private String dob;
	private String accountType;

	public SignUp() {
		super();
		
	}

	public SignUp(String name, String userName, String password, String address, String state, String country,
			String emailAddress, String pan, long contactNumber, String dob, String accountType) {
		super();
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.address = address;
		this.state = state;
		this.country = country;
		this.emailAddress = emailAddress;
		this.pan = pan;
		this.contactNumber = contactNumber;
		this.dob = dob;
		this.accountType = accountType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "Registration [name=" + name + ", userName=" + userName + ", password=" + password + ", address="
				+ address + ", state=" + state + ", country=" + country + ", emailAddress=" + emailAddress + ", pan="
				+ pan + ", contactNumber=" + contactNumber + ", dob=" + dob + ", accountType=" + accountType + "]";
	}

}