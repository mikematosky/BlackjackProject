package com.skilldistillery.blackjack;

public class CardTest {
	public static void main(String[] args) {
		Deck deck= new Deck();
		Dealer dealer= new BlackJackDealer();
		Player humanPlayer= new Player("Mike");
		dealer.dealACard(humanPlayer.getPlayerHand());
		dealer.dealACard(humanPlayer.getPlayerHand());
		
		for (Card card : humanPlayer.getPlayerHand().getHand()) {
			card.displayCard();
		}
	}
}
