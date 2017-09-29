package movietickets.repository;

import movietickets.domain.model.Seat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jmtapang on 9/28/17.
 */
@Repository
public interface SeatRepository extends CrudRepository<Seat, Long> {

    //Seat findById(int seatId);

    List<Seat> findAll();
}
