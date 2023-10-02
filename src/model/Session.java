package model;

import model.Film;

public class Session {
    String time;
    Film film;
    int hallNumber;

    public Session(String time, Film film, int hallNumber) {
        this.time = time;
        this.film = film;
        this.hallNumber = hallNumber;
    }

    public Session(Film film, String time) {
        this.time = time;
        this.film = film;
    }

    public Session() {
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public void print() {
        System.out.println("Сеанс: " + this.getTime() + " " + this.getFilm().getFilmName());
    }

}
