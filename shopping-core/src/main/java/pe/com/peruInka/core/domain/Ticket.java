package pe.com.peruInka.core.domain;

import java.io.Serializable;
import java.util.Date;

import pe.com.peruInka.core.util.CommonUtils;

public class Ticket extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private Date dateIni;
	private Date dateEn;
	private Long customerId;
	private String createdBy;
	private Date dateCreated;
	private Date dateLastUpdated;
	private String lastUpdatedBy;
	private StatusTicket statusTicket;


//	private String dateIniString;
//	private String dateEnString;

	
	public Date getDateIni() {
		return dateIni;
	}

	public void setDateIni(Date dateIni) {
		this.dateIni = dateIni;
	}

	public Date getDateEn() {
		return dateEn;
	}

	public void setDateEn(Date dateEn) {
		this.dateEn = dateEn;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
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

	public StatusTicket getStatusTicket() {
		return statusTicket;
	}

	public void setStatusTicket(StatusTicket statusTicket) {
		this.statusTicket = statusTicket;

	}

	public String getDateIniString() {
		return CommonUtils.dateToString(dateIni, "dd/MM/yyyy");
	}

	public String getDateEnString() {
		return CommonUtils.dateToString(dateEn, "dd/MM/yyyy");
	}

	public void setDateIniString(String dateIniString){
		this.dateIni = CommonUtils.stringToDate(dateIniString, "dd/MM/yyyy");
	}
	
	public void setDateEnString(String dateEnString){
		this.dateEn = CommonUtils.stringToDate(dateEnString, "dd/MM/yyyy");
	}
	
}
