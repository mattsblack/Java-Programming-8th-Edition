// Rental.java

public class Rental {
    public final static int MINUTES_IN_HOUR = 60;
    public final static int HOURLY_RENTAL_RATE = 40;

    private String contractNumber;
    private int hours;
    private int minutesOverHour;
    private double price;

    // Set contract number
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    // Set hours, minutes over hour, and total price based on number of minutes
    public void setHoursAndMinutes(int minutes) {
        this.hours = minutes / MINUTES_IN_HOUR;
        this.minutesOverHour = minutes % MINUTES_IN_HOUR;
        this.price = (hours * HOURLY_RENTAL_RATE) + (minutesOverHour * 1.0 / MINUTES_IN_HOUR * HOURLY_RENTAL_RATE);
    }

    // Get contract number
    public String getContractNumber() {
        return contractNumber;
    }

    // Get hours
    public int getHours() {
        return hours;
    }

    // Get minutes over hour
    public int getMinutesOverHour() {
        return minutesOverHour;
    }

    // Get price
    public double getPrice() {
        return price;
    }
}
