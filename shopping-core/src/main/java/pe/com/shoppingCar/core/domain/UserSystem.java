package pe.com.shoppingCar.core.domain;

import java.io.Serializable;
import java.util.Date;

public class UserSystem extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String login;
	private String password;
	private String passwordConfirmation;
	private String passwordOld;
	private Date dateIni;
	private Date dateEnd;
	private String firstName;
	private String lastNameF;
	private String lastNameM;
	private String statusUser;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}
	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}
	public String getPasswordOld() {
		return passwordOld;
	}
	public void setPasswordOld(String passwordOld) {
		this.passwordOld = passwordOld;
	}
	public Date getDateIni() {
		return dateIni;
	}
	public void setDateIni(Date dateIni) {
		this.dateIni = dateIni;
	}
	public Date getDateEnd() {
		return dateEnd;
	}
	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastNameF() {
		return lastNameF;
	}
	public void setLastNameF(String lastNameF) {
		this.lastNameF = lastNameF;
	}
	public String getLastNameM() {
		return lastNameM;
	}
	public void setLastNameM(String lastNameM) {
		this.lastNameM = lastNameM;
	}
	public String getStatusUser() {
		return statusUser;
	}
	public void setStatusUser(String statusUser) {
		this.statusUser = statusUser;
	}

	
	

}
