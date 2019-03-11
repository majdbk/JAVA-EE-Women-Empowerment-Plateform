package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Participation
 *
 */
@Entity
public class Participation implements Serializable {

	
	private ParticipationId participationID;
	private float ticketPrice;
	private Date participationDate;
	private User user;
	private Event event;
	private static final long serialVersionUID = 1L;

	public Participation() {
		super();
	}
	
	
	@EmbeddedId
	public ParticipationId getParticipationID() {
		return this.participationID;
	}

	public void setParticipationID(ParticipationId participationID) {
		this.participationID = participationID;
	}   
	public float getTicketPrice() {
		return this.ticketPrice;
	}

	public void setTicketPrice(float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	@Temporal(TemporalType.DATE)
	public Date getParticipationDate() {
		return this.participationDate;
	}

	public void setParticipationDate(Date participationDate) {
		this.participationDate = participationDate;
	}
	
	
	
	@ManyToOne
	@JoinColumn(name = "idEvent", referencedColumnName = "eventID", updatable = false, insertable = false)
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	  
}
