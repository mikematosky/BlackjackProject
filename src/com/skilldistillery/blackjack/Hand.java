package com.skilldistillery.blackjack;

import java.util.ArrayList;

public class Hand {
	private ArrayList<Card> hand;
	private int score;

	public Hand() {
		hand= new ArrayList<>();
	}	// Adds a card to the hand and updates the score
	//
	// I can OOP out an Abstract Class for different Hands, but the soft
	// Ace feature is the only distinction to this class for BlackJack
	public void addToHand(Card c) {
	
		try {
			if(score <= 21) {
				hand.add(c);
				score= score+ c.getValue();
				
				
				//Soft Aces
				if(score > 21) {
					for (Card card : hand) {
						if(card.getRank() == Rank.ACE) {
							score = score- 10;
							break;
						}
					}				
				}
			}
			else {//haven't seen this error message.. possible error handling prior to being called
				System.err.println(" DEALER: You cannot add anymore cards to this hand");
			}
		}catch(Exception e){//was useful in troubleshooting
			System.err.println("Could not Add Card");
		}
	}
	
	
	//Empties the hand
	public void clearHand() {
		hand.clear();
		this.score=0;
		
	}
	
	//? I don't think I use this currently, but might eventually. It allows me to print the hand as an ArrayList with it's
	//properties. A hand of cards is not specific to only this game. 
	public ArrayList<Card> getHand(){
		return hand;
	}
	
	//Returns the total score of the hand
	//Stretch= soft and hard aces
	public int getScore() {
		return score;
	}
	
	//Not used yet, but is useful for stretch goals
	public void setScore(int score) {
		this.score= score;
	}
	
	//Not used yet, but might be useful for stretch goals so I left it in.
	public int getNumOfCards(){
		return hand.size();
	}
	
	@Override
	public String toString() {
		String output="";
		for (Card card : hand) {
			output= output+ card.toString()+" |---| ";
		}
		return output+ "   Score="+this.score;
	}
	

}

