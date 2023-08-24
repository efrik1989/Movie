import java.util.ArrayList;

public class Schedule {
    ArrayList<Session> sessionList;

    private static Schedule schedule;

    public static Schedule getInstance() {
        if (schedule == null) {
            return new Schedule();
        }
        return schedule;
    }

    public Session getSession(String time, String filmName) {
        for (Session ses : schedule.getSessionsList()) {
            if ((ses.getTime()).equals(time) && (ses.getFilm().getFilmName()).equals(filmName)) {
                return ses;
            }
        }
        return new Session();
    }

    private ArrayList<Session> getSessionsList() {
        return sessionList;
    }
}
