package movietickets.controller;

import movietickets.domain.model.Cinema;
import movietickets.domain.model.Movie;
import movietickets.domain.model.Screening;
import movietickets.domain.model.Seat;
import movietickets.service.CinemaService;
import movietickets.service.SeatService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by jmtapang on 10/1/17.
 */
@Controller
public class SeatController {

    private SeatService seatService;

    private CinemaService cinemaService;

    public SeatController(SeatService seatService, CinemaService cinemaService) {
        this.seatService = seatService;
        this.cinemaService = cinemaService;
    }

    @RequestMapping(value="/movie/seats/{cinemaId}", method= RequestMethod.GET,produces = "application/json")
    @ResponseBody
    public List<Seat> seatsByCinema(@PathVariable("cinemaId") String cinemaId,
                                       Model model) {
        Cinema cinema = cinemaService.findById(Long.parseLong(cinemaId));

        System.out.println("cinema : " + cinema.getName());
        model.addAttribute("seats", seatService.findByCinema(cinema));
        List<Seat> seats = seatService.findByCinema(cinema);

        System.out.println("lists size : " + seats.size());

        return seats;
    }
}
