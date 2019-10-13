package com.nit.persistence;

import java.util.List;

import com.nit.dto.DeductionDTO;
import com.nit.entity.CompanyFeature;
import com.nit.entity.Deduction;

public interface WageGarnishmentDao {

	public boolean isCompanyExits(String company);

	public List<Deduction> getDeductionList(String company);

	public List<CompanyFeature> getCompanyFeatureList(String companyName, int companyFeatureCode);
}
