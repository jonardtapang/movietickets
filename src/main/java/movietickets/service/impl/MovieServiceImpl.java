package movietickets.service.impl;

import movietickets.domain.model.Movie;
import movietickets.repository.MovieRepository;
import movietickets.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jmtapang on 9/30/17.
 */
@Component
public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie findById(Long movieId) {
        return movieRepository.findByMovieId(movieId);
    }

    @Transactional(readOnly=true)
    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }


}
