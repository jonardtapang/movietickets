package movietickets.domain.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "CINEMA")
public class Cinema {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cinema_id")
	private Long cinemaId;

	@Column(name = "cinema_name")
	private String name;

	@Column(name = "available_seats")
	private Long availableSeats;
	
	@OneToMany(mappedBy="cinema")
	@JsonManagedReference
	private List<Seat> seats;

	@OneToMany(mappedBy = "cinema")
	private List<Screening> screening;

	public Cinema() {
	}

	public Cinema(String name, Long availableSeats, List<Seat> seats) {
		this.name = name;
		this.availableSeats = availableSeats;
		this.seats = seats;
	}

	public Long getCinemaId() {
		return cinemaId;
	}

	public void setCinemaId(Long cinemaId) {
		this.cinemaId = cinemaId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(Long availableSeats) {
		this.availableSeats = availableSeats;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
}
