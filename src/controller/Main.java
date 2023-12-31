package controller;

import model.Client;
import model.Employee;
import model.Film;
import model.Session;

public class Main {

    static Schedule schedule;
    static EmployeeBase employeeBase;

    public static void main(String[] args) throws Exception {
        createTheMovie();
        createTheFilmBase();
        createTheSchedule();
        hireTheCrew();

        Client client = new Client();
        client.buyTheTicket("17:00", "Terminator2");

    }

    private static void hireTheCrew() {
        System.out.println("Hire the crew...");
        employeeBase = EmployeeBase.getInstance();
        employeeBase.addEmployee(new Employee("director"));
        employeeBase.addEmployee(new Employee("ticketTrader"));
        employeeBase.addEmployee(new Employee("cleaner"));
        System.out.println("Crew - done...");
    }

    private static void createTheSchedule() throws Exception {
        System.out.println("Create session's schedule...");
        schedule = Schedule.getInstance();
        schedule.sessionList.add(new Session(FilmBase.getInstance().getFilm("Terminator"), "15:00"));
        schedule.sessionList.add(new Session(FilmBase.getInstance().getFilm("Terminator2"), "17:00"));
        schedule.sessionList.add(new Session(FilmBase.getInstance().getFilm("Catch if you can"), "19:00"));
        System.out.println("controller.Schedule - done...");
    }

    private static void createTheFilmBase() {
        System.out.println("Create filmBase...");
        FilmBase filmBase = FilmBase.getInstance();
        filmBase.addFilm(new Film("Terminator", "92 min."));
        filmBase.addFilm(new Film("Terminator2", "93 min."));
        filmBase.addFilm(new Film("Catch if you can", "122 min."));
        System.out.println("controller.FilmBase " + filmBase + " - done... Films: " + filmBase.films.size() );
    }

    private static void createTheMovie() {
        System.out.println("Create the movie...");
        Movie movie = new Movie(1,"ул. Пушкинская. д. 20");
        movie.createHalls();
        System.out.println("controller.Movie - done...");
    }
}
