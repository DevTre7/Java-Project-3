package com.javaunit3.springmvc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


//Create a Class called 'MovieController' and define/ annotate it as a controller
@Controller
public class MovieController {
    //Create a method getIndexPage() with a request mapping of “/”.
    @RequestMapping("/")
    public String getIndexPage(){

        return "index";
    }

    //PP2 -Step3 - Using a Model:----
    //Create a 'getBestMoviePage()' method w/ a 'Spring Model' parameter, then set the request mapping to '/bestMovie'.
    @RequestMapping("/bestMovie")
    public String getBestMoviePage(Model model){

        TitanicMovie titanicMovie = new TitanicMovie();
        BestMovieService bestMovieService =  new BestMovieService(titanicMovie);
        model.addAttribute("BestMovie", bestMovieService.getBestMovie().getTitle());
        return "bestMovie";

    }
//--PP2 -Step5-Vote for the best movie using forms------------------------------

//Create a method called 'voteForBestMovieFormPage' w/ request mapping of 'voteForBestMovieForm'
    @RequestMapping("/voteForBestMovieForm")
    public String voteForBestMovieFormPage() {
        return "voteForBestMovie";
    }

    //Create another method, this time called 'voteForBestMovie'. This  method will handle the votes (data) submitted by the users.

    @RequestMapping("/voteForBestMovie")
    public String voteForBestMovie(HttpServletRequest request, Model model) {

        String movieTitle = request.getParameter("movieTitle");

        model.addAttribute("BestMovieVote", movieTitle);

        return "voteForBestMovie";
    }
}
