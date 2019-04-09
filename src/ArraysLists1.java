import java.util.Random;

import stuff.CardDeck;

public class ArraysLists1 {
	CardDeck deck = new CardDeck();
	
	public void runStuff() {
		
		System.out.println("Shuffling deck...");
		deck.shuffle();
		for(int i = 1; i <= 52; i++) {
			System.out.println("The card drawn was a " + deck.drawCard());
		}
		
	}
	
}
