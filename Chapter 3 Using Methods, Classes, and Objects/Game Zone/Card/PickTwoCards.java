public class PickTwoCards {
    public static void main(String[] args) {
        final int CARDS_IN_SUIT = 13;
        Card card1 = new Card(getRandomSuit(), getRandomValue(CARDS_IN_SUIT));
        Card card2 = new Card(getRandomSuit(), getRandomValue(CARDS_IN_SUIT));

        System.out.println("Card 1: " + card1.getValue() + " of " + card1.getSuit());
        System.out.println("Card 2: " + card2.getValue() + " of " + card2.getSuit());
    }

    // Method to generate a random suit ('s', 'h', 'd', 'c')
    public static char getRandomSuit() {
        int suitNum = (int) (Math.random() * 4);
        char suit;
        if (suitNum == 0) {
            suit = 's';
        } else if (suitNum == 1) {
            suit = 'h';
        } else if (suitNum == 2) {
            suit = 'd';
        } else {
            suit = 'c';
        }
        return suit;
    }

    // Method to generate a random value (1 to max)
    public static int getRandomValue(int max) {
        return (int) (Math.random() * max) + 1;
    }
}
