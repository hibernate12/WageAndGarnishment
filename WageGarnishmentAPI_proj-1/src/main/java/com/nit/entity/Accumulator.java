package com.nit.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "accumulator")
public class Accumulator implements Serializable {

	private static final long serialVersionUID = -42007321708632796L;
	
	@EmbeddedId
	AccumulatorPK pkey;
	
	@Column(name = "accumulatorDescription")
	private String accumulatorDescription;
	
	@Column(name = "moneyMovementIndicator")
	private String moneyMovementIndicator;

	public AccumulatorPK getPkey() {
		return pkey;
	}

	public void setPkey(AccumulatorPK pkey) {
		this.pkey = pkey;
	}

	public String getAccumulatorDescription() {
		return accumulatorDescription;
	}

	public void setAccumulatorDescription(String accumulatorDescription) {
		this.accumulatorDescription = accumulatorDescription;
	}

	public String getMoneyMovementIndicator() {
		return moneyMovementIndicator;
	}

	public void setMoneyMovementIndicator(String moneyMovementIndicator) {
		this.moneyMovementIndicator = moneyMovementIndicator;
	}
	
	


}
