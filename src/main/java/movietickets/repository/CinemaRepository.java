package movietickets.repository;

import movietickets.domain.model.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jmtapang on 9/28/17.
 */
@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long> {

    Cinema findByCinemaId(Long cinemaId);

    List<Cinema> findAll();

}
