package com.skilldistillery.blackjack;

import java.util.Collections;

public abstract class Dealer {
	
	protected int deckCapacity; //SomeDealers may hold more than one deck. We might...
	protected Deck deck= new Deck(); //Every dealer has a deck(for now) or multiple decks
	//Not all dealers get a Hand to play
	
	
	public void shuffle() { //Every dealer shuffles
		deck.shuffle();
	}
	
	public Deck getDeck(){
		return deck;
	}

	public int getDeckCapacity() {
		return deckCapacity;
	}
	
	public void dealACard(Hand hand) { //Every dealer deals a card
		
		if(deck.checkDeckSize()== 0) {
			deck = new Deck();
			deck.shuffle();
			dealACard(hand); //loops back in
		}else {
			hand.addToHand(deck.dealCard());						
		}
	}
	
	
	
	
}
