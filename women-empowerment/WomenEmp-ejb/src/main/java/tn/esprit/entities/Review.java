package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;


@Entity(name="review")
@XmlRootElement
public class Review implements Serializable {

	/**
	 * 
	 */
	
	private int reviewID;
	private String review;
	private Date reviewDate;
	private Women women;
	private Training training;
	private static final long serialVersionUID = 1L;

	public Review() {
		// TODO Auto-generated constructor stub
	}

	public Review(String review, Date reviewDate, Women women, Training training) {
		super();
		this.review = review;
		this.reviewDate = reviewDate;
		this.women = women;
		this.training = training;
	}

	
	@Id
	@GeneratedValue
	public int getReviewID() {
		return reviewID;
	}

	public void setReviewID(int reviewID) {
		this.reviewID = reviewID;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public Date getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
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
		return "Review [reviewID=" + reviewID + ", review=" + review + ", reviewDate=" + reviewDate + ", women=" + women
				+ ", training=" + training + "]";
	}

	
	
	
	
	
}
