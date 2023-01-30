package com.javaunit3.springmvc;


//----Project Part (PP) 1- Movies- Step3-Implementing the Interface:-----------

//Create a Java class file called 'BatmanMovie' that will implement the 'Movie' Interface from Step 2 of Project Part (PP) 1

public class BatmanMovie implements Movie{
    public String getTitle(){
        return "Batman: The Dark Knight";
    }
    public String getMaturityRating(){
        return "PG-13";
    }
    public String getGenre(){
        return "Action";
    }
}
