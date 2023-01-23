package com.example.profiles.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

public class Product {

	

	public Product(int i, String string, Date date, Date date2, Date date3) {
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name="pid")
	private Integer pid;
	@Column(name="pcode")
	private String pcode;
	
	@Temporal(TemporalType.DATE)
	@Column(name="pmfgdte")
	private Date mfgDate; //date
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pexpdte")
	private Date expDate; //date+time
	
	@Temporal(TemporalType.TIME)
	@Column(name="pexptim")
	private Date exportedTime; //time

}
