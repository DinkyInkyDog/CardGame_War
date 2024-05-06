package cardGameWar;

import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
	public Player(String name) {
		this.score = 0;
		this.name = name;
	}
	
	
	public int getScore() {
		return this.score;
	}


	public String getName() {
		return name;
	}

	public void describe() {
		System.out.println("Player: " + name);
		System.out.println("They have a score of " + score);
		System.out.println("In their hand they have: ");
		for (Card card: hand) {
			card.describe();
		}
		
	}
	public void drawToHand(Deck currentDeck) {
		Card pulledCard = currentDeck.draw();
		hand.add(pulledCard);
		
	}
	
	public int flip() {
		int cardPoints;
		Card pulledCard = hand.get(0);
		hand.remove(0);
		cardPoints = pulledCard.getValue();
		System.out.print(name + " plays ");
		pulledCard.describe();
		return cardPoints;
		}
	
	public void incrementScore() {
		System.out.println(name + " won the battle!");
		this.score += 1;
	}
}
