package stuff;

import java.util.ArrayList;
import java.util.Random;

public class CardDeck {
	ArrayList<String> cards;
	int remainingCards;
	
	public CardDeck() {
		cards = new ArrayList<String>();
		remainingCards = 52;
		
		cards.add("Black Joker");
		cards.add("Red Joker");
		
		String temp;
		for(int i = 0; i < 4; i++) {
			switch(i) {
			case 0: 
				temp = "Spades";
				break;
			case 1:
				temp = "Hearts";
				break;
			case 2:
				temp = "Clubs";
				break;
			case 3:
				temp = "Diamonds";
				break;
			default:
				temp = "yeet";
			}
			
			
			cards.add("Ace of " + temp);
			cards.add("King of " + temp);
			cards.add("Queen of " + temp);
			cards.add("Jack of " + temp);
			cards.add("Two of " + temp);
			cards.add("Three of " + temp);
			cards.add("Four of " + temp);
			cards.add("Five of " + temp);
			cards.add("Six of " + temp);
			cards.add("Seven of " + temp);
			cards.add("Eight of " + temp);
			cards.add("Nine of " + temp);
			cards.add("Ten of " + temp);
		}
	}
	
	public String drawCard() {
		Random rand = new Random();
		String card;
		int index;
		index = rand.nextInt(remainingCards) + 1;
		card = cards.get(index);
		cards.remove(index);
		remainingCards--;
		return card;
	}
	
	public void shuffle() {
		Random rand = new Random();
		String x;
		int j;
		
		for (int i = cards.size() - 1; i > 0; i--) {
	        j = (int) Math.floor(Math.random() * (i + 1));
	        x = cards.get(i);
	        cards.set(i, cards.get(j));
	        cards.set(j, x);
	    }
	}
}
