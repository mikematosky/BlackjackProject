package com.skilldistillery.blackjack;

import java.util.Collections;

public class BlackJackDealer extends Dealer{

	final int DESIRABLE_SCORE= 17; //Dealer stops at 17
	private String name;
	private Hand hand;
	private int cardsDealt;
	
	//constructor for eventual addition of more decks
	public BlackJackDealer() {
		hand= new Hand();
		name= "DEALER";
		cardsDealt=0;
	}

	public void playerWin() {
		System.out.println(this.name+ " wins!");
	}
	
	public void initiateRound() {
		
	}
	
	//Abstract class has a deck, can dealACard(), Shuffle()

}
