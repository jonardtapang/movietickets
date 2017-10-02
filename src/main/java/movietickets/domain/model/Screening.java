package movietickets.domain.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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
	@Column(name = "screen_id")
	private Long screeningId;

	@ManyToOne
	@JoinColumn(name="cinema_id")
	private Cinema cinema;

	@ManyToOne
	@JoinColumn(name="movie_id")
	@JsonBackReference
	private Movie movie;

	@OneToMany(mappedBy = "screening")
	@JsonManagedReference
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Screening screening = (Screening) o;

		if (screeningId != null ? !screeningId.equals(screening.screeningId) : screening.screeningId != null)
			return false;
		if (cinema != null ? !cinema.equals(screening.cinema) : screening.cinema != null) return false;
		if (movie != null ? !movie.equals(screening.movie) : screening.movie != null) return false;
		if (reservations != null ? !reservations.equals(screening.reservations) : screening.reservations != null)
			return false;
		if (screenStart != null ? !screenStart.equals(screening.screenStart) : screening.screenStart != null)
			return false;
		return screenEnd != null ? screenEnd.equals(screening.screenEnd) : screening.screenEnd == null;

	}

	@Override
	public int hashCode() {
		int result = screeningId != null ? screeningId.hashCode() : 0;
		result = 31 * result + (cinema != null ? cinema.hashCode() : 0);
		result = 31 * result + (movie != null ? movie.hashCode() : 0);
		result = 31 * result + (reservations != null ? reservations.hashCode() : 0);
		result = 31 * result + (screenStart != null ? screenStart.hashCode() : 0);
		result = 31 * result + (screenEnd != null ? screenEnd.hashCode() : 0);
		return result;
	}
}
