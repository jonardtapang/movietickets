package movietickets.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "MOVIE_RESERVATIONS")
public class MovieReservations {

	@Id
	@GeneratedValue
	@Column(name = "reserve_id")
	private Long reserveId;
	
	@ManyToOne
	@JoinColumn(name = "screening_id")
	private Screening screening;
	
	@ManyToOne
	@JoinColumn(name = "seat_id")
	private Seat seat;

	public MovieReservations() {
		super();
	}

	public Long getReserveId() {
		return reserveId;
	}

	public void setReserveId(Long reserveId) {
		this.reserveId = reserveId;
	}

	public Screening getScreening() {
		return screening;
	}

	public void setScreening(Screening screening) {
		this.screening = screening;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}
}
