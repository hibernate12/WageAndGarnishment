package com.nit.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.convertor.WageGarnishmentConvertor;
import com.nit.dto.CompanyDeductionFeatureDTO;
import com.nit.dto.DeductionDTO;
import com.nit.entity.CompanyFeature;
import com.nit.entity.Deduction;
import com.nit.persistence.WageGarnishmentDao;

@Service("wageGarnishmentService")
public class WageGarnishmentServiceImpl implements WageGarnishmentService {
	@Autowired
	private WageGarnishmentDao dao;

	@Autowired
	WageGarnishmentConvertor wageGarnishmentConvertor;

	@Override
	public boolean isCompanyExits(String company) {

		return dao.isCompanyExits(company);
	}

	@Override
	public List<DeductionDTO> getDeductionDTOList(String company) {
		List<Deduction> deductionList = dao.getDeductionList(company);

		List<DeductionDTO> deductionDTOList = new ArrayList<>();
		/*
		 * to save this company feature entity we have to make list so that we store
		 * previous object also ... if list is not there iteration will happen and the
		 * previous object will be replaced by new object so to save previous object we
		 * store them in list
		 */
		for (Deduction deduction : deductionList) {
			DeductionDTO deductionDTO = wageGarnishmentConvertor.convertToDeductionDTO(deduction);
			deductionDTOList.add(deductionDTO);
		}

		return deductionDTOList;
	}

	@Override
	public List<CompanyDeductionFeatureDTO> getCompanyDeductionFeatureDTOList(String company, int companyFeatureCode) {
		List<CompanyFeature> companyFeatureList = dao.getCompanyFeatureList(company, companyFeatureCode);

		List<CompanyDeductionFeatureDTO> companyDeductionFeatureDTOList = new ArrayList<>();
		/*
		 * to save this company feature entity we have to make list so that we store
		 * previous object also ... if list is not there iteration will happen and the
		 * previous object will be replaced by new object so to save previous object we
		 * store them in list
		 */
		for (CompanyFeature companyFeature : companyFeatureList) {
			CompanyDeductionFeatureDTO companyDeductionFeatureDTO = wageGarnishmentConvertor
					.convertToCompanyDeductionFeatureDTO(companyFeature);

			companyDeductionFeatureDTOList.add(companyDeductionFeatureDTO);
		}
		return companyDeductionFeatureDTOList;

	}
	

}
