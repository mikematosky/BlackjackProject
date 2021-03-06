package com.skilldistillery.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
  private List<Card> cards;

  public Deck() {
    cards = createDeck();
  }
  
  private List<Card> createDeck(){
    List<Card> deck = new ArrayList<>(52);
    for(Suit s : Suit.values()) {
      for(Rank r : Rank.values()) {
        deck.add(new Card(r, s));
      }
    }
    Collections.shuffle(deck);
    return deck;
  }
  
  
  public int checkDeckSize() {
    return cards.size();
  }
  
  //A deck can be shuffled
  public void shuffle() {
    Collections.shuffle(cards);
  }
  
  //A deck provides the card to be dealt
  public Card dealCard() {
    return cards.remove(0);
  }
  
}
