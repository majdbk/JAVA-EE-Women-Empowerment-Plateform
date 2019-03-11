package tn.esprit.restServies;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import tn.esprit.entities.Comment;
import tn.esprit.entities.Member;
import tn.esprit.entities.Post;
import tn.esprit.services.PosteServiceLocal;


@Stateless
@Path("/Post")
public class PostRessoures {
	
	
	@EJB
	PosteServiceLocal myService;
	
	
	@POST
	@Path("/add")
	@Consumes("application/json")
	public String AddPoste (Post p){
		
		myService.AjouterPost(p);
			
			return "saye";
		
	
		
	}
	
	@POST
	@Path("/addmem")
	@Consumes("application/json")
	public String AddMember (Member mem){
		
		myService.AjouterMember(mem);;
			
			return "saye";
		
	
		
	}
	
	
	@GET
	@Path(value="get/{id}")
	@Produces("application/xml")
	public Post GetPoste (@PathParam(value="id") int id){
		
		//List<Post> post = new ArrayList<Post>();
		Post post;
		
		post= myService.findPost(id);
			//Member m = post.getMember();
			//return String.valueOf(m.getphoneNumber());
			return post;
			
		
	}
	
	
	
	@GET
	@Path(value="getall")
	@Produces("application/json")
	public List<Post> GetAllPoste (){
		
		List<Post> posts = new ArrayList<Post>();
	
		
		posts= myService.findAllPosts();
		
		return posts;
		
		
		
	}
	
	@DELETE
	@Path(value="delete/{id}")
	@Produces("application/xml")
	public String DeletePost (@PathParam(value="id") int id){
		
		//List<Post> post = new ArrayList<Post>();
		Post post;
		
		post= myService.findPost(id);
		
		myService.deletePost(post);
			return "tfasakh";
		
	}
	
	
	@PUT
	@Path("update/{id}")
	@Produces("application/xml")
	public String UpdatePostee (@PathParam(value="id") int id,
			                     @QueryParam(value = "subject") String subject,
			                     @QueryParam(value = "content") String content,
			                     @QueryParam(value = "category") String category){
		
		
        Post post;
		
		post= myService.findPost(id);
		post.setCategory(category);
		post.setContent(content);
		post.setSubject(subject);
		
		myService.AjouterPost(post);
			
			return "updated";
		
			
	}
	
	
	
	/////////partie comments////////
	
	
	
	@POST
	@Path("/addCom")
	@Consumes("application/xml")
	public String AddComment (Comment cmt){
		
		myService.AjouterComment(cmt);
			
			return "saye";
			
	}
	
	
	
	@DELETE
	@Path(value="deleteCom/{id}")
	@Produces("application/xml")
	public String DeleteComment (@PathParam(value="id") int id){
		
		//List<Post> post = new ArrayList<Post>();
		Comment cmt;
		
		cmt= myService.findOneComment(id);
		
		myService.deleteComment(cmt);
			return "tfasakh";
		
	}
	
	@GET
	@Path(value="getCom/{id}")
	@Produces("application/xml")
	public List<Comment> GetComments (@PathParam(value="id") int id){
		
		List<Comment> comments = new ArrayList<Comment>();
	
		
		comments= myService.findComments(id);
		
		return comments;
			
	}
	
	
	
	@GET
	@Path(value="getNumber/{id}")
	@Produces("application/xml")
	public String GetNumberCom (@PathParam(value="id") int id){
		
		
	   Long a;
		
		a= myService.NombreCom(id);
		
		//return a;
		String myString = Long.toString(a);
		return myString;
			
	}
	
	@POST
	@Path(value="like/{id}")
	@Produces("application/xml")
	public String LikePost (@PathParam(value="id") int id){
		
		//List<Post> post = new ArrayList<Post>();
		Post post;
		
		post= myService.findPost(id);
		
		Boolean bool = myService.VerifLikePost(id);
		if (bool==false) {
			
			myService.likePost(post);
			return "liked!";
			
		}
		else{
			return "already liked";
			
		}
		
		
			
		
	}
	
}
