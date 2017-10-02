package movietickets.domain.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Seat {

	@Id
	@GeneratedValue
	@Column(name = "seat_id")
	private Long seatId;

	@Column(name = "seat_name")
	private String seatName;
	
	@ManyToOne
	@JoinColumn(name = "cinema_id")
	@JsonBackReference
	private Cinema cinema;

	@OneToMany(mappedBy = "seat")
	private List<MovieReservations> reservations;

	public Long getSeatId() {
		return seatId;
	}

	public void setSeatId(Long seatId) {
		this.seatId = seatId;
	}

	public String getSeatName() {
		return seatName;
	}

	public void setSeatName(String seatName) {
		this.seatName = seatName;
	}

	public Cinema getCinema() {
		return cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

	public List<MovieReservations> getReservations() {
		return reservations;
	}

	public void setReservations(List<MovieReservations> reservations) {
		this.reservations = reservations;
	}
}
