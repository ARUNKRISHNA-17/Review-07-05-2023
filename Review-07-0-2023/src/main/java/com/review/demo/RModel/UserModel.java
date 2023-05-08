package com.review.demo.RModel;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="UserData")
public class UserModel 
{
	@Id
	private int id;
	private String email;
	private String password;
	private String username;
	private String mobilenumber;
	private String userrole;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	public List<LoanApplicationModel> loanmodels;
	public int loanid;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getUserrole() {
		return userrole;
	}
	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
	public int getLoanid() {
		return loanid;
	}
	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}
	public List<LoanApplicationModel> getLoanmodels() {
		return loanmodels;
	}
	public void setLoanmodels(List<LoanApplicationModel> loanmodels) {
		this.loanmodels = loanmodels;
	}
	
}
