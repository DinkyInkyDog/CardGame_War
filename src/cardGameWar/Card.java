package cardGameWar;

public class Card {

	private int value;
	@SuppressWarnings("unused")
	private String suit;
	private String name;
	
	public Card(String suit, int value) {
		this.value = value;
		this.suit = suit;
		switch (value) {
		case 1:
			this.name = "One of " + suit;
		case 2:
			this.name = "Two of " + suit;
		case 3:
			this.name = "Three of " + suit;
		case 4:
			this.name = "Four of " + suit;
		case 5:
			this.name = "Five of " + suit;
		case 6:
			this.name = "Six of " + suit;
		case 7:
			this.name = "Seven of " + suit;
		case 8:
			this.name = "Eight of " + suit;
		case 9:
			this.name = "Nine of " + suit;
		case 10:
			this.name = "Ten of " + suit;
		case 11:
			this.name = "Jack of " + suit;
		case 12:
			this.name = "Queen of " + suit;
		case 13:
			this.name = "King of " + suit;
		case 14:
			this.name = "Ace of " + suit;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public void describe() {
		System.out.println(name);
	}

}
