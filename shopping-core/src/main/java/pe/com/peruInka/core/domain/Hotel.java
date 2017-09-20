package pe.com.peruInka.core.domain;

import java.io.Serializable;

public class Hotel extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String businessName;
	private String ruc;
	private String address;
	private String phone;
	private Long personId;
	private String root;
	private StatusHotel statusHotel;
	
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Long getPersonId() {
		return personId;
	}
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	public String getRoot() {
		return root;
	}
	public void setRoot(String root) {
		this.root = root;
	}
	public StatusHotel getStatusHotel() {
		return statusHotel;
	}
	public void setStatusHotel(StatusHotel statusHotel) {
		this.statusHotel = statusHotel;
	}
	
	
	

}
