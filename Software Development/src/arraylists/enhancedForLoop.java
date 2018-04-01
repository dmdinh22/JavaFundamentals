package arraylists;

import java.util.ArrayList;

public class enhancedForLoop {
	/*	for ( datatype variable : collection ) {
	*		// variable name can be used in this loop
	*			// variable takes each value in the collection one by one
	*	}
	*/	
	
	int max = 0;
	String longest = "";
	
	for (String name : names) {
		int current = name.length();
		if (current > max) {
			max = current;
			longest = name;
		}
	}
	
	// looping through arrays with enhanced for loop
	int[] scores = {90, 92, 88, 94};// an array of integer scores;
	double total = 0;
	
	for (double element : scores) {
		total += element;
	}
	
	// enhanced for loop best used for reading elements
	// not suitable for initializing values or modify existing values
	
	// ConcurrentModificationException
	for (Card ca : deck) {
		if (ca.suit == 'c') {
			deck.remove(ca);
		}
	}
	
	// Solving the ConcurrentModificationException
	ArrayList<Card> clubs = new ArrayList<Card>();
	
	for (int i = 0; i < deck.size(); i++) {
		Card.class = deck.get(i);
		if (ca.suit == 'c') {
			clubs.add(ca);
		}
	}
	deck.removeAll(clubs);
}
