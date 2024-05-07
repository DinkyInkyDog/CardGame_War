package cardGameWar;

public class Card {

	private int value;
	@SuppressWarnings("unused")
	private String suit;
	private String name;
	
	public Card(String suit, int value) {
		this.value = value;
		this.suit = suit;
		switch (this.value) {
		case 1:
			this.name = "One of " + suit;
			break;
		case 2:
			this.name = "Two of " + suit;
			break;
		case 3:
			this.name = "Three of " + suit;
			break;
		case 4:
			this.name = "Four of " + suit;
			break;
		case 5:
			this.name = "Five of " + suit;
			break;
		case 6:
			this.name = "Six of " + suit;
			break;
		case 7:
			this.name = "Seven of " + suit;
			break;
		case 8:
			this.name = "Eight of " + suit;
			break;
		case 9:
			this.name = "Nine of " + suit;
			break;
		case 10:
			this.name = "Ten of " + suit;
			break;
		case 11:
			this.name = "Jack of " + suit;
			break;
		case 12:
			this.name = "Queen of " + suit;
			break;
		case 13:
			this.name = "King of " + suit;
			break;
		case 14:
			this.name = "Ace of " + suit;
			break;
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
