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
        System.out.println("Films count: " + films.size());
        for (Film film : films) {
            String name = film.getFilmName();
            String description = film.getDescription();
            String director = film.getDirector();
            String duration = film.getDuration();
            System.out.println( name + " string: " + string );
            if (name.matches(".*" + string + ".*")) {
                System.out.println(film.getClass().toString());
                return film;
            }
            if (description.matches(".*" + string + ".*")) {
                return film;
            }
            if (director.matches(".*" + string + ".*")) {
                return film;
            }
            if (duration.matches(".*" + string + ".*")) {
                return film;
            }
        }
        throw new Exception("No film found by this string");
    }
}
