package com.javaunit3.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//----Project Part (PP) 1- Movies- Step4- Creating the BestMovieService:-----------

//Define the 'BestMovieClass' as a Spring component thus making it availible in the Spring Application context
//Use Spring Annotations
@Component
public class BestMovieService {
    private Movie movie;

    @Autowired
    public BestMovieService(@Qualifier("titanicMovie")Movie movie) {
        this.movie = movie;
    }

    //Define the 'getBestMovie()' method that returns the movie
    public Movie getBestMovie(){
        return movie;
    }


}
