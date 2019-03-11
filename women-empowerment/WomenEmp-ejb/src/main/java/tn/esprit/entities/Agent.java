package tn.esprit.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import tn.esprit.entities.User;

/**
 * Entity implementation class for Entity: Agent
 *
 */
@Entity(name="agent")

public class Agent extends User implements Serializable {

	
	private int CIN;
	private int phoneNumber;
	private String agentRole;
	private float salary;
	private String agentSpeciality;
	private static final long serialVersionUID = 1L;

	public Agent() {
		super();
	}   
	public int getCIN() {
		return this.CIN;
	}

	public void setCIN(int CIN) {
		this.CIN = CIN;
	}   
	public int getphoneNumber() {
		return this.phoneNumber;
	}

	public void setphoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}   
	public String getagentRole() {
		return this.agentRole;
	}

	public void setagentRole(String agentRole) {
		this.agentRole = agentRole;
	}   
	public float getSalary() {
		return this.salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}   
	public String getagentSpeciality() {
		return this.agentSpeciality;
	}

	public void setagentSpeciality(String agentSpeciality) {
		this.agentSpeciality = agentSpeciality;
	}
	@Override
	public String toString() {
		return "Agent [CIN=" + CIN + ", phoneNumber=" + phoneNumber + ", agentRole=" + agentRole + ", salary=" + salary + ", agentSpeciality="
				+ agentSpeciality + "]";
	}
   
}
