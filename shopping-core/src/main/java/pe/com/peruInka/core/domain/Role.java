package pe.com.peruInka.core.domain;

import java.io.Serializable;

public class Role extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String roleName;
	private String description;
	private String roleValue;
	private StatusRole statusRole;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRoleValue() {
		return roleValue;
	}

	public void setRoleValue(String roleValue) {
		this.roleValue = roleValue;
	}

	public StatusRole getStatusRole() {
		return statusRole;
	}

	public void setStatusRole(StatusRole statusRole) {
		this.statusRole = statusRole;
	}

}
