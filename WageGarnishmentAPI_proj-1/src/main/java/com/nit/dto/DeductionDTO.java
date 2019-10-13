package com.nit.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;

import com.nit.entity.CompanyFeature;

public class DeductionDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3421521767268593694L;

	private String yearQtr;

	private String companyCode;

	private String deductionCode;

	private String deductionShortName;

	private String deductionLongName;
//changes done converted companyfeature into list of companyfeaturedto
	private List<CompanyDeductionFeatureDTO> companyDeductionFeatureDTO;

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

	public String getDeductionShortName() {
		return deductionShortName;
	}

	public void setDeductionShortName(String deductionShortName) {
		this.deductionShortName = deductionShortName;
	}

	public String getDeductionLongName() {
		return deductionLongName;
	}

	public void setDeductionLongName(String deductionLongName) {
		this.deductionLongName = deductionLongName;
	}

	public List<CompanyDeductionFeatureDTO> getCompanyDeductionFeatureDTO() {
		return companyDeductionFeatureDTO;
	}

	public void setCompanyDeductionFeatureDTO(List<CompanyDeductionFeatureDTO> companyDeductionFeatureDTO) {
		this.companyDeductionFeatureDTO = companyDeductionFeatureDTO;
	}

}
