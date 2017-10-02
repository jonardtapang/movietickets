package movietickets.service;

import movietickets.domain.model.Cinema;
import movietickets.domain.model.Seat;

import java.util.List;

/**
 * Created by jmtapang on 10/1/17.
 */
public interface SeatService {

    List<Seat> findByCinema(Cinema cinema);
}
