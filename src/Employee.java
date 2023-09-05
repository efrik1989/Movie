public class Employee extends Person implements BuyTickets{
    String position;

    public Employee(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void buyTheTicket(String time, String filmName) {

    }
}
