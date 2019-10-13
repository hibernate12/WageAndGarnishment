package com.nit.persistence;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.nit.entity.CompanyFeature;
import com.nit.entity.CompanyMaster;
import com.nit.entity.Deduction;

@Repository("wageGarnishmentDao")
@Transactional
public class WageGarnishmentDaoImpl extends AbstractDAO implements WageGarnishmentDao {

	@Override
	public boolean isCompanyExits(String company) {

		CriteriaBuilder criteriaBuilder = getCriteriaBuilder();
		CriteriaQuery<CompanyMaster> criteriaQuery = criteriaBuilder.createQuery(CompanyMaster.class);
		Root<CompanyMaster> companyRoot = criteriaQuery.from(CompanyMaster.class);
		try {
			Predicate predicateForCompanyExist = criteriaBuilder.equal(companyRoot.get("pKey").get("companyCode"),
					company);

			criteriaQuery.where(predicateForCompanyExist);

			CompanyMaster companyMaster = getSession().createQuery(criteriaQuery).getSingleResult();
			System.out.println("Data :" + companyMaster);

		} catch (Exception exception) {
			exception.printStackTrace();
			System.out.println("No Company Exist");
			return false;
		}
		return true;
	}

	@Override
	public List<Deduction> getDeductionList(String companyName) {
		CriteriaBuilder criteriaBuilder = getCriteriaBuilder();
		CriteriaQuery<Deduction> criteriaQuery = criteriaBuilder.createQuery(Deduction.class);
		Root<Deduction> companyRoot = criteriaQuery.from(Deduction.class);
		Predicate predicateForCompanyDeduction = criteriaBuilder.equal(companyRoot.get("pKey").get("companyCode"),
				companyName);
		criteriaQuery.where(predicateForCompanyDeduction);
		List<Deduction> deductionList = getSession().createQuery(criteriaQuery).getResultList();
		for (Deduction deduction : deductionList) {
			System.out.println("Deduction: " + deduction);
		}
		return deductionList;
	}

	@Override
	public List<CompanyFeature> getCompanyFeatureList(String company, int companyFeatureCode) {
		CriteriaBuilder criteriaBuilder = getCriteriaBuilder();
		CriteriaQuery<CompanyFeature> criteriaQuery = criteriaBuilder.createQuery(CompanyFeature.class);
		Root<CompanyFeature> companyFeatureRoot = criteriaQuery.from(CompanyFeature.class);

		Predicate predicateForCompanyFeature = criteriaBuilder.equal(companyFeatureRoot.get("pKey").get("companyCode"),
				company);

		criteriaQuery.where(predicateForCompanyFeature);

		List<CompanyFeature> companyFeatureList = getSession().createQuery(criteriaQuery).getResultList();
		for (CompanyFeature companyFeature : companyFeatureList) {
			System.out.println("companyFeature:::" + companyFeature);
		}

		/*
		 * CompanyFeature companyFeatures =
		 * getSession().createQuery(criteriaQuery).getSingleResult();
		 * System.out.println("Data :" + companyFeatures);
		 */

		return companyFeatureList;

	}

}
