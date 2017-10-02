package movietickets.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@Controller
public class ControllerAdvice {

    @ExceptionHandler(NoHandlerFoundException.class)
    public String handle(Exception ex) {
        return "redirect:/404";
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String processMethodNotSupportedException(Exception exception) {
        exception.printStackTrace();
        return "error";
    }

    @ExceptionHandler(RuntimeException.class)
    public String processRuntimeException(RuntimeException exception) {
        exception.printStackTrace();
        return "error";
    }

    @RequestMapping(value = {"/404"}, method = RequestMethod.GET)
    public String NotFoundPage() {
        return "404";

    }
}