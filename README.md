# BlackJack Project

## About BlackJack
This is a Blackjack game written in the Object Oriented Programming (OOP) style.
The rules are simple: Get as close to 21 without going over and beat the dealer
who has a strict rule of hitting until the dealer's score is at least 17.

The class files mimic the real life Blackjack experience. The game opens a **TABLE** with a
**BLACKJACKDEALER** (which inherits properties from the abstract class **DEALER**) and a human **PLAYER**. Each of these components hold a **HAND** which consists of **CARDS** from a **DECK**. The actual BlackJack file holds the main which holds much of the game's logic.  

## File List
|---|
1. **BlackJack**- *Holds the main method. Creates a table and follows game logic.*
2. **BlackJackDealer** *Is a type of Dealer and has unique attributes associated with Blackjack.*
3. **BlackJackTest**- *A program to hold tests before the game class was built. Tested the class objects before creating the game class.*
4. **Card**- *The smallest class object and contains a rank, suit, and value by use of enums.*
5. **Dealer**- *This is an abstract class that holds universal attributes of a dealer. Due to
the OOP mindset, this project can grow much easier to accept different games which would
require different dealers*
6. **Deck**- *This builds and holds a list of 52 cards, a standard deck. It is held by the
BlackJackDealer, but can be used by other dealers as well. A better name should be StandardDeck
because it doesn't contain Jokers and also a Deck can hold different cards like UNO cards. I
didn't change anything because this was mostly a pre-built class and it was getting pedantic.*
7. **Hand**- *A hand is practically like a small personal list of cards. It needs to be cleared
 at the end of a round and it needs to add additional cards if requested. It is also where
score is tabulated.*
8. **Player**- *The player holds a hand of cards and follows through the logic of the game. In
this project there is only one player, played by the human with inputted directions.*
9. **Table**- *The table is where the display happens and in the real world is where the dealer
and the player play the game. The table actually holds the player and the dealer.*
|---|


## Notes
- I know the GUI could be improved.
- I wanted the Dealer to be a player, but I also wanted to bestow the responsibility of
deck maintenance to a separate class. The dealer shuffles the deck, deals cards, and has a
special logic to it and it didn't feel right keeping it as a player.
- The Test class is mostly blank, but had several tests used. This is practically what's
visible leftover from a scratch paper. I also used JUnit5 for a portion(between commits), but I
was a little uncomfortable and need more review.
- Shuffling is handled by the dealer when he/she gets to decksize 0 and repopulates with a new
deck. So technically, there could be a round where you end up with duplicate cards. Neat.

## Hindsight / Lessons / What I Learned / Reflections
- Testing is a full time job, but TDD was worth it.
- Don't mess around- make the scanner static.
- It's not always Eclipse's fault if it looks glitched. It's probably in an infinite loop and
just not printing.
- Don't force interfaces. I tried to implement an interface "isAPlayer," but all of the fields
are immutable and it didn't work with the design.
- I appreciate comparators. I didn't use one, but if I had more energy after hours stuck on
small, exhausting logic errors.
- When the game is using a data structure, I must find where the data structure exists in my
project to manipulate it. I had a hard time adding cards to a hand because I was trying to
interact with the dealer and player class, but for a period I was translating a "hand" back
and forth to interact with the game (ie getting a score... it's the hand's score not the
player's and the deck is the object that gets shuffled).
- OOP has no limits on how strict or loose it is in the design. I almost found myself creating
abstract classes just because they exist in the real world and I had fields in abstract classes
which I would eventually consider useless.
- Refactoring is definitely necessary.
- My original programming immersion taught me to resort to encapsulating complex code and
repeated statements in order to maintain readability. I don't think I've used it as much lately,
until I got stuck with logic errors and started increasing readability until I found them.
- I don't think I've ever built menus and input validation the same way twice.
- Initialize everything.




# Lessons Learned and Reinforced
+ Reinforced OOP principles (APIE)
+ Reinforced UML Design
+ Real-world Object classes.
+ Java Abstract classes
+ Java ArrayList
+ Java Try/Catch
+ Java Enums
+ Refactoring


# Technology Used
* Eclipse
* Terminal
* Git
* Atom
* JUnit5
