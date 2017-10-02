package movietickets.service;

import movietickets.domain.model.Cinema;

import java.util.List;

/**
 * Created by jmtapang on 9/30/17.
 */
public interface CinemaService {

    Cinema findById(Long cinemaId);
    List<Cinema> findAll();
}
