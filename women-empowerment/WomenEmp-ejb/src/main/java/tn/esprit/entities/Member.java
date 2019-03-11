package tn.esprit.entities;

import java.io.Serializable;
import java.lang.String;
import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import tn.esprit.entities.User;

/**
 * Entity implementation class for Entity: Member
 *
 */
@Entity
@Table(name="member")
@XmlRootElement
public class Member extends User implements Serializable {

	
	private int phoneNumber;
	private String memberOccupation;
	private Date subscriptionDate;
	private Set<Post> posts = new HashSet<Post>(0);
	private Set<Comment> comments = new HashSet<Comment>(0);
	private List<PostLike> postlikes ;
	private static final long serialVersionUID = 1L;

	public Member() {
		super();
	}   
	
	
	
	
	public Member(int phoneNumber, String memberOccupation, Date subscriptionDate) {
		super();
		this.phoneNumber = phoneNumber;
		this.memberOccupation = memberOccupation;
		this.subscriptionDate = subscriptionDate;
	}



	
	

	public int getphoneNumber() {
		return this.phoneNumber;
	}

	public void setphoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}   
	public String getmemberOccupation() {
		return this.memberOccupation;
	}

	public void setmemberOccupation(String memberOccupation) {
		this.memberOccupation = memberOccupation;
	}   
	public Date getSubscriptionDate() {
		return this.subscriptionDate;
	}

	public void setSubscriptionDate(Date subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}
	
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "member")
	@XmlTransient
	public Set<Post> getPosts() {
		return posts;
	}

	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}
	
	
	
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "member")
	@XmlTransient
	public Set<Comment> getComments() {
		return comments;
	}




	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}



	@OneToMany(fetch = FetchType.EAGER, mappedBy = "member",cascade=CascadeType.REMOVE,orphanRemoval = true)
	@XmlTransient
	public List<PostLike> getPostlikes() {
		return postlikes;
	}




	public void setPostlikes(List<PostLike> postlikes) {
		this.postlikes = postlikes;
	}




	@Override
	public String toString() {
		return "Member [phoneNumber=" + phoneNumber + ", memberOccupation=" + memberOccupation + ", subscriptionDate=" + subscriptionDate + "]";
	}
   
}
