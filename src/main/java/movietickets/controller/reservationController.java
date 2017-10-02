package movietickets.controller;

import movietickets.domain.model.Cinema;
import movietickets.domain.model.Movie;
import movietickets.domain.model.Screening;
import movietickets.domain.model.Seat;
import movietickets.service.CinemaService;
import movietickets.service.MovieService;
import movietickets.service.ScreeningService;
import movietickets.service.SeatService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by jmtapang on 9/30/17.
 */
@Controller
public class ReservationController {

    private MovieService movieService;

    private ScreeningService screeningService;

    private CinemaService cinemaService;

    private SeatService seatService;

    public ReservationController(MovieService movieService,
                                 ScreeningService screeningService,
                                 CinemaService cinemaService,
                                 SeatService seatService) {
        this.movieService = movieService;
        this.screeningService = screeningService;
        this.cinemaService = cinemaService;
        this.seatService = seatService;
    }

    @RequestMapping(value="/movie/reserve-seats/{movieId}", method=GET)
    public String reserveSeat(@PathVariable String movieId, Model model) {
        Movie movie = movieService.findById(Long.parseLong(movieId));

        model.addAttribute("screenings", screeningService.findByMovie(movie));
        model.addAttribute("movie", movieService.findById(Long.parseLong(movieId)));
        List<Screening> lists = screeningService.findByMovie(movie);

        System.out.println("lists : " + lists.get(0).getScreeningId());
        System.out.println("lists : " + lists.get(0).getScreenStart());
        System.out.println("lists : " + lists.get(0).getScreenEnd());
        System.out.println("lists : " + lists.get(0).getCinema().getCinemaId());
        System.out.println("lists : " + lists.get(0).getCinema().getName());
        System.out.println("lists : " + movie.getMovieName());

        Set<Cinema> setSource = new LinkedHashSet<Cinema>();
        for(Screening screening:lists){
            setSource.add(screening.getCinema());
        }
        model.addAttribute("cinemas", setSource);
        return "reservation";
    }

    @RequestMapping(value="/movie/reserve-seats/{movieId}/{cinemaId}", method=RequestMethod.GET,produces = "application/json")
    @ResponseBody
    public List<Screening> screeningBy(@PathVariable("movieId") String movieId,
                                       @PathVariable("cinemaId") String cinemaId,
                                       Model model) {
        Cinema cinema = cinemaService.findById(Long.parseLong(cinemaId));
        Movie movie = movieService.findById(Long.parseLong(movieId));

        System.out.println("cinema : " + cinema.getName());
        model.addAttribute("screenings", screeningService.findByCinema(cinema));
        List<Screening> lists = screeningService.findByCinemaAndMovie(cinema, movie);
       //List<Seat> seats = seatService.findByCinema(cinema);

        System.out.println("lists size : " + lists.size());

        return lists;
    }

}
