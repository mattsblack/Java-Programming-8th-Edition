public class Card {
    private char suit; // suit of the card (s, h, d, c)
    private int value; // value of the card (1 to 13)

    // Constructor
    public Card(char suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    // Getter for suit
    public char getSuit() {
        return suit;
    }

    // Setter for suit
    public void setSuit(char suit) {
        this.suit = suit;
    }

    // Getter for value
    public int getValue() {
        return value;
    }

    // Setter for value
    public void setValue(int value) {
        this.value = value;
    }
}
