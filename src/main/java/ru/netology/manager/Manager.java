package ru.netology.manager;

import java.lang.reflect.Array;

import ru.netology.domain.MoviePoster;

public class Manager {
    private int limit = 10;
    private MoviePoster[] films = new MoviePoster[limit - 10];

    public Manager ( int limit ) {

        this.limit = limit;
    }

    public Manager () {

        this.limit = 10;
    }

    public void add ( MoviePoster film ) {
        int length = films.length + 1;
        MoviePoster[] tmp = new MoviePoster[length];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public MoviePoster[] findAll () {
        MoviePoster[] list = new MoviePoster[films.length];
        for (int i = 0; i < films.length; i++) {
            //int index = films.length - i - 1;
            list[i] = films[i];
        }
        return list;
    }

    public MoviePoster[] findLast () {
        int resultLength = 0;
        if (limit == films.length) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        MoviePoster[] result = new MoviePoster[resultLength];

        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
            resultLength++;
        }
        return result;
    }

}