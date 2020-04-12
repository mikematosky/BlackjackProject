package com.skilldistillery.blackjack;

public class CardTest {
	public static void main(String[] args) {
		Dealer dealer= new BlackJackDealer();
		Player humanPlayer= new Player("Mike");
		CardTest ct= new CardTest();
		
		ct.testDeal(dealer, humanPlayer);
		
		
	}
		
		
	public void testDeal(Dealer dealer, Player player) {	
		try {
			player.receiveACard(dealer.dealtCard());
			player.receiveACard(dealer.dealtCard());
			//dealer.dealACard(humanPlayer.getPlayerHand());
			
			for (Card card : player.getPlayerHand()) {
				card.displayCard();
				System.out.print(" ");
			}
			
			System.out.println(player.getScore());
			
		}catch(Exception e) {
			System.out.println("Fail");
		}
		
	}
}
