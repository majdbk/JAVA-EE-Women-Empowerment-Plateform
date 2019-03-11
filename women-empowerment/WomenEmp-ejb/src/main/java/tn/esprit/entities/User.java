package tn.esprit.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * Entity implementation class for Entity: User
 *
 */
@MappedSuperclass
@XmlRootElement
@XmlSeeAlso(Member.class)
public class User implements Serializable {

	
	private int userID;
	private String login;
	private String password;
	private String firstname;
	private String lastname;
	private String mail;
	private String address;
	private String birthdate;
	
	private List<Participation> participations;
	

	private static final long serialVersionUID = 1L;

	public User() {
		super();
	} 

	public User(int userID, String login, String password, String firstname, String lastname, String mail,
			String address, String birthdate, List<Participation> participations) {
		super();
		this.userID = userID;
		this.login = login;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mail = mail;
		this.address = address;
		this.birthdate = birthdate;
		this.participations = participations;
	}

	
	
	
	public User(int userID, String login, String password, String firstname, String lastname, String mail,
			String address, String birthdate ) {
		super();
		this.userID = userID;
		this.login = login;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mail = mail;
		this.address = address;
		this.birthdate = birthdate;
	
		
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getuserID() {
		return this.userID;
	}
	

	public void setuserID(int userID) {
		this.userID = userID;
	}   
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}   
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}   
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}   
	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}   
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}   
	public String getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	
	
	
	
	
	
	
	
	
	

	@Override
	public String toString() {
		return "User [userID=" + userID + ", login=" + login + ", password=" + password + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", mail=" + mail + ", address=" + address + ", birthdate=" + birthdate
				+ ", participations=" + participations + "]";
	}

	
	
	
 
}
