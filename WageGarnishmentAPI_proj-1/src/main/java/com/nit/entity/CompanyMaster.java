package com.nit.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "company_master")
public class CompanyMaster implements Serializable {

	private static final long serialVersionUID = 6022852951852594270L;

	@EmbeddedId
	CompanyPk pKey;

	@Column(name = "isExpandable")
	private String isExpandable;

	@Column(name = "isUsCompany")
	private String isUsCompany;

	@Column(name = "isRFCActive")
	private String isRFCActive;

	public CompanyPk getpKey() {
		return pKey;
	}

	public void setpKey(CompanyPk pKey) {
		this.pKey = pKey;
	}

	public String getIsExpandable() {
		return isExpandable;
	}

	public void setIsExpandable(String isExpandable) {
		this.isExpandable = isExpandable;
	}

	public String getIsUsCompany() {
		return isUsCompany;
	}

	public void setIsUsCompany(String isUsCompany) {
		this.isUsCompany = isUsCompany;
	}

	public String getIsRFCActive() {
		return isRFCActive;
	}

	public void setIsRFCActive(String isRFCActive) {
		this.isRFCActive = isRFCActive;
	}

	@Override
	public String toString() {
		return "CompanyMaster [pKey=" + pKey + ", isExpandable=" + isExpandable + ", isUsCompany=" + isUsCompany
				+ ", isRFCActive=" + isRFCActive + "]";
	}

}
