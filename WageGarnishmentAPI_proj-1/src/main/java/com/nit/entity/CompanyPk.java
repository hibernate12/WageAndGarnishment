package com.nit.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;

@Embeddable
public class CompanyPk implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5640621501238414186L;

	@Column(name = "yearQtr")
	private String yearQtr;

	@Column(name = "companyCode")
	private String companyCode;

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

	@Override
	public String toString() {
		return "CompanyPk [yearQtr=" + yearQtr + ", companyCode=" + companyCode + "]";
	}

}
