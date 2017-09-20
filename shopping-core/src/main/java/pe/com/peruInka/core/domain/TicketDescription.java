package pe.com.peruInka.core.domain;

import java.io.Serializable;
import java.sql.Date;

public class TicketDescription extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
    private Long productId;
    private Long ticketId;
    private String quantity;
    private String priceUnitary;
    private String priceAll;
    private String comment;
    private String createdy;
    private Date dateCreated;
    private Date dateLastUpdated;
    private String lastUpdatedBy;
    private Integer version;
    private TicketDescription ticketDescription;
    
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getTicketId() {
		return ticketId;
	}
	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPriceUnitary() {
		return priceUnitary;
	}
	public void setPriceUnitary(String priceUnitary) {
		this.priceUnitary = priceUnitary;
	}
	public String getPriceAll() {
		return priceAll;
	}
	public void setPriceAll(String priceAll) {
		this.priceAll = priceAll;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getCreatedy() {
		return createdy;
	}
	public void setCreatedy(String createdy) {
		this.createdy = createdy;
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
	public TicketDescription getTicketDescription() {
		return ticketDescription;
	}
	public void setTicketDescription(TicketDescription ticketDescription) {
		this.ticketDescription = ticketDescription;
	}
  
}
