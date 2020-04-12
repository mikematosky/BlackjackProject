package com.skilldistillery.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Dealer {
	
	protected int deckCapacity; //SomeDealers may hold more than one deck. We might...
	protected Deck deck= new Deck(); //Every dealer has a deck(for now) or multiple decks
	
	
	public void shuffle(List<Card> deck) { //Every dealer shuffles
		Collections.shuffle(deck);
	}
	
	public Deck getDeck(){
		return deck;
	}

	public int getDeckCapacity() {
		return deckCapacity;
	}
	
	
	
	
}
