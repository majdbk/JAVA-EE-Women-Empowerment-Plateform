package tn.esprit.entities;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Donation
 *
 */
@Entity(name="donation")

public class Donation implements Serializable {
   
	@Id
	@GeneratedValue
	private int donationID;
	private float donationAmount;
	private Date donationDate;
	private static final long serialVersionUID = 1L;

	public Donation() {
		super();
	}   
	public int getDonationID() {
		return this.donationID;
	}

	public void setDonationID(int donationID) {
		this.donationID = donationID;
	}   
	public float getAmount() {
		return this.donationAmount;
	}

	public void setAmount(float donationAmount) {
		this.donationAmount = donationAmount;
	}   
	public Date getDonationDate() {
		return this.donationDate;
	}

	public void setDonationDate(Date donationDate) {
		this.donationDate = donationDate;
	}
	@Override
	public String toString() {
		return "Donation [donationID=" + donationID + ", donationAmount=" + donationAmount + ", donationDate=" + donationDate + "]";
	}
   
}
