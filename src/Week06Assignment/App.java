package Week06Assignment;

public class App {

	public static void main(String[] args) {
		var d = new Deck();
		d.newdeck();
		for(Card e: Deck.cards) 
		{
			e.discribe();	
		}
	}
}
