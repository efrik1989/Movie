
public class Session {
    String time;
    Film film;

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
        System.out.println(this.getTime() + " " + this.getFilm());
    }

}
