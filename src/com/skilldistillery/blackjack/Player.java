package com.skilldistillery.blackjack;


public class Player {
	private String name;
	private int handsWon;
	private int handsPlayed;
	private Hand playerHand;
	
	public Player(String name) {
		playerHand= new Hand();
		this.name= name;
		handsWon=0;
		handsPlayed=0;
		
	}
	
	//Getters and Setters

	public String getName() {
		return name;
	}

	public int getHandsWon() {
		return handsWon;
	}

	public int getHandsPlayed() {
		return handsPlayed;
	}
	
	public void logRound() {
		this.handsPlayed++;
	}
	
	public void logWin() {
		this.handsWon++;
	}

	public Hand getHand() {
		return playerHand;
	}
	
	public void receiveACard(Card c) {
		try {
			playerHand.addToHand(c);
		}catch(Exception e) {// useful in prior troubleshooting
			System.err.println("Player refuses to receive Card");
		}
	}
	
	public int getScore() {
		return playerHand.getScore();
	}

	
}
