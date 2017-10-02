package movietickets.service;

import movietickets.domain.model.Movie;

import java.util.List;

/**
 * Created by jmtapang on 9/30/17.
 */
public interface MovieService {

    Movie findById(Long movieId);
    List<Movie> findAll();

}
