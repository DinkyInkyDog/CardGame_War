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

	
	
}
