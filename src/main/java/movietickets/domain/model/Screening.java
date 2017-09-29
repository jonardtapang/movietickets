package movietickets.domain.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Screening {

	@Id
	@GeneratedValue
	@Column(name = "screening_id")
	private Long screeningId;

	@ManyToOne
	@JoinColumn(name="cinema_id")
	private Cinema cinema;

	@ManyToOne
	@JoinColumn(name="movie_id")
	private Movie movie;

	@OneToMany(mappedBy = "screening")
	private List<MovieReservations> reservations;

	@Temporal(TemporalType.TIMESTAMP)
	private Date screenStart;

	@Temporal(TemporalType.TIMESTAMP)
	private Date screenEnd;


	public Long getScreeningId() {
		return screeningId;
	}

	public void setScreeningId(Long screeningId) {
		this.screeningId = screeningId;
	}

	public Cinema getCinema() {
		return cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public List<MovieReservations> getReservations() {
		return reservations;
	}

	public void setReservations(List<MovieReservations> reservations) {
		this.reservations = reservations;
	}

	public Date getScreenStart() {
		return screenStart;
	}

	public void setScreenStart(Date screenStart) {
		this.screenStart = screenStart;
	}

	public Date getScreenEnd() {
		return screenEnd;
	}

	public void setScreenEnd(Date screenEnd) {
		this.screenEnd = screenEnd;
	}
}
