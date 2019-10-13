package com.nit.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nit.dto.CompanyDeductionFeatureDTO;
import com.nit.dto.DeductionDTO;
import com.nit.entity.CompanyFeature;
import com.nit.entity.Deduction;
import com.nit.service.WageGarnishmentService;

@RestController
public class WageGarnishmentController {
	@Autowired
	private WageGarnishmentService service;

	@RequestMapping(value = "/dummy")
	public String dummyRequest(@RequestHeader(value = "Company", required = true) String company) {

		return "Welcome to Controller";

	}

	@RequestMapping(value = "/deduction", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	@Transactional
	public List<DeductionDTO> getDeductionList(@RequestHeader(value = "Company", required = true) String company) {
		return service.getDeductionDTOList(company);

	}

	@RequestMapping(value = "/companyFeature", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	@Transactional
	public List<CompanyDeductionFeatureDTO> getCompanyDeductionFeatureDTO(
			@RequestHeader(value = "Company", required = true) String company) {
		return service.getCompanyDeductionFeatureDTOList(company, 200);

	}
}
