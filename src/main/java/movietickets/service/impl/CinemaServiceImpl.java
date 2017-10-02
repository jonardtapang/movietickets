package movietickets.service.impl;

import movietickets.domain.model.Cinema;
import movietickets.repository.CinemaRepository;
import movietickets.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jmtapang on 9/30/17.
 */
@Component
public class CinemaServiceImpl  implements CinemaService{

    private CinemaRepository cinemaRepository;

    @Autowired
    public CinemaServiceImpl(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }

    @Override
    public Cinema findById(Long cinemaId) {
        return cinemaRepository.findByCinemaId(cinemaId);
    }

    @Override
    public List<Cinema> findAll() {
        return cinemaRepository.findAll();
    }
}
