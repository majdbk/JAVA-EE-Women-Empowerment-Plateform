package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;



@Entity(name="womantraining")
@Table
@XmlRootElement
public class WomanTraining implements Serializable {

	
	private int id;
	private Date participationDate;
	private String etat;
	private static final long serialVersionUID = 1L;
	private Women women;
	private Training training;

	public WomanTraining() {
		// TODO Auto-generated constructor stub
	}

	public WomanTraining(Date participationDate, String etat, Women women, Training training) {
		super();
		this.participationDate = participationDate;
		this.etat = etat;
		this.women = women;
		this.training = training;
	}

	
	
	@Id
	@GeneratedValue(strategy = GenerationType. IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date", nullable = false, length = 19)
	public Date getParticipationDate() {
		return participationDate;
	}

	public void setParticipationDate(Date participationDate) {
		this.participationDate = participationDate;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}
	

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "userID", nullable = false)
	public Women getWomen() {
		return women;
	}

	public void setWomen(Women women) {
		this.women = women;
	}

	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "trainingID", nullable = false)
	public Training getTraining() {
		return training;
	}

	public void setTraining(Training training) {
		this.training = training;
	}

	@Override
	public String toString() {
		return "WomanTraining [id=" + id + ", participationDate=" + participationDate + ", etat=" + etat + ", women="
				+ women + ", training=" + training + "]";
	}

	
	
	
	
}
