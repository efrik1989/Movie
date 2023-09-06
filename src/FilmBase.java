import java.util.ArrayList;

public class FilmBase {
    private static final FilmBase instance = new FilmBase();
    ArrayList<Film> films = new ArrayList<>();

    private FilmBase(){

    }

    public FilmBase getInstance() {
        if (instance == null) {
            return new FilmBase();
        }
        return instance;
    }

    public void addFilm(Film film) {
        films.add(film);
    }

    public Film getFilm(String filmName) throws Exception {
        return searchFilm(filmName);
    }
    //TODO: Коряво работает надо потестить и подправить.
    private Film searchFilm(String string) throws Exception {
        System.out.println("Films count: " + films.size());
        for (Film film : films) {
            System.out.println(film.getFilmName() + " string: " + string );
            if (film.getFilmName().matches(".*" + string + ".*")) {
                return film;
            }
            if (film.getDescription().matches(".*" + string + ".*")) {
                return film;
            }
            if (film.getDirector().matches(".*" + string + ".*")) {
                return film;
            }
            if (film.getDuration().matches(".*" + string + ".*")) {
                return film;
            }
        }
        throw new Exception("No film found by this string");
    }
}
