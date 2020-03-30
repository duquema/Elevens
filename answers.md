1. Explain in your own words the relationship between a deck and a card.
A deck is an assortment of cards.

2. Consider the deck initialized with the statements below. How many cards does the deck contain?
      String[] ranks = {"jack", "queen", "king"};
      String[] suits = {"blue", "red"};
      int[] pointValues = {11, 12, 13};
      Deck d = new Deck(ranks, suits, pointValues);
6

3. The game of Twenty-One is played with a deck of 52 cards. Ranks run from ace (highest) down to 2 (lowest). Suits are spades, hearts, diamonds, and clubs as in many other games. A face card has point value 10; an ace has point value 11; point values for 2, ..., 10 are 2, ..., 10, respectively. Specify the contents of the ranks, suits, and pointValues arrays so that the statement
      Deck d = new Deck(ranks, suits, pointValues);
initializes a deck for a Twenty-One game.
String[] ranks = new String[]{"Ace", "King", "Queen", "Jack", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two"}
String[] suits = new String[]{"Hearts", "Clubs", "Spades", "Diamonds"}
int[] values = new int[]{11, 10, 10, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2}

4. Does the order of elements of the ranks, suits, and pointValues arrays matter?
Yes, ranks and point values have to line up, but suits do not matter.

1. Write a static method named flip that simulates a flip of a weighted coin by returning either "heads" or "tails" each time it is called. The coin is twice as likely to turn up heads as tails. Thus, flip should return "heads" about twice as often as it returns "tails."
public static String flip() {
  int r = (int)
  (Math.random() * 2);
  if (r == 0){
    return "tails";
  }
  return "heads";
}

2. Write a static method named arePermutations that, given two int arrays of the same length but with no duplicate elements, returns true if one array is a permutation of the other (i.e., the arrays differ only in how their contents are arranged). Otherwise, it should return false.
public static boolean arePermutations(int[] list1, int[] list2){
  for (int i = 0; i < list1.length; i++){
     boolean hasMatch = false;
     for (int j = 0; j < list2.length; j++){
        if (list2[j] == list1[i]){
           hasMatch = true;
        }
      }
      if (! hasMatch){
        return false;
      }
      return true;
  }
}

3. Suppose that the initial contents of the values array in Shuffler.java are {1, 2, 3,4} For what sequence of random integers would the efficient selection shuffle change values to contain {4, 3, 2, 1}?
0, 1, 1



Buggy1
isEmpty() doesn't determine whether or not the deck is empty
size == 1, but it should = 0

Buggy2
size() does not actually return the size
size value may have been accidentally changed somewhere it wasn't supposed to be

Buggy3
shuffle() method does not work
method returns the same deck, does not shuffle it at all
wrong variables were inserted into the method; k and r should be flipped, so it just ended up returning the same thing

Buggy4
deal() function is WACK
deal method set up incorrectly. it could be a number error with 52 being replaced by 51

Buggy5
either array list or for loops off
error seems to be in the shuffle() method of the deck class- at least effects the functionality of the shuffle() method
in one of the for loops, probably one number off i.e. 1-52 instead of 0-51 or vice versa
