package com.skilldistillery.blackjack;


public abstract class Dealer {
	
	//protected int deckCapacity; //SomeDealers may hold more than one deck of standard cards. We might... One day
	protected Deck deck= new Deck(); //Every dealer has a deck(for now) or multiple decks
	
	//Not all dealers get a Hand to play
	
	
	public void shuffle() { //Every dealer shuffles
		deck.shuffle();
	}
	
	public Deck getDeck(){
		return deck;
	}
	
	/*
	 * Apparently I did add a shuffle and populating a new deck feature.
	 */
	public Card dealtCard() { //Every dealer deals a card
		try {
			if(deck.checkDeckSize()== 0) {
				deck = new Deck();
				deck.shuffle();
				return deck.dealCard();
			}else {
				return deck.dealCard();						
			}
		}catch(Exception e) {
			System.err.println("Dealer could not deal a card");
			return null;
		}
	}
	
	
	
	
}
