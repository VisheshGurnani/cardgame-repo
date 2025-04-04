public class Card {
    private int value;
    private int suit;

    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {
            "Ace", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King"
    };

    public Card(int value, int suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return RANKS[value - 1] + " of " + SUITS[suit];
    }
}
