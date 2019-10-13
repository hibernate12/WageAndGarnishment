package com.nit.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CompanyFeaturePK implements Serializable {

	private static final long serialVersionUID = -1906678467527305286L;

	@Column(name = "yearQtr")
	private String yearQtr;

	@Column(name = "companyCode")
	private String companyCode;

	@Column(name = "deductionCode")
	private String deductionCode;

	@Column(name = "companyFeatureCode", insertable = false, updatable = false)
	private String companyFeatureCode;

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

	public String getCompanyFeatureCode() {
		return companyFeatureCode;
	}

	public void setCompanyFeatureCode(String companyFeatureCode) {
		this.companyFeatureCode = companyFeatureCode;
	}

	@Override
	public String toString() {
		return "CompanyFeaturePK [yearQtr=" + yearQtr + ", companyCode=" + companyCode + ", deductionCode="
				+ deductionCode + ", companyFeatureCode=" + companyFeatureCode + "]";
	}

}
