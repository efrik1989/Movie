import java.util.ArrayList;

public class FilmBase {
    private static FilmBase filmBase;
    ArrayList<Film> films;

    public FilmBase() {
        films = new ArrayList<>();
    }

    public FilmBase getInstance() {
        if (filmBase == new FilmBase()) {

        }
        return filmBase;
    }

    public void addFilm(Film film) {
        films.add(film);
    }

    public Film getFilm(String filmName) throws Exception {
        return searchFilm(filmName);
    }
    //TODO: Коряво работает надо потестить и подправить.
    private Film searchFilm(String string) throws Exception {
        for (Film film : films) {
            if (film.getFilmName().equals(string)) {
                return film;
            }
            if (film.getDescription().equals(string)) {
                return film;
            }
            if (film.getDirector().equals(string)) {
                return film;
            }
            if (film.getDuration().equals(string)) {
                return film;
            }
        }
        throw new Exception("No film found by this string");
    }
}
