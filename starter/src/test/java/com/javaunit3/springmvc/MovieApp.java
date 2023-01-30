package com.javaunit3.springmvc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//----Project Part (PP) 1- Movies- Step5-Print out the Best Movie:-----------
@ComponentScan
public class MovieApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MovieApp.class);

        //Use the application context to get the best movie service
        BestMovieService bestMovieService = applicationContext.getBean("bestMovieService", BestMovieService.class);

        //Get the best movie, by using the 'bestMovieService'
        Movie bestMovie = bestMovieService.getBestMovie();

        //Print out the title, maturity rating, and genre of the 'bestMovie'
        System.out.println("Title: " + bestMovie.getTitle());
        System.out.println("Maturity Rating: " + bestMovie.getMaturityRating());
        System.out.println("Genre: " + bestMovie.getGenre());

    }
}
