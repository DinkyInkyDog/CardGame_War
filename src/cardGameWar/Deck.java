package cardGameWar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Deck {
	List<Card> newDeck = new ArrayList<Card>();
	
	public Deck() {
		List<String> listSuits = new ArrayList<String>(Arrays.asList("Diamonds", "Clubs", "Spades", "Hearts"));
		for (String suit : listSuits) {
			for (int i = 1; i < 14; i++) {
				
				Card instance = new Card(suit, i);
				instance.describe();
				newDeck.add(instance);
			}
		}
	}
	public int pickACard(int min, int max) {
	    Random random = new Random();
	    return random.nextInt(max - min) + min;
	}
	
	public void shuffle() {
		List<Card> tempDeck = new ArrayList<Card>();
		for (int i = newDeck.size(); i > 1; i--) {
			int activeCard = pickACard(0, i - 1);
			tempDeck.add(newDeck.get(activeCard));
			newDeck.remove(activeCard);
		}
		for(Card card: tempDeck) {
			newDeck.add(card);
		}
	}
	
	
	public Card draw() {
		Card pulledCard = newDeck.get(0);
		newDeck.remove(0);
		return pulledCard;
	}
}

