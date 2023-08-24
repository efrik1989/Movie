public class Movie {
    int hallsNumber;
    String address;
    String startTime;
    String endTime;

    {
        startTime = "10:00";
        endTime = "22:00";
    }

    public Movie(int hallsNumber, String address, String startTime, String endTime) {
        this.hallsNumber = hallsNumber;
        this.address = address;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Movie(int hallsNumber, String address) {
        this.hallsNumber = hallsNumber;
        this.address = address;
    }

    public Movie() {
    }

    public int getHallsNumber() {
        return hallsNumber;
    }

    public void setHallsNumber(int hallsNumber) {
        this.hallsNumber = hallsNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
