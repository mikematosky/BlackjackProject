package com.skilldistillery.blackjack;

import java.util.Scanner;

/*
 * This is where the magic will happen. I'm trying to suppress the desire
 * to make abstract classes of everything. This is not a kitchen table
 * and it is not a generic casino table. This is a blackjack table. If 
 * I want to expand to more games I would abstract the table type.
 * 
 * It is a virtual table. It displays what your hand is.
 */




public class Table {
	Scanner scan= new Scanner(System.in);
	Dealer dealer= new BlackJackDealer();
	Player human= new Player(getPlayerName());

	public static void main(String[] args) {
		
	}
	
	
	public String getPlayerName() {
		System.out.print("What is your name? ");
		return scan.nextLine();
	}
	
	public void updateTableDisplay() {
		System.out.println("==========================================================");
		System.out.println("||   ");
	}
	

}
