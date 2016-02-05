package pojo;
// Generated 16 Jan, 2016 6:56:45 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "travel")
public class Travel implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer travelId;
	private String sourc;
	private String destination;
	private Integer distance;

	public Travel() 
	{
	}

	public Travel(String sourc, String destination, Integer distance) 
	{
		this.sourc = sourc;
		this.destination = destination;
		this.distance = distance;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "travel_id", nullable = false)
	public Integer getTravelId() 
	{
		return this.travelId;
	}

	public void setTravelId(Integer travelId) {
		this.travelId = travelId;
	}

	@Column(name = "sourc", length = 12)
	public String getSourc() {
		return this.sourc;
	}

	public void setSourc(String sourc) {
		this.sourc = sourc;
	}

	@Column(name = "destination", length = 12)
	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Column(name = "distance")
	public Integer getDistance() {
		return this.distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

}
