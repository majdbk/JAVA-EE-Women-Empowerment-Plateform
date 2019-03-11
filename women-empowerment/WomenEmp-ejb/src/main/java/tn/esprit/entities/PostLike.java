package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name="postLike")
@XmlRootElement
public class PostLike implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int likeID;

	private Member member;
	private Post post;
	
	public PostLike() {
		
		// TODO Auto-generated constructor stub
	}
	public PostLike(int likeID, Member member, Post post) {
		super();
		this.likeID = likeID;
		this.member = member;
		this.post = post;
	}
	
	@Id
	@GeneratedValue
	public int getLikeID() {
		return likeID;
	}
	public void setLikeID(int likeID) {
		this.likeID = likeID;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "userID", nullable = false)
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "postID", nullable = false)
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	@Override
	public String toString() {
		return "PostLike [likeID=" + likeID + ", member=" + member + ", post=" + post + "]";
	}

	
	

}
