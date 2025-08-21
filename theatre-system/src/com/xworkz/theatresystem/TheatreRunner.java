package com.xworkz.theatresystem;

import com.xworkz.theatresystem.movie.Movie;
import com.xworkz.theatresystem.theatre.Theatre;

public class TheatreRunner {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setMovieId(501);
        movie.setMovieName("RRR");
        movie.setGenre("Action/Drama");
        movie.setDirector("S. S. Rajamouli");
        movie.setDuration(180);
        movie.setTicketPrice(250.0);

        Theatre theatre = new Theatre();
        theatre.setMovie(movie);

        boolean details = theatre.getMovieData();
        System.out.println("Data Retrieved: " + details);
    }
}
