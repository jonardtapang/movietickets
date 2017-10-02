package movietickets.repository;

import movietickets.domain.model.Cinema;
import movietickets.domain.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jmtapang on 9/28/17.
 */
@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {

    //Seat findById(int seatId);

    List<Seat> findAll();

    List<Seat> findAllSeatByCinema(Cinema cinema);
}
