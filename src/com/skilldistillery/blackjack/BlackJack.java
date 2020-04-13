package com.skilldistillery.blackjack;

import java.util.Scanner;

public class BlackJack {
	
	Scanner scan= new Scanner(System.in);
	
	public static void main(String[] args) {
		BlackJack bj= new BlackJack();
		Table table= new Table();
		bj.welcome();
		bj.run(table);
		
	}
	
	public void run(Table table) {
		Player player= table.getPlayer();
		BlackJackDealer dealer= table.getDealer();
		String input1="";
		String quit="";
		int intput=0;
		boolean winner=false;
		
		//game loop
		while(true) {
			
			//Start a Round
			initiateRound(player,dealer);
			table.updateTableDisplay();
			
			//Let player hit until 21
			while((player.getHand().getScore()< 21 || intput !=2)&& winner== false) {
				//player went over and loses
				if(player.getHand().getScore()>21) {
					System.out.println("BUST! You lose :(");
					winner= true;
					player.getHand().clearHand();
					player.logRound();
				}
				//Stop if player has 21
				else if(player.getHand().getScore() == 21) {
					System.out.println(player.getName()+" scored 21 and must Stay!");
					break;
				}
				//select Hit or Stay
				else {
					System.out.println("1. Hit   2. Stay");
					System.out.print("Selection: ");
					try {
						intput= scan.nextInt();
						//Choose Hit
						if(intput==1) {
							player.receiveACard(dealer.dealtCard());
							table.updateTableDisplay();
						}//Choose Stand
						else if(intput==2) {
							//Dealer AutoHits to 17 while the player has a score less than or equal to 21
							while (dealer.getHand().getScore() < dealer.DESIRABLE_SCORE && player.getHand().getScore() <= 21) {
								dealer.receiveACard(dealer.dealtCard());
							}
							
							//ROUND COMPLETE- update message
							table.updateTableDisplay();							
							// if boolean returns a win for the player it will display a winning line and log the win.
							if(dealer.checkForWinner(dealer.getHand(), player.getHand())) {
								player.logWin();
							}
							System.out.println("Player Wins= "+player.getHandsWon()+"     Player losses="+(player.getHandsPlayed()-player.getHandsWon()));
							System.out.println("Type \"quit\" to exit or any key to play again!");
							quit =scan.next();
							//if they don't type quit
							if(quit.equalsIgnoreCase("quit")) {
								System.out.println("Goodbye! Thanks for Playing BlackJack!!!");
								scan.close();
								System.exit(0);
							}else {
								//Start a Round
								dealer.getHand().clearHand();
								player.getHand().clearHand();
								initiateRound(player,dealer);
								table.updateTableDisplay();
								
							}
						}
						else {
							System.err.println("Invalid input");
						}
						
							
					}catch(Exception e) {
						System.err.println("Invalid input");
						intput=2;
						input1="";
					}//End braces of my madness
				}
			}
			
			
		}
		
	}
	
	/*
	 * Each round starts the same
	 */
	public void initiateRound(Player player, BlackJackDealer dealer) {
		player.receiveACard(dealer.dealtCard());
		player.receiveACard(dealer.dealtCard());
		dealer.receiveACard(dealer.dealtCard());
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
