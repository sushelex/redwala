package pojo;
// Generated 16 Jan, 2016 6:56:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Busdetails generated by hbm2java
 */
@Entity
@Table(name = "busdetails", uniqueConstraints = @UniqueConstraint(columnNames = "travel_id"))
public class Busdetails implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer travelId;
	private String travelName;
	private Date timing;
	private Integer seat;
	private Integer fare;

	public Busdetails() {
	}

	public Busdetails(Integer travelId, String travelName, Date timing, Integer seat, Integer fare) {
		this.travelId = travelId;
		this.travelName = travelName;
		this.timing = timing;
		this.seat = seat;
		this.fare = fare;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "travel_id", unique = true)
	public Integer getTravelId() {
		return this.travelId;
	}

	public void setTravelId(Integer travelId) {
		this.travelId = travelId;
	}

	@Column(name = "travelName", length = 20)
	public String getTravelName() {
		return this.travelName;
	}

	public void setTravelName(String travelName) {
		this.travelName = travelName;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "timing", length = 8)
	public Date getTiming() {
		return this.timing;
	}

	public void setTiming(Date timing) {
		this.timing = timing;
	}

	@Column(name = "seat")
	public Integer getSeat() {
		return this.seat;
	}

	public void setSeat(Integer seat) {
		this.seat = seat;
	}

	@Column(name = "fare")
	public Integer getFare() {
		return this.fare;
	}

	public void setFare(Integer fare) {
		this.fare = fare;
	}

}
