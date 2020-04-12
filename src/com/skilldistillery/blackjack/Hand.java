package com.skilldistillery.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	private ArrayList<Card> hand;
	private int score;

	public Hand() {
	}	// Adds a card to the hand and updates the score
	//
	// I can OOP out an Abstract Class for different Hands, but the soft
	// Ace feature is the only distinction to this class for BlackJack
	public void addToHand(Card c) {
		
		if(score <= 21) {
			hand.add(c);
			score= score+ c.getValue();
			
			
			//Soft Aces
			while(score > 21) {
				for (Card card : hand) {
					if(c.getRank() == Rank.ACE) {
						score = score- 10;
						break;
					}
				}				
			}
		}
		else {
			System.err.println(" DEALER: You cannot add anymore cards to this hand");
		}
	}
	
	
	//Empties the hand
	public void clearHand() {
		
		for (Card card : hand) {
			hand.remove(card);
			score=0;
		}
		
	}
	
	//?
	public ArrayList<Card> getHand(){
		return hand;
	}
	
	//Returns the total score of the hand
	//Stretch= soft and hard aces
	public int getScore() {
		return score;
	}
	
	public int getNumOfCards(){
		return hand.size();
	}
	

}
