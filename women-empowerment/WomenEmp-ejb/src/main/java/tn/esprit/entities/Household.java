package tn.esprit.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Household
 *
 */
@Entity(name="household")

public class Household implements Serializable {

	@Id
	@GeneratedValue
	private int householdID;
	private String householdName;
	private String householdAddress;
	private int phoneNumber;
	private String availability;
	private String capacity;
	private static final long serialVersionUID = 1L;

	public Household() {
		super();
	}   
	public int getHouseholdID() {
		return this.householdID;
	}

	public void setHouseholdID(int householdID) {
		this.householdID = householdID;
	}   
	public String getHouseholdName() {
		return this.householdName;
	}

	public void setHouseholdName(String householdName) {
		this.householdName = householdName;
	}   
	public String gethouseholdAddress() {
		return this.householdAddress;
	}

	public void sethouseholdAddress(String householdAddress) {
		this.householdAddress = householdAddress;
	}   
	public int getphoneNumber() {
		return this.phoneNumber;
	}

	public void setphoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}   
	public String getAvailability() {
		return this.availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}   
	public String getCapacity() {
		return this.capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Household [householdID=" + householdID + ", householdName=" + householdName + ", householdAddress=" + householdAddress
				+ ", phoneNumber=" + phoneNumber + ", availability=" + availability + ", capacity=" + capacity + "]";
	}
   
}
