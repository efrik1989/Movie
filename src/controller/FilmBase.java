package controller;

import model.Film;

import java.util.ArrayList;

public class FilmBase {
    private static final FilmBase INSTANCE = new FilmBase();
    ArrayList<Film> films = new ArrayList<>();

    private FilmBase(){

    }

    public static FilmBase getInstance() {
        if (INSTANCE == null) {
            return new FilmBase();
        }
        return INSTANCE;
    }

    public void addFilm(Film film) {
        films.add(film);
    }

    public Film getFilm(String filmName) throws Exception {
        return searchFilm(filmName);
    }
    //TODO: Коряво работает надо потестить и подправить.
    public Film searchFilm(String string) throws Exception {
        for (Film film : films) {
            String name = film.getFilmName();
            String description = film.getDescription();
            String director = film.getDirector();
            String duration = film.getDuration();
            if (name.matches(".*" + string + ".*")) {
                return film;
            }
            if (description != null && description.matches(".*" + string + ".*")) {
                return film;
            }
            if (director != null && director.matches(".*" + string + ".*")) {
                return film;
            }
            if (duration != null && duration.matches(".*" + string + ".*")) {
                return film;
            }
        }
        throw new Exception("No film found by this string");
    }
}
