package movietickets.service.impl;

import movietickets.domain.model.Cinema;
import movietickets.domain.model.Seat;
import movietickets.repository.SeatRepository;
import movietickets.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jmtapang on 10/1/17.
 */
@Component
public class SeatServiceImpl implements SeatService{

    private SeatRepository seatRepository;

    @Autowired
    public SeatServiceImpl(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    @Override
    public List<Seat> findByCinema(Cinema cinema) {
        return seatRepository.findAllSeatByCinema(cinema);
    }
}
