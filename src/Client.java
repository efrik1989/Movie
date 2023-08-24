public class Client implements BuyTickets{
    @Override
    public void buyTheTicket(String time, String filmName) {
        Schedule schedule = Schedule.getInstance();

        schedule. getSession(time, filmName);
    }
}
