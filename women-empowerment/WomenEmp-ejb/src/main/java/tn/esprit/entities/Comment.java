package tn.esprit.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
//import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import static javax.persistence.GenerationType.IDENTITY;




/**
 * Entity implementation class for Entity: Comment
 *
 */
@Entity
@Table(name="comment")
@XmlRootElement
public class Comment implements Serializable {

	   
	
	private int commentID;
	private Date commentDate;
	private String commentTags;
	private String commentNote;
	private static final long serialVersionUID = 1L;
	private Post post;
	private Member member;

	public Comment() {
		super();
	} 
	
	

	public Comment(int commentID, Date commentDate, String commentTags, String commentNote) {
		super();
		this.commentID = commentID;
		this.commentDate = commentDate;
		this.commentTags = commentTags;
		this.commentNote = commentNote;
		//this.post = post;
	}

	
	

	public Comment(int commentID, Date commentDate, String commentTags, String commentNote, Post post, User user) {
		super();
		this.commentID = commentID;
		this.commentDate = commentDate;
		this.commentTags = commentTags;
		this.commentNote = commentNote;
		this.post = post;
		
	}



	public Comment(Date commentDate, String commentTags, String commentNote, Post post, User user) {
		super();
		this.commentDate = commentDate;
		this.commentTags = commentTags;
		this.commentNote = commentNote;
		this.post = post;
		
	}


	
	

	public Comment(int commentID, Date commentDate, String commentTags, String commentNote, Post post, Member member) {
		super();
		this.commentID = commentID;
		this.commentDate = commentDate;
		this.commentTags = commentTags;
		this.commentNote = commentNote;
		this.post = post;
		this.member = member;
	}



	@Id
	@GeneratedValue
	public int getCommentID() {
		return this.commentID;
	}

	public void setCommentID(int commentID) {
		this.commentID = commentID;
	}   
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date", nullable = false, length = 19)
	public Date getCommentDate() {
		return this.commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}   
	public String getCommentTags() {
		return this.commentTags;
	}

	public void setCommentTags(String commentTags) {
		this.commentTags = commentTags;
	}   
	public String getCommentNote() {
		return this.commentNote;
	}

	public void setCommentNote(String commentNote) {
		this.commentNote = commentNote;
	}
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "posttID", nullable = false)
	@XmlTransient
	public Post getPost() {
		return this.post;
	}

	public void setPost(Post post) {
		this.post = post;
	}
	
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "userID", nullable = false)
	public Member getMember() {
		return member;
	}



	public void setMember(Member member) {
		this.member = member;
	}



	@Override
	public String toString() {
		return "Comment [commentID=" + commentID + ", commentDate=" + commentDate + ", commentTags=" + commentTags
				+ ", commentNote=" + commentNote + "]";
	}
   
}
