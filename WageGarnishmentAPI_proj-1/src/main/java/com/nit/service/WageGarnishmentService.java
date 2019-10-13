package com.nit.service;

import java.util.List;

import com.nit.dto.CompanyDeductionFeatureDTO;
import com.nit.dto.DeductionDTO;
import com.nit.entity.CompanyFeature;
import com.nit.entity.Deduction;

public interface WageGarnishmentService {

	public boolean isCompanyExits(String company);

	public List<DeductionDTO> getDeductionDTOList(String company);

	public List<CompanyDeductionFeatureDTO> getCompanyDeductionFeatureDTOList(String company, int companyFeatureCode);

}
