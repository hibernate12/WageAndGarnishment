package com.nit.dto;

public class CompanyDeductionFeatureDTO {

	private String yearQtr;

	private String companyCode;

	private String deductionCode;

	private String companyFeatureCode;

	private String companyFeatureDescription;

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

	public String getCompanyFeatureDescription() {
		return companyFeatureDescription;
	}

	public void setCompanyFeatureDescription(String companyFeatureDescription) {
		this.companyFeatureDescription = companyFeatureDescription;
	}

	@Override
	public String toString() {
		return "CompanyDeductionFeatureDTO [yearQtr=" + yearQtr + ", companyCode=" + companyCode + ", deductionCode="
				+ deductionCode + ", companyFeatureCode=" + companyFeatureCode + ", companyFeatureDescription="
				+ companyFeatureDescription + "]";
	}

}
