package com.nit.convertor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.nit.dto.CompanyDeductionFeatureDTO;
import com.nit.dto.DeductionDTO;
import com.nit.entity.CompanyFeature;
import com.nit.entity.Deduction;

@Component("wageGarnishmentConvertor")
public class WageGarnishmentConvertor {

	public DeductionDTO convertToDeductionDTO(Deduction deduction) {
		DeductionDTO deductionDto = new DeductionDTO();

		String yearQtr = deduction.getpKey().getYearQtr();
		String companyCode = deduction.getpKey().getCompanyCode();
		String deductionCode = deduction.getpKey().getDeductionCode();

		List<CompanyFeature> companyFeatures = deduction.getCompanyFeature();

		List<CompanyDeductionFeatureDTO> companyDeductionFeatureDTOList = new ArrayList<>();

		for (CompanyFeature companyFeature : companyFeatures) {
			CompanyDeductionFeatureDTO companyDeductionFeatureDTO = convertToCompanyDeductionFeatureDTO(companyFeature);
			companyDeductionFeatureDTOList.add(companyDeductionFeatureDTO);
		}

		String longName = deduction.getDeductionLongName();
		String shortName = deduction.getDeductionShortName();

		deductionDto.setYearQtr(yearQtr);
		deductionDto.setCompanyCode(companyCode);
		deductionDto.setDeductionCode(deductionCode);
		deductionDto.setCompanyDeductionFeatureDTO(companyDeductionFeatureDTOList);
		deductionDto.setDeductionLongName(longName);
		deductionDto.setDeductionShortName(shortName);

		return deductionDto;
	}

	public CompanyDeductionFeatureDTO convertToCompanyDeductionFeatureDTO(CompanyFeature companyFeature) {

		CompanyDeductionFeatureDTO companyDeductionFeatureDTO = new CompanyDeductionFeatureDTO();

		String yearQtr = companyFeature.getpKey().getYearQtr();
		String companyCode = companyFeature.getpKey().getCompanyCode();
		String deductionCode = companyFeature.getpKey().getDeductionCode();
		String companyFeatureCode = companyFeature.getpKey().getCompanyFeatureCode();
		String companyFeatureDescription = companyFeature.getCompanyFeatureDescription();

		companyDeductionFeatureDTO.setCompanyCode(companyCode);
		companyDeductionFeatureDTO.setCompanyFeatureCode(companyFeatureCode);
		companyDeductionFeatureDTO.setCompanyFeatureDescription(companyFeatureDescription);
		companyDeductionFeatureDTO.setDeductionCode(deductionCode);
		companyDeductionFeatureDTO.setYearQtr(yearQtr);

		return companyDeductionFeatureDTO;

	}
}
