package com.skilldistillery.blackjack;

public class CardTest {
	public static void main(String[] args) {
		Dealer dealer= new BlackJackDealer();
		Player humanPlayer= new Player("Mike");
		CardTest ct= new CardTest();
		
		ct.testDeal(dealer, humanPlayer);
		
		
	}
		
		
	public void testDeal(Dealer dealer, Player humanPlayer) {	
		try {
			humanPlayer.receiveACard(c);
			humanPlayer.receiveACard(dealer.getDeck().dealCard());
			//dealer.dealACard(humanPlayer.getPlayerHand());
			
//			for (Card card : humanPlayer.getPlayerHand()) {
//				card.displayCard();
//			}
		}catch(Exception e) {
			System.out.println("Fail");
		}
		
	}
}
