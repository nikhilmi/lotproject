package com.teamsankya.lotproject.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.springframework.lang.NonNull;

/**
 * 
 * The {@link LotBean} implements {@link Serializable}.
 * Constructor - created NoArgument Constructor.
 * overriden toString method. 
 * {@link Entity} - Specifies that the class is an entity,this annotation is applied to the entity class.
 * {@link Table}  - Specifies the primary table for the annotated entity.       
 * {@link Id}     - Specifies mapped column of the entity is assumed to be the primary key of the primary table.     
 * {@link Column} - Specifies the mapped column for a persistent property or field.   
 * 
 * 
 * @author Yasar 
 */

@Entity
@Table(name="lot_fact")
public class LotBean implements Serializable {
	@Id
	@Column(name ="lotId")
	private String lotId;
	
	
	@Column(name ="sales_order_number")
	
	private String salesOrderNumber;
	
	@Column(name ="completion_class", nullable=false)
	private String completionClass;
	
	@Column(name ="active_flag", nullable=false)
	private String activeFlag;
	
	
	@Column(name ="customer_id")
	private long customerId;

	public String getLotId() {
		return lotId;
	}

	public void setLotId(String lotId) { 
		if(lotId==null) {
			 throw new RuntimeException();
		}
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
