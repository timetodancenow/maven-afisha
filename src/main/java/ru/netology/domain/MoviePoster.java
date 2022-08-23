package ru.netology.domain;

public class MoviePoster {

    public MoviePoster ( String films ) {
        this.films = films;
    }

    private String films;

    public String getFilmName () {
        return films;
    }

    public void setFilmName ( String filmName ) {
        this.films = filmName;
    }
}