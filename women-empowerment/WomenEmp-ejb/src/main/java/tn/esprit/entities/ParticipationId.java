package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ParticipationId implements Serializable {

	private Integer idUser;
	private Integer idEvent;
	private static final long serialVersionUID = 1L;
	
	
	public ParticipationId() {
		super();
	}
	
	public ParticipationId(Integer idUser, Integer idEvent) {
		super();
		this.idUser = idUser;
		this.idEvent = idEvent;
	}

	public Integer getIdUser() {
		return idUser;
	}
	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
	public Integer getIdEvent() {
		return idEvent;
	}
	public void setIdEvent(Integer idEvent) {
		this.idEvent = idEvent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEvent == null) ? 0 : idEvent.hashCode());
		result = prime * result + ((idUser == null) ? 0 : idUser.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParticipationId other = (ParticipationId) obj;
		if (idEvent == null) {
			if (other.idEvent != null)
				return false;
		} else if (!idEvent.equals(other.idEvent))
			return false;
		if (idUser == null) {
			if (other.idUser != null)
				return false;
		} else if (!idUser.equals(other.idUser))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ParticipationId [idUser=" + idUser + ", idEvent=" + idEvent + "]";
	}
	
}
