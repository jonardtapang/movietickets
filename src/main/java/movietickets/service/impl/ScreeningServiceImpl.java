package movietickets.service.impl;

import movietickets.domain.model.Cinema;
import movietickets.domain.model.Movie;
import movietickets.domain.model.Screening;
import movietickets.repository.ScreeningRepository;
import movietickets.service.ScreeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jmtapang on 9/30/17.
 */
@Component
public class ScreeningServiceImpl implements ScreeningService {

    private ScreeningRepository screeningRepository;

    @Autowired
    public ScreeningServiceImpl(ScreeningRepository screeningRepository) {
        this.screeningRepository = screeningRepository;
    }

    @Override
    public List<Screening> findByMovie(Movie movie) {
        return screeningRepository.findAllScreeningByMovie(movie);
    }

    @Override
    public List<Screening> findByCinema(Cinema cinema) {
        return screeningRepository.findAllScreeningByCinema(cinema);
    }

    @Override
    public List<Screening> findByCinemaAndMovie(Cinema cinema, Movie movie) {
        return screeningRepository.findAllScreeningByCinemaAndMovie(cinema, movie);
    }
}
