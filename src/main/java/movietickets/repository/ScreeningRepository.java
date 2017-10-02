package movietickets.repository;

import movietickets.domain.model.Cinema;
import movietickets.domain.model.Movie;
import movietickets.domain.model.Screening;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jmtapang on 9/28/17.
 */
@Repository
public interface ScreeningRepository extends JpaRepository<Screening, Long> {

    //Screening screeningId(int screenId);

    List<Screening> findAll();

    List<Screening> findAllScreeningByMovie(Movie movie);

    List<Screening> findAllScreeningByCinema(Cinema cinema);

    List<Screening> findAllScreeningByCinemaAndMovie(Cinema cinema, Movie movie);
}
