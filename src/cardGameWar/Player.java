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
	
}
