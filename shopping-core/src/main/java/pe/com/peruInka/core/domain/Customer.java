package pe.com.peruInka.core.domain;

import java.io.Serializable;
import java.sql.Date;

public class Customer extends BaseEntity implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	private Long enterpriceId;
	private Long personId; 	
	private String createdBy;
	private Date dateCreated;
	private Date dateLastUpdated;
	private String lastUpdatedBy;
	private  Integer version;
	private StatusCustomer statusCustomer;
	
	public Long getEnterpriceId() {
		return enterpriceId;
	}
	public void setEnterpriceId(Long enterpriceId) {
		this.enterpriceId = enterpriceId;
	}
	public Long getPersonId() {
		return personId;
	}
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDateLastUpdated() {
		return dateLastUpdated;
	}
	public void setDateLastUpdated(Date dateLastUpdated) {
		this.dateLastUpdated = dateLastUpdated;
	}
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public StatusCustomer getStatusCustomer() {
		return statusCustomer;
	}
	public void setStatusCustomer(StatusCustomer statusCustomer) {
		this.statusCustomer = statusCustomer;
	}
	
	

}
