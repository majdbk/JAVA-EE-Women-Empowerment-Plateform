package tn.esprit.services;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.entities.Comment;
import tn.esprit.entities.Member;
import tn.esprit.entities.Post;

@Remote
public interface PosteServiceRemote {
	
	
	
	void AjouterPost(Post post);
	void AjouterMember(Member mem);
	void UpdatePost(int id);
	void deletePost(Post post);
	Post findPost(int id);
	public List<Post> findAllPosts();
	void AjouterComment(Comment cmt);
	void deleteComment(Comment cmt);
	public List<Comment> findComments(int id);
	Comment findOneComment(int commentID);
	public Long NombreCom(int id);
	public void likePost(Post post);
	public Boolean VerifLikePost(int postID);
	
	
	
	

}
