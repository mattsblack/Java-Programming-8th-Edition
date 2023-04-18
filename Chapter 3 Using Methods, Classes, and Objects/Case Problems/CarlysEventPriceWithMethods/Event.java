// Event.java

public class Event {
    public final static int PRICE_PER_GUEST = 35; // Price per guest
    public final static int LARGE_EVENT_CUTOFF = 50; // Cutoff value for a large event

    private String eventNumber; // Event number
    private int numGuests; // Number of guests for the event
    private int price; // Price of the event

    // Setter for event number
    public void setEventNumber(String eventNumber) {
        this.eventNumber = eventNumber;
    }

    // Setter for number of guests
    public void setGuests(int numGuests) {
        this.numGuests = numGuests;
        this.price = numGuests * PRICE_PER_GUEST;
    }

    // Getter for event number
    public String getEventNumber() {
        return eventNumber;
    }

    // Getter for number of guests
    public int getGuests() {
        return numGuests;
    }

    // Getter for price
    public int getPrice() {
        return price;
    }
}
