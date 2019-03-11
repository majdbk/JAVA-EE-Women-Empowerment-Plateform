package tn.esprit.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entity implementation class for Entity: Women
 *
 */
@Entity(name="women")
@Table(name="woman")
@XmlRootElement
public class Women extends User implements Serializable {
	
	private int CIN;
	private Date subscriptionDate;
	private String womenDegree;
	private String womenProblem;
	private String personStatus;
	private String children;
	private int phoneNumber;
	private String fileStatus;
	private static final long serialVersionUID = 1L;
	//private List<Training> trainings;
	private List<Review> reviews ;
	private List<WomanTraining> womantraining ;
	
	
	
	public Women() {
		super();
	}   
	
	
	
	
	public Women(int cIN, Date subscriptionDate, String womenDegree, String womenProblem, String personStatus,
			String children, int phoneNumber, String fileStatus) {
		super();
		CIN = cIN;
		this.subscriptionDate = subscriptionDate;
		this.womenDegree = womenDegree;
		this.womenProblem = womenProblem;
		this.personStatus = personStatus;
		this.children = children;
		this.phoneNumber = phoneNumber;
		this.fileStatus = fileStatus;
	}


	
	


	public int getCIN() {
		return this.CIN;
	}

	public void setCIN(int CIN) {
		this.CIN = CIN;
	}   
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date", nullable = false, length = 19)
	public Date getSubscriptionDate() {
		return this.subscriptionDate;
	}

	public void setSubscriptionDate(Date subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}   
	public String getwomenDegree() {
		return this.womenDegree;
	}

	public void setwomenDegree(String womenDegree) {
		this.womenDegree = womenDegree;
	}   
	public String getwomenProblem() {
		return this.womenProblem;
	}

	public void setwomenProblem(String womenProblem) {
		this.womenProblem = womenProblem;
	}   
	public String getPersonStatus() {
		return this.personStatus;
	}

	public void setPersonStatus(String personStatus) {
		this.personStatus = personStatus;
	}   
	public String getChildren() {
		return this.children;
	}

	public void setChildren(String children) {
		this.children = children;
	}   
	public int getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}   
	public String getFileStatus() {
		return this.fileStatus;
	}

	public void setFileStatus(String fileStatus) {
		this.fileStatus = fileStatus;
	}
	
	
	
	
	//@ManyToMany(fetch = FetchType.EAGER)
	//@JoinTable(name = "womanTraining", joinColumns = {
		//	@JoinColumn(name = "woman_id", nullable = false, updatable = false) }, inverseJoinColumns = {
			//		@JoinColumn(name = "training_id", nullable = false, updatable = false) })
	//public List<Training> getTrainings() {
	//	return trainings;
	//}




//	public void setTrainings(List<Training> trainings) {
	//	this.trainings = trainings;
	//}



	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "women")
	public List<Review> getReviews() {
		return reviews;
	}




	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}



	
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "women")
	public List<WomanTraining> getWomantraining() {
		return womantraining;
	}




	public void setWomantraining(List<WomanTraining> womantraining) {
		this.womantraining = womantraining;
	}




	@Override
	public String toString() {
		return "Women [CIN=" + CIN + ", subscriptionDate=" + subscriptionDate + ", womenDegree=" + womenDegree + ", womenProblem="
				+ womenProblem + ", personStatus=" + personStatus + ", children=" + children + ", phoneNumber=" + phoneNumber
				+ ", fileStatus=" + fileStatus + "]";
	}
   
}
