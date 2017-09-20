package pe.com.peruInka.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Victor
 *
 */
public class Product extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String productName;
	private Float price;
	private String description;
	private String attribute;
	private Long hotelId;
	private String productType;
	private String createBy;
	private Date dateCreated;
	private Date dateLastUpdated;
	private String lastUpdatedBy;
	private StatusProducto statusProducto;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	public Long getHotelId() {
		return hotelId;
	}
	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
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

	public StatusProducto getStatusProducto() {
		return statusProducto;
	}
	public void setStatusProducto(StatusProducto statusProducto) {
		this.statusProducto = statusProducto;
	}

}
