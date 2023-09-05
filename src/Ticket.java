public class Ticket {
    String time;
    String FilmName;
    int hallNumber;
    int place;

    public Ticket(String time, String filmName, int hallNumber, int place) {
        this.time = time;
        FilmName = filmName;
        this.hallNumber = hallNumber;
        this.place = place;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFilmName() {
        return FilmName;
    }

    public void setFilmName(String filmName) {
        FilmName = filmName;
    }

    public int getHallNumber() {
        return hallNumber;
    }

    public void setHallNumber(int hallNumber) {
        this.hallNumber = hallNumber;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    void print() {
        System.out.println("Время: " + this.getTime() +
                ", Зал: " + this.hallNumber +
                ", Место: " + this.place +
                ", Фильм: " + this.FilmName);
    }
}
