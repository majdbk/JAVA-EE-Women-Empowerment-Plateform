package tn.esprit.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Event
 *
 */
@Entity(name="event")
public class Event implements Serializable {	   
	
	
	private int eventID;
	private String eventName;
	private String eventType;
	private String eventSubject;
	
	private List<Participation> participations;
	private static final long serialVersionUID = 1L;

	public Event() {
		super();
	}  
	
	public Event(int eventID, String eventName, String eventType, String eventSubject,
			List<Participation> participations) {
		super();
		this.eventID = eventID;
		this.eventName = eventName;
		this.eventType = eventType;
		this.eventSubject = eventSubject;
		this.participations = participations;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getEventID() {
		return this.eventID;
	}

	public void setEventID(int eventID) {
		this.eventID = eventID;
	}  
	
	
	public String geteventName() {
		return this.eventName;
	}

	public void seteventName(String eventName) {
		this.eventName = eventName;
	}   
	public String geteventType() {
		return this.eventType;
	}

	public void seteventType(String eventType) {
		this.eventType = eventType;
	}   
	public String geteventSubject() {
		return this.eventSubject;
	}

	public void seteventSubject(String eventSubject) {
		this.eventSubject = eventSubject;
	}
	
	
	@OneToMany(mappedBy="event")
	public List<Participation> getParticipations() {
		return participations;
	}

	public void setParticipations(List<Participation> participations) {
		this.participations = participations;
	}

	@Override
	public String toString() {
		return "Event [eventID=" + eventID + ", eventName=" + eventName + ", eventType=" + eventType + ", eventSubject="
				+ eventSubject + ", participations=" + participations + "]";
	}
	
}
