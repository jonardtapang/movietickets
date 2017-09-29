package movietickets.repository;

import movietickets.domain.model.MovieReservations;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jmtapang on 9/28/17.
 */
@Repository
public interface ReservationRepository extends CrudRepository<MovieReservations, Long> {
}
