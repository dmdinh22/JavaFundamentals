package arraylists;

import java.util.*;

public class Card {
	char suit; //d, s, c, h
	int rank; // J is 11, Q is 12, K is 13
	
	// creating a deck of cards
	ArrayList<Card> deck = new ArrayList<Card>();
	
	suits = new char[] {'d', 's', 'c', 'h'};
	for (int i = 1; i <= 13; i++ ) {
		Card c = new Card();
		for (int j = 0; j <= 4; j++) {
			c.suit = suits[j];
			c.rank = i;
			deck.add(c);
		}
	}
}


