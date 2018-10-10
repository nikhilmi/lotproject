package com.teamsankya.lotproject.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class LotDto implements Serializable {
	@Id
	@Column
	private String lotId;
	private String salesOrderNumber;
	private String completionClass;
	private String activeFlag;
	private long customerId;

	public String getLotId() {
		return lotId;
	}

	public void setLotId(String lotId) {
		this.lotId = lotId;
	}

	public String getSalesOrderNumber() {
		return salesOrderNumber;
	}

	public void setSalesOrderNumber(String salesOrderNumber) {
		this.salesOrderNumber = salesOrderNumber;
	}

	public String getCompletionClass() {
		return completionClass;
	}

	public void setCompletionClass(String completionClass) {
		this.completionClass = completionClass;
	}

	public String getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "LotDto [lotId=" + lotId + ", salesOrderNumber=" + salesOrderNumber + ", completionClass="
				+ completionClass + ", activeFlag=" + activeFlag + ", customerId=" + customerId + "]";
	}

}
