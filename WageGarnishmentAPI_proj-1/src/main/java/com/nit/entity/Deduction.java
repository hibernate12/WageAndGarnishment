package com.nit.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "deduction")
public class Deduction implements Serializable {

	private static final long serialVersionUID = 1639743825723013174L;
	@EmbeddedId
	DeductionPk pKey;

	@Column(name = "deductionShortName")
	private String deductionShortName;
	
	@Column(name = "deductionLongName")
	private String deductionLongName;

	/*
	 * @JoinColumns({
	 * 
	 * @JoinColumn(name = "yearQtr", referencedColumnName = "yearQtr", insertable =
	 * false, updatable = false),
	 * 
	 * @JoinColumn(name = "companyCode", referencedColumnName = "companyCode",
	 * insertable = false, updatable = false),
	 * 
	 * @JoinColumn(name = "deductionCode", referencedColumnName = "deductionCode",
	 * insertable = false, updatable = false) })
	 */
	@OneToMany(fetch = FetchType.EAGER, cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH }, mappedBy = "deduction", orphanRemoval = true)
	@Fetch(FetchMode.SUBSELECT)
	private List<CompanyFeature> companyFeature;

	public DeductionPk getpKey() {
		return pKey;
	}

	public void setpKey(DeductionPk pKey) {
		this.pKey = pKey;
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

	public List<CompanyFeature> getCompanyFeature() {
		return companyFeature;
	}

	public void setCompanyFeature(List<CompanyFeature> companyFeature) {
		this.companyFeature = companyFeature;
	}

}
