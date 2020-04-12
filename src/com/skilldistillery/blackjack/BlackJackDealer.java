package com.skilldistillery.blackjack;

import java.util.Collections;

public class BlackJackDealer extends Dealer{

	final int DESIRABLE_SCORE= 17; //Dealer stops at 17
	private String name = "DEALER";
	private Hand hand = new Hand();
	private int cardsDealt=0;
	
	//constructor for eventual addition of more decks
	public BlackJackDealer() {
		
	}

	public void playerWin() {
		System.out.println(this.name+ " wins!");
	}
	
	public void initiateRound() {
		
	}
	
	//Abstract class has a deck, can dealACard(), Shuffle()

}
