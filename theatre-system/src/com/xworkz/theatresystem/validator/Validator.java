package com.xworkz.theatresystem.validator;

import com.xworkz.theatresystem.movie.Movie;

public class Validator {

    public boolean validate(Movie movie) {
        if (movie == null) {
            System.out.println("Movie object is null.");
            return false;
        }

        if (movie.getMovieId() <= 0) {
            System.out.println("Invalid Movie ID.");
            return false;
        }

        if (movie.getMovieName() == null || movie.getMovieName().isEmpty()) {
            System.out.println("Movie name cannot be empty.");
            return false;
        }

        if (movie.getGenre() == null || movie.getGenre().isEmpty()) {
            System.out.println("Genre cannot be empty.");
            return false;
        }

        if (movie.getDirector() == null || movie.getDirector().isEmpty()) {
            System.out.println("Director cannot be empty.");
            return false;
        }

        if (movie.getDuration() <= 30) {
            System.out.println("Movie duration must be more than 30 minutes.");
            return false;
        }

        if (movie.getTicketPrice() <= 0) {
            System.out.println("Ticket price must be greater than 0.");
            return false;
        }

        return true;
    }
}
