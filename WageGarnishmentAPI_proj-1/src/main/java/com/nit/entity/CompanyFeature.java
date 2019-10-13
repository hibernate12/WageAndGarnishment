package com.nit.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "companyfeature")
public class CompanyFeature implements Serializable {

	private static final long serialVersionUID = -1906678467527305286L;
	@EmbeddedId
	CompanyFeaturePK pKey;

	@Column(name = "companyFeatureDescription")
	private String companyFeatureDescription;

	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	@Fetch(FetchMode.JOIN)
	@JoinColumns({
			@JoinColumn(name = "yearQtr", referencedColumnName = "yearQtr", nullable = true, insertable = false, updatable = false),
			@JoinColumn(name = "companyCode", referencedColumnName = "companyCode", nullable = true, insertable = false, updatable = false),
			@JoinColumn(name = "deductionCode", referencedColumnName = "deductionCode", nullable = true, insertable = false, updatable = false) })
	Deduction deduction;

	public CompanyFeaturePK getpKey() {
		return pKey;
	}

	public void setpKey(CompanyFeaturePK pKey) {
		this.pKey = pKey;
	}

	public String getCompanyFeatureDescription() {
		return companyFeatureDescription;
	}

	public void setCompanyFeatureDescription(String companyFeatureDescription) {
		this.companyFeatureDescription = companyFeatureDescription;
	}

}
