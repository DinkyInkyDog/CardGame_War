package cardGameWar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deck {
	List<Card> newDeck = new ArrayList<Card>();
	
	public Deck() {
		List<String> listSuits = new ArrayList<String>(Arrays.asList("Diamonds", "Clubs", "Spades", "Hearts"));
		for (String suit : listSuits) {
			for (int i = 1; i < 14; i++) {
				Card instance = new Card(suit, i);
				newDeck.add(instance);
			}
		}
	}
	
	public void shuffle() {
		List<Card> tempDeck = new ArrayList<Card>();
		
	}
}
