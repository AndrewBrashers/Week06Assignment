package Week06Assignment;

public class Deck {
	public static Card[] cards = new Card[52];
	public void newdeck() {
		int t = 0;
		int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		String[] suites = {"Aces", "Hearts", "Dimonds", "Spades"};
		for(String e: suites) 
		{
			for(int i: values) 
			{
				cards[t]=new Card();
				cards[t].setvalue(i);
				cards[t].setname(e);
				t++;
			}
		}
		
	}
	//public Deck() {
	//	newdeck();
	//}
}
