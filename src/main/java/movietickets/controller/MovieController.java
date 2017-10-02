package movietickets.controller;

import movietickets.domain.model.Movie;
import movietickets.domain.model.Screening;
import movietickets.service.MovieService;
import movietickets.service.ScreeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by jmtapang on 9/30/17.
 */
@Controller
public class MovieController {

    private MovieService movieService;

    private ScreeningService screeningService;

    @Autowired
    public MovieController(MovieService movieService, ScreeningService screeningService) {
        this.movieService = movieService;
        this.screeningService = screeningService;
    }

    @RequestMapping(value="/", method=GET)
    public String index(Model model) {
        List<Movie> lists = movieService.findAll();
        model.addAttribute("movies",
                movieService.findAll());

        //System.out.println("lists : " + lists.get(0).getRating());

        return "index";
    }

    @RequestMapping(value="/movie/{movieId}", method=GET)
    public String showMovie(@PathVariable String movieId, Model model) {
        //model.addAttribute("movie", movieService.findById(Long.parseLong(movieId)));
        Movie movie = movieService.findById(Long.parseLong(movieId));

        model.addAttribute("screenings", screeningService.findByMovie(movie));
        model.addAttribute("movie", movieService.findById(Long.parseLong(movieId)));
        List<Screening> lists = screeningService.findByMovie(movie);
       /* System.out.println("lists : " + lists.get(0).getScreeningId());
        System.out.println("lists : " + lists.get(0).getScreenStart());
        System.out.println("lists : " + lists.get(0).getScreenEnd());
        System.out.println("lists : " + lists.get(0).getCinema().getCinemaId());
        System.out.println("lists : " + lists.get(0).getCinema().getName());
        System.out.println("lists : " + movie.getMovieName());*/

        return "viewMovie";
    }

}
