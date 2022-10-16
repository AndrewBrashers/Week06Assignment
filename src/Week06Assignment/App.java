package Week06Assignment;

public class App {

	public static void main(String[] args) {
		var p1=new Player();
		var p2=new Player();
		p1.name="Andrew";
		p2.name="Don";
		var deck = new Deck();
		int p1val=0;
		int p2val=0;
		int p1num=0;
		int p2num=0;
		String hWin="";
		String gWin="";
		for(int i=0; i<52; i++) 
		{
			var card = new Card(i);
			deck.addCard(card);
		}
		
		deck.shuffle();
		for(int i=0; i<52; i++) {
			if(i%2==0) {
				p1.hand.addCard(deck.playCard());
			}
			
			else {
				p2.hand.addCard(deck.playCard());
			}
			
		}
		
		for(int i=0; i<26; i++) {
			p1num=p1.hand.playCard().getNum();
			p2num=p2.hand.playCard().getNum();
			var p1Card=new Card(p1num);
			var p2Card=new Card(p2num);
			p1val=p1Card.getValue();
			p2val=p2Card.getValue();
			if(p1val>p2val) {
				p1.score++;
				hWin=p1.name;
			}
			
			if(p1val<p2val) {
				p2.score++;
				hWin=p2.name;
			}
			
			if(p1val==p2val) {
				hWin="DRAW";
			}
			
			System.out.println(String.format("Hand %s:  %s drew %s and %s drew %s:  %s Wins:  Current Score:  %s %s:  %s %s", 
					(i+1), p1.name, p1Card.toString(), p2.name, p2Card.toString(), hWin,  p1.name, p1.score, p2.name, p2.score));
		}
		
		if(p1.score>p2.score) {
			gWin=p1.name;
		}
		
		if(p1.score<p2.score) {
			gWin=p2.name;
		}
		
		if(p1.score==p2.score) {
			gWin="DRAW";
		}
		
		System.out.println(String.format("Game Winner:  %s:  Final Score:  %s %s:  %s %s", gWin,  p1.name, p1.score, p2.name, p2.score));
	}
}
