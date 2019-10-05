package com.sbenturkia.dataprocessing.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users implements Serializable{

	 /**
	 * 
	 */
	private static final long serialVersionUID = -3599467598104200987L;

	@Id
	 private long userId;
	 
	 private String name;
	 
	 private String dept;
	 
	 private BigDecimal account;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public BigDecimal getAccount() {
		return account;
	}

	public void setAccount(BigDecimal account) {
		this.account = account;
	}
	 
}
