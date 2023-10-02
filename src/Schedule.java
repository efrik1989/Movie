import model.Session;

import java.util.ArrayList;

public class Schedule {
    ArrayList<Session> sessionList = new ArrayList<Session>();

    private static final Schedule INSTANCE = new Schedule();

    public static Schedule getInstance() {
        if (INSTANCE == null) {
            return new Schedule();
        }
        return INSTANCE;
    }

    public Session getSession(String time, String filmName) {
        for (Session ses : INSTANCE.getSessionsList()) {
            if ((ses.getTime()).equals(time) && (ses.getFilm().getFilmName()).equals(filmName)) {
                ses.print();
                return ses;
            }
        }
        return new Session();
    }

    private ArrayList<Session> getSessionsList() {
        return sessionList;
    }
}
