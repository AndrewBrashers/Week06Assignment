package Week06Assignment;

public class Card {
	private int suit, value, num;
	
	public Card(int card) {
		this.suit=card/13;
		this.value=card%13;
		this.num=card;
	}
	
	public int getSuit() {
		return suit;
	}
	
	public int getValue() {
		return value;
	}
	
	public int getNum() {
		return num;
	}
	
	@Override
	public String toString() {
		String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		String[] suites = {"Clubs", "Hearts", "Dimonds", "Spades"};
		return "Card:  " + values[this.getValue()] + " of " + suites[this.getSuit()];
	}
}
