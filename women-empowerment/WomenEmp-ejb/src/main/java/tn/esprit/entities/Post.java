package tn.esprit.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
//import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Entity implementation class for Entity: Post
 *
 */
@Entity(name="post")
@XmlRootElement
public class Post implements Serializable {
	
	
	private int postID;
	private String subject;
	private String content;
	private String category;
	private Member member;
	private int note;
	
	private List<Comment> comments;

	private List<PostLike> postlikes ;

	
	private static final long serialVersionUID = 1L;

	public Post() {
		super();
	}   
	
	public Post(int postID, String subject, String content, String category) {
		super();
		this.postID = postID;
		this.subject = subject;
		this.content = content;
		this.category = category;
	}

	
	
	
	public Post(int postID, String subject, String content, String category, Member member, Set<Comment> comments) {
		super();
		this.postID = postID;
		this.subject = subject;
		this.content = content;
		this.category = category;
		this.member = member;
		
	}

	
	
	
	public Post(String subject, String content, String category, Member member) {
		super();
		this.subject = subject;
		this.content = content;
		this.category = category;
		this.member = member;
	}

	@Id
	@GeneratedValue
	public int getPostID() {
		return this.postID;
	}

	public void setPostID(int postID) {
		this.postID = postID;
	}   
	
	

	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "userID", nullable = false)
	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}   
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "post",cascade=CascadeType.REMOVE,orphanRemoval = true)
	public List<Comment> getComments() {
		return this.comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "post",cascade=CascadeType.REMOVE,orphanRemoval = true)
	@XmlTransient
	public List<PostLike> getPostlikes() {
		return postlikes;
	}

	public void setPostlikes(List<PostLike> postlikes) {
		this.postlikes = postlikes;
	}

	@Override
	public String toString() {
		return "Post [postID=" + postID + ", subject=" + subject + ", content=" + content + ", category=" + category
				+ "]";
	}
	
	
   
}
