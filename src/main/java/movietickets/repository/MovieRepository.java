package movietickets.repository;

import movietickets.domain.model.Cinema;
import movietickets.domain.model.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jmtapang on 9/28/17.
 */
@Repository
public interface MovieRepository  extends CrudRepository<Movie, Long> {

    //Movie findById(int movieId);

    List<Movie> findAll();

}
