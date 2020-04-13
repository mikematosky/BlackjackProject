package com.skilldistillery.blackjack;

import java.util.Scanner;

/*
 * This is where the magic will happen. I'm trying to suppress the desire
 * to make abstract classes of everything. This is not a kitchen table
 * and it is not a generic casino table. This is a blackjack table. If 
 * I want to expand to more games I would abstract the table type.
 * 
 * It is a virtual table. It displays what your hand is. It is an object
 * used by the Dealer for now.
 */


public class Table {
	Scanner scan= new Scanner(System.in);
	Player human;
	BlackJackDealer dealer= new BlackJackDealer();
	
	public Table() {
		human= new Player(getPlayerName());		
	}
	
	public String getPlayerName() {
		System.out.print("What is your name? ");
		return scan.nextLine();
	}
	
	public void initiateRound(Table table) {
		human.receiveACard(dealer.dealtCard());
		human.receiveACard(dealer.dealtCard());
		
		dealer.receiveACard(dealer.dealtCard());
	}
	
	public BlackJackDealer getDealer() {
		return dealer;
	}
	
	public Player getPlayer() {
		return human;
	}
		
	
	public void updateTableDisplay() {
		System.out.println("==========================================================");
		System.out.println("||");
		System.out.println("|| "+"DEALER=  "+dealer.getHand().toString());
		System.out.println("||");
		System.out.println("||");
		System.out.println("|| "+human.getName()+"=  " +human.getHand().toString());
		System.out.println("||");
		System.out.println("==========================================================");
	}
	

}
