package tn.esprit.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Locality
 *
 */
@Entity(name="locality")

public class Locality implements Serializable {

	@Id
	@GeneratedValue
	private int localityID;
	private String localityName;
	private String localityAddress;
	private String capacity;
	private String availability;
	private int phoneNumber;
	private static final long serialVersionUID = 1L;

	public Locality() {
		super();
	}   
	public int getLocalityID() {
		return this.localityID;
	}

	public void setLocalityID(int localityID) {
		this.localityID = localityID;
	}   
	public String getlocalityName() {
		return this.localityName;
	}

	public void setlocalityName(String localityName) {
		this.localityName = localityName;
	}   
	public String getlocalityAddress() {
		return this.localityAddress;
	}

	public void setlocalityAddress(String localityAddress) {
		this.localityAddress = localityAddress;
	}   
	public String getCapacity() {
		return this.capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}   
	public String getAvailability() {
		return this.availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}   
	public int getphoneNumber() {
		return this.phoneNumber;
	}

	public void setphoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Locality [localityID=" + localityID + ", localityName=" + localityName + ", localityAddress="
				+ localityAddress + ", capacity=" + capacity + ", availability=" + availability + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
   
}
