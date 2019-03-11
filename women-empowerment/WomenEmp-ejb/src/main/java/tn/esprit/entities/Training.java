package tn.esprit.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entity implementation class for Entity: Training
 *
 */
@Entity(name="training")
@Table(name="training")
@XmlRootElement
public class Training implements Serializable {
   
	
	private int trainingID;
	private String trainingSubject;
	private String trainingType;
	private Date trainingDate;
	private String trainer;
	private String trainingPlace;
	private static final long serialVersionUID = 1L;
	
	//private List<Women> womens;
	private List<Review> reviews ;
	private List<WomanTraining> womantraining ;

	public Training() {
		super();
	}   
	


	public Training(int trainingID, String trainingSubject, String trainingType, Date trainingDate, String trainer,
			String trainingPlace) {
		super();
		this.trainingID = trainingID;
		this.trainingSubject = trainingSubject;
		this.trainingType = trainingType;
		this.trainingDate = trainingDate;
		this.trainer = trainer;
		this.trainingPlace = trainingPlace;
	}


	
	
	

	public Training(String trainingSubject, String trainingType, Date trainingDate, String trainer,
			String trainingPlace) {
		super();
		this.trainingSubject = trainingSubject;
		this.trainingType = trainingType;
		this.trainingDate = trainingDate;
		this.trainer = trainer;
		this.trainingPlace = trainingPlace;
	}



	@Id
	@GeneratedValue
	public int getTrainingID() {
		return this.trainingID;
	}

	public void setTrainingID(int trainingID) {
		this.trainingID = trainingID;
	}   
	public String gettrainingSubject() {
		return this.trainingSubject;
	}

	public void settrainingSubject(String trainingSubject) {
		this.trainingSubject = trainingSubject;
	}
	public String getTrainingType() {
		return trainingType;
	}
	public void setTrainingType(String trainingType) {
		this.trainingType = trainingType;
	}
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date", nullable = false, length = 19)
	public Date getTrainingDate() {
		return trainingDate;
	}




	public void setTrainingDate(Date trainingDate) {
		this.trainingDate = trainingDate;
	}




	public String getTrainer() {
		return trainer;
	}




	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}




	public String getTrainingPlace() {
		return trainingPlace;
	}




	public void setTrainingPlace(String trainingPlace) {
		this.trainingPlace = trainingPlace;
	}

	
	


//	@ManyToMany(fetch = FetchType.EAGER)
	//@JoinTable(name = "womanTraining", joinColumns = {
			//@JoinColumn(name = "training_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					//@JoinColumn(name = "woman_id", nullable = false, updatable = false) })
	//public List<Women> getWomens() {
	//	return womens;
//	}




	//public void setWomens(List<Women> womens) {
	//	this.womens = womens;
	//}



	@OneToMany(fetch = FetchType.EAGER, mappedBy = "training")
	public List<Review> getReviews() {
		return reviews;
	}



	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}


	@OneToMany(fetch = FetchType.EAGER, mappedBy = "training")
	public List<WomanTraining> getWomantraining() {
		return womantraining;
	}



	public void setWomantraining(List<WomanTraining> womantraining) {
		this.womantraining = womantraining;
	}



	@Override
	public String toString() {
		return "Training [trainingID=" + trainingID + ", trainingSubject=" + trainingSubject + ", trainingType=" + trainingType + "]";
	}
	
   
}
