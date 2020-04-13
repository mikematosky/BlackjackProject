package com.skilldistillery.blackjack;

import java.util.Scanner;

public class BlackJack {
	
	static Scanner scan= new Scanner(System.in);
	
	public static void main(String[] args) {
		BlackJack bj= new BlackJack();
		Table table= new Table();
		bj.run(table);
		
	}
	
	public void run(Table table) {
		String input="";
		welcome();
		while(!input.equalsIgnoreCase("quit")) {
			input=""; //problem resetting this fella
			playRound(table);
			System.out.println("%%% Won="+table.getPlayer().getHandsWon()+"      %%% Played="+table.getPlayer().getHandsPlayed());
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("To play another round type any key. To quit type \"quit.\" ");
			input=scan.next();
		}
		System.out.println("Goodbye! Thanks for playing BlackJack!");
		scan.close();
		
	}
	
	public void playRound(Table table) {
		Player player= table.getPlayer();
		BlackJackDealer dealer = table.getDealer();
		int intput=0;
		boolean endRound=false;
		
		player.receiveACard(dealer.dealtCard());
		player.receiveACard(dealer.dealtCard());
		dealer.receiveACard(dealer.dealtCard());
		table.updateTableDisplay();
		//Did Player get 21!?
		if(player.getHand().getScore() == 21) {
			System.out.println("BLACKJACK!!!");
			player.logWin();
			player.logRound();
			player.getHand().clearHand();
			dealer.getHand().clearHand();
		}
		//Nope Player didn't get 21 on the First Deal
		else {
			while(player.getHand().getScore() < 21 && endRound== false) {
				intput=0;
				System.out.println("1. Hit   2. Stand");
				System.out.print("Selection: ");
				intput= userInput1or2();//
								
				//PLAYER CHOOSES TO HIT
				if(intput == 1) {
					player.receiveACard(dealer.dealtCard());
					table.updateTableDisplay();
					//PLAYER HITS AND BUSTS ROUND OVER
					if(player.getHand().getScore() > 21) {
						System.out.println("Player Busts, DEALER Wins.");
						endRound=true;
						endRound(table);
					}
					else if(player.getHand().getScore() == 21 ) {
						intput=2;// Float on down to the STAND position
						System.out.println("Player has achieved 21!");
					}
					else {
						continue;
					}
					intput=0; //problem resetting this guy
				}
				
				//PLAYER STANDS
				if(intput== 2) {
					//Dealer AutoHits to 17 while the player has a score less than or equal to 21
					while (dealer.getHand().getScore() < dealer.DESIRABLE_SCORE) {
						dealer.receiveACard(dealer.dealtCard());
						if(dealer.getHand().getScore()> 21) {
							System.out.println("Dealer Busts! Player wins");
						}
					}
					table.updateTableDisplay();
					//This is the end of the Round
					endRound= true;
					endRound(table);
					intput=0; //problem resetting this guy
				}
				
				//ROUND IS OVER
				
			}//end while First Round Actions
		}//end else
	}
	
	
	/*
	 * Had to break this out into a tiny method to separate and make the main method
	 * more readable. This was my first lesson on what abstraction was, back in the day.
	 */
	public int userInput1or2() {
		//input validation 1 or 2
		int intput=0;
		String input="";
		
		while(true) {
			try {
				input= scan.next();
				intput= Integer.parseInt(input);
			}
			catch(Exception e) {
				System.err.println("Must be either 1 or 2");
				input="";
			}
			
			if( intput != 1 && intput != 2) {
				System.err.println("Must be either 1 or 2");
				input= "";
			}
			else {
				break;
			}		
		}//end input validation
		return intput;
		
	}
	
	/*
	 * Saving more readability and repeated code.
	 */
	public void endRound(Table table) {
		Player player= table.getPlayer();
		BlackJackDealer dealer= table.getDealer();
		
		//Always check for winner. If player won, increment their winlog it didn't like the method in the conditional
		boolean playerWin= dealer.checkForWinner(dealer.getHand(), player.getHand());
		if(playerWin)
			player.logWin();
		//Always Log Round
		player.logRound();
		//Always Clear Hands and reset scores
		player.getHand().clearHand();
		dealer.getHand().clearHand();
		
	}

	
	
	
	public void welcome() {
		System.out.println();
		System.out.println("==========================================================");
		System.out.println("||");
		System.out.println("|| ");
		System.out.println("||");
		System.out.println("||  WELCOME TO BLACKJACK!!!!           "); 
		System.out.println("||");
		System.out.println("|| ");
		System.out.println("||");
		System.out.println("==========================================================");
		System.out.println();
	}

}
