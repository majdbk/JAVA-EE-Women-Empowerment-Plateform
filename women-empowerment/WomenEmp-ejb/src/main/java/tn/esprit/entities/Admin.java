package tn.esprit.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import tn.esprit.entities.User;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity(name="admin")
public class Admin extends User implements Serializable {

	
	private String privileges;
	private String adminRole;
	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}   
	public String getPrivileges() {
		return this.privileges;
	}

	public void setPrivileges(String privileges) {
		this.privileges = privileges;
	}
	public String getAdminRole() {
		return adminRole;
	}
	public void setAdminRole(String adminRole) {
		this.adminRole = adminRole;
	}
	@Override
	public String toString() {
		return "Admin [privileges=" + privileges + ", adminRole=" + adminRole + "]";
	}	
  
}
