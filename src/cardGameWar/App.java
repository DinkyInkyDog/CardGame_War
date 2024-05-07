package cardGameWar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		// lets test this out
		//first I'll need two characters
		Card test = new Card("Clubs", 4);
		test.describe();
		System.out.println(test.getValue());
		
		Deck playDeck = new Deck();
		playDeck.shuffle();
		
		Player p1 = new Player("Lauren");
		Player p2 = new Player("Molly");
		
		//players draw their cards
		for (int i = 1; i <= 52; i++) {
			if(i % 2 == 0) {
				p1.drawToHand(playDeck);
			}else {
				p2.drawToHand(playDeck);
			}
		}
		
		//actual game
		for (int i = 1; i < 26; i++) {
			int p1Score;
			int p2Score;
			Player winner;
			
			p1Score = p1.flip();
			p2Score = p2.flip();
			if (p1Score > p2Score) {
				winner = p1;
			} else if (p1Score == p2Score){
				winner = null;
			} else {
				winner = p2;
			}
			
		}
	
	}
	
}
