package com.skilldistillery.blackjack;

public class Card {
  private Rank rank;
  private Suit suit;
  //private boolean isVisible; From a time where I was trying to make a card "face down"
  
  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }
  
  public int getValue() {
    return rank.getValue();
  }
  
  public Rank getRank() {
	  return this.rank;
  }
  
  public Suit getSuit() {
	  return this.suit;
  }

  @Override //didn't need the hashCode
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((rank == null) ? 0 : rank.hashCode());
    result = prime * result + ((suit == null) ? 0 : suit.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Card other = (Card) obj;
    if (rank != other.rank)
      return false;
    if (suit != other.suit)
      return false;
    return true;
  }

  @Override //I didn't like the Stringbuilder object.
  public String toString() {
	
    return rank+" of "+suit;
  }
  
  
}
