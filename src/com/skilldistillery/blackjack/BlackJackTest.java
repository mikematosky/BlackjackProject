package com.skilldistillery.blackjack;

public class BlackJackTest {
//	public static void main(String[] args) {
//		Dealer dealer= new BlackJackDealer();
//		Player humanPlayer= new Player("Mike");
//		CardTest ct= new CardTest();
//		
//		ct.testDeal(dealer, humanPlayer);
//		
//		
//	}
		
		
	public void testDeal(Dealer dealer, Player player) {	
		try {
			player.receiveACard(dealer.dealtCard());
			player.receiveACard(dealer.dealtCard());
			
			for (Card card : player.getHandList()) {
				card.displayCard();
				System.out.print(" ");
			}
			
			System.out.println(player.getScore());
			
		}catch(Exception e) {
			System.out.println("Fail");
		}
		
	}
}
