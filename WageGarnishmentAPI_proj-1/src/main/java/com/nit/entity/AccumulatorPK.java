package com.nit.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AccumulatorPK implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3731515809221652727L;

	@Column(name = "accumulatorCode")
	private String accumulatorCode;
	
	@Column(name = "yearQtr")
	private String yearQtr;
	
	@Column(name = "companyCode")
	private String companyCode;

	public String getAccumulatorCode() {
		return accumulatorCode;
	}

	public void setAccumulatorCode(String accumulatorCode) {
		this.accumulatorCode = accumulatorCode;
	}

	public String getYearQtr() {
		return yearQtr;
	}

	public void setYearQtr(String yearQtr) {
		this.yearQtr = yearQtr;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	
	
	
}
