package tn.esprit.services;

import java.util.Date;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.entities.Comment;
import tn.esprit.entities.Member;
import tn.esprit.entities.Post;
import tn.esprit.entities.PostLike;
import tn.esprit.entities.User;

/**
 * Session Bean implementation class PosteService
 */
@Stateless
@LocalBean
public class PosteService implements PosteServiceRemote, PosteServiceLocal {


	
	
	
    public PosteService() {
        // TODO Auto-generated constructor stub
    }

    @PersistenceContext
	EntityManager entityManager;
    
    
   // private User user;

	@Override
	public void AjouterPost(Post post) {
		
		
		
		Member u=post.getMember();
		// Member u= new Member();
		 //u.setuserID(1);
		
		//Date dateobj = new Date();
		//post.setMember(u);
		entityManager.merge(u);
		entityManager.merge(post);
		
	}


	@Override
	public void deletePost(Post post) {
		entityManager.remove(entityManager.merge(post));
		
	}


	@Override
	public Post findPost(int postID) {
		return entityManager.find(Post.class, postID);
	}


	@Override
	public List<Post> findAllPosts() {
		return entityManager.createQuery
				("select l from post l",
				Post.class)
				.getResultList();
	}


	@Override
	public void UpdatePost(int id) {
		
		
	}


	@Override
	public void AjouterComment(Comment cmt) {
		
		 Member u= new Member();
		 u.setuserID(1);
		 
		 Post p = new Post();
		 p.setPostID(1);
		
		Date dateobj = new Date();
		
		cmt.setCommentDate(dateobj);
		cmt.setMember(u);
		cmt.setPost(p);
		
		entityManager.merge(cmt);
		
		
	}


	@Override
	public void deleteComment(Comment cmt) {
		entityManager.remove(entityManager.merge(cmt));
		
	}


	@Override
	public List<Comment> findComments(int id) {
		return entityManager.createQuery
				("select l from Comment l where l.post.postID =:cur ORDER BY l.commentDate DESC",
				Comment.class)
				.setParameter("cur", id)
				.getResultList();
	}


	@Override
	public Comment findOneComment(int commentID) {
		return entityManager.find(Comment.class, commentID);
	}


	@Override
	public Long NombreCom(int id) {
		Long a= entityManager.createQuery
				("select COUNT(l.commentID) from Comment l where l.post.postID =:cur",
				Long.class)
				.setParameter("cur", id)
				.getSingleResult();
		return a;
	}


	@Override
	public void likePost(Post post) {
		
		PostLike pl = new PostLike ();
		
		
		Member u= new Member();
		 u.setuserID(1);
		
		int a=post.getNote();
		int b= a+1;
		post.setNote(b);
		entityManager.merge(post);
		
		pl.setMember(u);
		pl.setPost(post);
		entityManager.merge(pl);
		
	}


	@Override
	public Boolean VerifLikePost(int postID) {
		
		
		 Member u= new Member();
		 u.setuserID(1);
		 
		String requete="select COUNT(e.likeID) from postLike e where e.member.userID=:x "
				+ "and e.post.postID =:y";
		
		Long a=entityManager.createQuery(requete,Long.class)
		.setParameter("x", u.getuserID())
		.setParameter("y", postID)
		.getSingleResult();
			
			if (a>=1) return true;
			else return false;
	}


	@Override
	public void AjouterMember(Member mem) {
		entityManager.merge(mem);
		
	}

	
	
}
