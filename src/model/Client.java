package model;

import model.*;
import controller.*;

public class Client extends Person implements BuyTickets {
    @Override
    public void buyTheTicket(String time, String filmName) {
        System.out.print("model.Client buy the ticket - ");
        Schedule schedule = Schedule.getInstance();

        Session session = schedule.getSession(time, filmName);

        Ticket ticket = new Ticket(session.getTime(), session.getFilm().getFilmName(), 1, 15);
        ticket.print();

        System.out.println("done...");
    }
}
