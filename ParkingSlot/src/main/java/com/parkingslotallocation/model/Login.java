package com.parkingslotallocation.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
//import javax.validation.constraints.Min;

@Entity
@Table(name = "Login")
public class Login  {
	
	@Id
	@Column(name = "Login_Id")
	private String loginId;
	@Column(name = "Password")
	private String password;
	@OneToOne()
	@Column(name = "User")
	private User usr;
	@OneToOne
	@Column(name = "Role")
	private Role role;
	
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User getUsr() {
		return usr;
	}
	public void setUsr(User usr) {
		this.usr = usr;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	

}
