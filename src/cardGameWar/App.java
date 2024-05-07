package cardGameWar;




public class App {

	public static void main(String[] args) {
		// lets test this out
		//first I'll need two characters
		
		
		Deck playDeck = new Deck();
		playDeck.shuffle();
		
		Player p1 = new Player("Lauren");
		Player p2 = new Player("Molly");
		
		//players draw their cards to their hand
		for (int i = 1; i <= 52; i++) {
			if(i % 2 == 0) {
				p1.drawToHand(playDeck);
			}else {
				p2.drawToHand(playDeck);
			}
		}
		//make it look nice
		String divide = "----------------------------------";
		
		
		//actual game
		for (int i = 1; i < 26; i++) {
			int p1Score;
			int p2Score;
			Player winner;
			
			System.out.println(divide);
			p1Score = p1.flip();
			p2Score = p2.flip();
			if (p1Score > p2Score) {
				winner = p1;
				winner.incrementScore();
			} else if (p1Score == p2Score){
				winner = null;
				System.out.println("It's a Tie.");
			} else {
				winner = p2;
				winner.incrementScore();
			}
			
		}
		//announce overall winner
		System.out.println(divide);
		System.out.println(divide);
		
		if (p1.getScore() > p2.getScore()) {
			System.out.println(String.format("%s has won the war with %d to %s's %d!", p1.getName(), p1.getScore(), p2.getName(), p2.getScore()));
		} else if (p2.getScore() > p1.getScore()){
			System.out.println(String.format("%s has won the war with %d to %s's %d!", p2.getName(), p2.getScore(), p1.getName(), p1.getScore()));
		} else {
			System.out.println("The war ended in a stalemate. It's a tie.");
		}
		
	}
	
}
