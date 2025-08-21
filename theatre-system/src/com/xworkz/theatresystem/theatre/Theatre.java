package com.xworkz.theatresystem.theatre;

import com.xworkz.theatresystem.movie.Movie;
import com.xworkz.theatresystem.validator.Validator;

public class Theatre {
    private Movie movie;
    private Validator validator = new Validator();

    public void setMovie(Movie movie) {
        if (validator.validate(movie)) {
            this.movie = movie;
            System.out.println("Movie data accepted and stored in Theatre.");
        } else {
            System.out.println("Movie data is invalid, not stored.");
        }
    }

    public boolean getMovieData() {
        if (movie != null) {
            System.out.println("=== Movie Details ===");
            System.out.println("Movie ID: " + movie.getMovieId());
            System.out.println("Movie Name: " + movie.getMovieName());
            System.out.println("Genre: " + movie.getGenre());
            System.out.println("Director: " + movie.getDirector());
            System.out.println("Duration: " + movie.getDuration() + " mins");
            System.out.println("Ticket Price: Rs" + movie.getTicketPrice());
            return true;
        }
        else {
            System.out.println("No valid movie data available.");
            return false;
        }
    }
}
