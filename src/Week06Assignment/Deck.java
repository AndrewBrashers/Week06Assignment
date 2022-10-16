package Week06Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	ArrayList<Card> deck;
	
	public Deck() {
		deck = new ArrayList<Card>();
	}
	
	public void addCard(Card card) {
		this.deck.add(card);
	}
	
	public Card playCard() {
		var playedCard=this.deck.get(0);
		this.deck.remove(0);
		return playedCard;
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
}
