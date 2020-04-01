1. remove 5 of spades & 6 of clubs
remove 5 of clubs & 6 of clubs
2. Yes, because even if two of the cards are a pair there will still be one card left over
3. I don't think so, because it doesn't matter what order the cards are in, because any pair of cards can be selected. If I have the option to choose between two different pairs, I can just choose one that turn and the next the next turn, which will affect nothing except the placement of the next cards, which has no effect of the game.

1. What items would be necessary if you were playing a game of Elevens at your desk (not on the computer)? List the private instance variables needed for the ElevensBoard class.
Deck of cards
desk
board

2. Write an algorithm that describes the actions necessary to play the Elevens game.
Have to be able to deal, pair, and discard cards

3. Now examine the partially implemented ElevensBoard.java file found in the Activity7 Starter Code directory. Does the ElevensBoard class contain all the state and behavior necessary to play the game?
No

4. ElevensBoard.java contains three helper methods. These helper methods are private because they are only called from the ElevensBoard class.
  a. Where is the dealMyCards method called in ElevensBoard?
  After initializing a new deck, and after shuffling the deck.
  b. Which public methods should call the containsPairSum11 and containsJQK methods?
  the replaceSelectedCards the anotherPlayIsPossible and the isLegal methods
  c. It’s important to understand how the cardIndexes method works, and how the list that it returns is used. Suppose that cards contains the elements shown below. Trace the execution of the cardIndexes method to determine what list will be returned. Complete the diagram below by filling in the elements of the returned list, and by showing how those values index cards. Note that the returned list may have less than 9 elements.
  Jack of Hearts, Six of Clubs, Two of Spades, Ace of Spades, Four of Hearts
  d. System.out.println(cIndexes);
  e. isLegal, to make sure the cards selected aren't null
