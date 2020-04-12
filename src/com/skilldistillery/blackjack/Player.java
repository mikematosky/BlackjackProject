package com.skilldistillery.blackjack;

import java.util.ArrayList;

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

	public void setName(String name) {
		this.name = name;
	}

	public int getHandsWon() {
		return handsWon;
	}

	public void setHandsWon(int handsWon) {
		this.handsWon = handsWon;
	}

	public int getHandsPlayed() {
		return handsPlayed;
	}

	public void setHandsPlayed(int handsPlayed) {
		this.handsPlayed = handsPlayed;
	}

	public ArrayList<Card> getPlayerHand() {
		return playerHand.getHand();
	}
	
	public void receiveACard(Card c) {
		try {
			playerHand.addToHand(c);
		}catch(Exception e) {
			System.err.println("Player refuses to receive Card");
		}
	}
	
	public int getScore() {
		return playerHand.getScore();
	}

	public void setPlayerHand(Hand playerHand) {
		this.playerHand = playerHand;
	}
	
	
}
