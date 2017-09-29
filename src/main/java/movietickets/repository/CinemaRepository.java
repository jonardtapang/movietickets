package movietickets.repository;

import movietickets.domain.model.Cinema;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by jmtapang on 9/28/17.
 */
@Repository
public interface CinemaRepository extends CrudRepository<Cinema, Long> {

    //Cinema findById(int cinemaId);

    List<Cinema> findAll();

}
