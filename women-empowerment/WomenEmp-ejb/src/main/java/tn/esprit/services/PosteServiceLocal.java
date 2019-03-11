package tn.esprit.services;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.entities.Comment;
import tn.esprit.entities.Member;
import tn.esprit.entities.Post;

@Local
public interface PosteServiceLocal {
	
	
	void AjouterPost(Post post);
	void deletePost(Post post);
	Post findPost(int id);
	public List<Post> findAllPosts();
	void UpdatePost(int id);
	void AjouterComment(Comment cmt);
	void deleteComment(Comment cmt);
	public List<Comment> findComments(int id);
	Comment findOneComment(int commentID);
	public Long NombreCom(int id);
	public void likePost(Post post);
	public Boolean VerifLikePost(int postID);
	void AjouterMember(Member mem);

}
