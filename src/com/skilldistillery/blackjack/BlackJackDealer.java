package com.skilldistillery.blackjack;

public class BlackJackDealer extends Dealer{

	final int DESIRABLE_SCORE= 17; //Dealer stops at 17
	private String name;
	private Hand hand;
	
	//constructor for eventual addition of more decks
	public BlackJackDealer() {
		hand= new Hand();
		name= "DEALER";
	}
	
	
	public Hand getHand() {
		return hand;
	}

	
	public void receiveACard(Card c) {
		try {
			hand.addToHand(c);
		}catch(Exception e) {//was helpful for troubleshooting
			System.err.println("Dealer refuses to receive Card");
		}
	}
	
	/*
	 *Not building a custom compare
	 *
	 *Checking for a winner in BlackJack
	 */
	public boolean checkForWinner(Hand hand1, Hand hand2) {
		//Player hand is bigger than dealer and less than 21... Or the dealer went over
		if((hand1.getScore() < hand2.getScore() && hand2.getScore() <= 21) || hand1.getScore() > 21) {
			System.out.println("You WIN!");
			return true;
		}
		else {
			System.out.println(this.name+" wins :(");
			return false;
		}
		
	}
	
	//Abstract class has a deck, can dealACard(), Shuffle()

}
