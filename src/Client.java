public class Client extends Person implements BuyTickets{
    @Override
    public void buyTheTicket(String time, String filmName) {
        Schedule schedule = Schedule.getInstance();

        schedule.getSession(time, filmName);
    }
}
