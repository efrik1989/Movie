public class Main {
    static FilmBase filmBase;
    static Schedule schedule;
    public static void main(String[] args) throws Exception {
        createTheMovie();
        createTheFilmBase();
        createTheSchedule();

        Client client = new Client();
        client.buyTheTicket("17:00", "Терминатор2");

    }

    private static void createTheSchedule() throws Exception {
        schedule = new Schedule();
        schedule.sessionList.add(new Session(filmBase.getInstance().getFilm("Terminator"), "15.00"));
        schedule.sessionList.add(new Session(filmBase.getInstance().getFilm("Terminator2"), "17.00"));
        schedule.sessionList.add(new Session(filmBase.getInstance().getFilm("Catch if you can"), "19.00"));
    }

    private static void createTheFilmBase() {
        filmBase = new FilmBase();
        filmBase.addFilm(new Film("Terminator", "92 min."));
        filmBase.addFilm(new Film("Terminator2", "93 min."));
        filmBase.addFilm(new Film("Catch if you can", "122 min."));
    }

    private static void createTheMovie() {

        Movie movie = new Movie(1,"ул. Пушкинская. д. 20");
    }
}
