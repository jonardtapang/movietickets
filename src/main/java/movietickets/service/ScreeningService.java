package movietickets.service;

import movietickets.domain.model.Cinema;
import movietickets.domain.model.Movie;
import movietickets.domain.model.Screening;

import javax.validation.constraints.AssertFalse;
import java.util.List;

/**
 * Created by jmtapang on 9/30/17.
 */
public interface ScreeningService {

   List<Screening> findByMovie(Movie movie);

   List<Screening> findByCinema(Cinema cinema);

   List<Screening> findByCinemaAndMovie(Cinema cinema, Movie movie);
}
