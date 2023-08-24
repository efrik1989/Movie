import java.util.ArrayList;

public class Film {
    String filmName;
    ArrayList<String> actors;
    String director;
    String duration;
    String description;

    {
        actors = new ArrayList<>();
    }

    public Film(String filmName, ArrayList<String> actors, String director, String duration, String description) {
        this.filmName = filmName;
        this.actors = actors;
        this.director = director;
        this.duration = duration;
        this.description = description;
    }

    public Film(String filmName, ArrayList<String> actors, String director, String duration) {
        this.filmName = filmName;
        this.actors = actors;
        this.director = director;
        this.duration = duration;
    }

    public Film(String filmName, ArrayList<String> actors, String director) {
        this.filmName = filmName;
        this.actors = actors;
        this.director = director;
    }

    public Film(String filmName, String duration) {
        this.filmName = filmName;
        this.duration = duration;
    }

    public Film() {
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getActors() {
        return actors;
    }
    public void addAnActor(String actorName) {
        this.actors.add(actorName);
    }
}
