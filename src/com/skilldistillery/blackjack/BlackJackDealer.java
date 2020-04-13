package com.skilldistillery.blackjack;

import java.util.ArrayList;
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
	
	public ArrayList<Card> getDealerHand() {
		return hand.getHand();
	}
	
	public Hand getHand() {
		return hand;
	}

	public void playerWin() {
		System.out.println(this.name+ " wins!");
	}
	
	public void receiveACard(Card c) {
		try {
			hand.addToHand(c);
		}catch(Exception e) {
			System.err.println("Dealer refuses to receive Card");
		}
	}
	
	/*
	 *Not building a custom compare
	 *
	 *Checking for a winner in BlackJack
	 */
	public boolean checkForWinner(Hand hand1, Hand hand2) {
		if(hand1.getScore() < hand2.getScore() && hand2.getScore() <= 21) {
			System.out.println("WINNER!");
			hand1.clearHand();
			hand2.clearHand();
			return true;
		}
		else {
			System.out.println("Dealer wins");
			hand1.clearHand();
			hand2.clearHand();
			return false;
		}
		
	}
	
	//Abstract class has a deck, can dealACard(), Shuffle()

}
