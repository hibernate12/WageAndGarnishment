package com.nit.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class DeductionPk implements Serializable {

	private static final long serialVersionUID = -1513734047265642183L;

	@Column(name = "yearQtr")
	private String yearQtr;

	@Column(name = "companyCode")
	private String companyCode;

	@Column(name = "deductionCode")
	private String deductionCode;

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

	public String getDeductionCode() {
		return deductionCode;
	}

	public void setDeductionCode(String deductionCode) {
		this.deductionCode = deductionCode;
	}

}
